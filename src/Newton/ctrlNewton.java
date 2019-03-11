/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newton;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cobak
 */
public class ctrlNewton {
   //Variables
   private double xi, errorDeseado;


    public ctrlNewton(double xi, double errorDeseado) { //Constructor
        //punteros 
        this.xi = xi;
        this.errorDeseado = errorDeseado;
    }
    
    
    public double getEvaluacion(double x){
       return (Math.pow((Math.E),-x))-x;
   }
    
   public double getEvaluacionD(double x){
       return ((Math.pow((Math.E),-x))*-1)-1;
   }
    
    public double getRaiz(double xi){
       return (xi) - (getEvaluacion(xi)/getEvaluacionD(xi));
   }
    
    private double getError(double xrActual, double xrInicial){
       return Math.abs((xrActual-xrInicial)/xrActual); 
   }
    
    public ArrayList<filaNewton> Newton(){
       int i =1;
       double errorCalculado=1;
       ArrayList<filaNewton> listaSoluciones = new ArrayList<>();
       double x2;
           while(errorCalculado > this.errorDeseado){
               
               x2 = this.getRaiz(this.xi);
               
               filaNewton fila = new filaNewton();
               
               fila.setI(i);
               fila.setXi(this.xi);
               fila.setFxi(this.getEvaluacion(fila.getXi()));
               fila.setFdxi(this.getEvaluacionD(fila.getXi()));     
               fila.setX2(x2);
               double xrAnterior = fila.getXi();
               double xrActual = fila.getX2();
               errorCalculado = this.getError(xrActual, xrAnterior);
               fila.setError(errorCalculado);
               this.xi = fila.getX2();
               listaSoluciones.add(fila);
               i++;
           }
     
    return listaSoluciones;
   }
   
   public tablaNewton getTablaNewton(){
       tablaNewton modelo = null;
       ArrayList<filaNewton> lista = this.Newton();
       
       if(lista != null)
            modelo = new tablaNewton(lista);
      
       return modelo;
   }
    
}
