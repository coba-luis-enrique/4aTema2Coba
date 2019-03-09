/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aproximaciones;

import java.util.ArrayList;

/**
 *
 * @author Familiadc
 */
public class metodoAproximaciones {
   private double valInicial;
   private double error;

    public metodoAproximaciones(double valInicial, double error) {
        this.valInicial = valInicial;
        this.error = error;
    }

    public double getEcuacion(double x){
        return Math.pow(Math.E,-(x));
    }
    
    public double getErrorAbs(double xI){
     return Math.abs((this.getEcuacion(xI)-xI)/this.getEcuacion(xI));
    }
    
   public ArrayList<filaMetodo> aproximacion(){
        int i = 1;
        double errorCalculado = 1;
        double error;
        
        ArrayList<filaMetodo> liSoluciones= new ArrayList<>();
        
        while(errorCalculado > this.error){
            error = this.getErrorAbs(this.valInicial);
            
            filaMetodo flMetodo = new filaMetodo();
            flMetodo.setIteraciones(i);
            flMetodo.setXi(this.valInicial);
            flMetodo.setGx(this.getEcuacion(this.valInicial));
            flMetodo.setErrorDeseado(error);
            
            liSoluciones.add(flMetodo);
            
            this.valInicial = flMetodo.getGx();
            errorCalculado = flMetodo.getErrorDeseado();
            i++;
        }
        return liSoluciones;
   }
    
   public  tablaAproximaciones getTablaAproximacciones(){
       tablaAproximaciones modelo = null;
         ArrayList<filaMetodo> lista = this.aproximacion();
           if(lista!=null){
               
            modelo = new tablaAproximaciones(lista);
            
        }
        return modelo;
       
   }
}