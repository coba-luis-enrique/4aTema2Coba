/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aproximaciones;

/**
 *
 * @author Familiadc
 */
public class filaMetodo {
    private int iteraciones;
    private double xi;
    private double errorDeseado;
    private double gx;


    
    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getErrorDeseado() {
        return errorDeseado;
    }

    public void setErrorDeseado(double errorDeseado) {
        this.errorDeseado = errorDeseado;
    }

    public double getGx() {
        return gx;
    }

    public void setGx(double gx) {
        this.gx = gx;
    }

    @Override
    public String toString() {
        return "filaMetodo{" + "iteraciones=" + iteraciones + ", xi=" + xi + ", errorDeseado=" + errorDeseado + ", gx=" + gx + '}';
    }
    
    

   

  
}
