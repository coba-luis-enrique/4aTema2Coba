/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secante;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cobak
 */
public class ctrlSecante {
   //Variables
   private double xi, xs, errorDeseado;
   private int iteraciones;

    public ctrlSecante(double xi, double xs, double errorDeseado) { //Constructor
        //punteros 
        this.xi = xi;
        this.xs = xs;
        this.errorDeseado = errorDeseado;
    }
    
    public boolean esRangoValido(){
       boolean valido = false;
       if(this.getEvaluacion(this.xi)*this.getEvaluacion(this.xs) != 0)
           valido = true;
       return valido;
   }
    
    public double getEvaluacion(double x){
       return Math.pow(x,2)-(3*x)-4;
   }
   
    
    public double getRaiz(double xi, double xs){
       return xi - getEvaluacion(xi) * (xs - xi) / (getEvaluacion(xs) - getEvaluacion(xi));
   }
    
    private double getError(double xrActual, double xrInicial){
       return ((xrActual-xrInicial)/xrActual)*100;
   }
    
    public ArrayList<filaSecante> Secante(){
       int i =1;
       double errorAproximacion;
       double errorCalculado=1;
       ArrayList<filaSecante> listaSoluciones = new ArrayList<>();
       double xr;
       if(this.esRangoValido()){
           while(errorCalculado > this.errorDeseado){
               
               xr = this.getRaiz(this.xi, this.xs);
               
               filaSecante fila = new filaSecante();
               
               fila.setI(i);
               fila.setXi(this.xi);
               fila.setXs(this.xs);
               fila.setXr(xr);
               fila.setFxi(this.getEvaluacion(fila.getXi()));
               fila.setFxr(fila.getXr());
               fila.setFxs(this.getEvaluacion(fila.getXs()));
               fila.setError(this.getEvaluacion(fila.getFxr()));
               
               errorCalculado = this.getEvaluacion(fila.getFxr());
               errorAproximacion = this.getError(fila.getXr(),fila.getXs());
               fila.setAprox(errorAproximacion);
               this.xi = fila.getXs();
               this.xs = fila.getXr();
               listaSoluciones.add(fila);
               i++;
           }
       }else{
           listaSoluciones = null;
           JOptionPane.showMessageDialog(null, "No hay Solución");
       }
    return listaSoluciones;
   }
   
   public tablaSecante getTablaSecante(){
       tablaSecante modelo = null;
       ArrayList<filaSecante> lista = this.Secante();
       
       if(lista != null)
            modelo = new tablaSecante(lista);
      
       return modelo;
   }
    
}
