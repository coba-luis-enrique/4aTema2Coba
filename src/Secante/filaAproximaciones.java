/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secante;

/**
 *
 * @author cobak
 */
public class filaAproximaciones {
   
     private int i;
    private double xi, gxi, error,Aprox;

    @Override
    public String toString() {
        return "filaAproximaciones{" + "i=" + i + ", xi=" + xi + ", gxi=" + gxi + ", error=" + error + '}';
    }
    
    public void setI(int i) {
        this.i = i;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setGxi(double gxi) {
        this.gxi = gxi;
    }

    public void setError(double error) {
        this.error = error;
    }
    
    public void setAprox(double Aprox){
        this.Aprox=Aprox;
    }
    
    
    public int getI() {
        return i;
    }

    public double getXi() {
        return xi;
    }

    public double getGxi() {
        return gxi;
    }

    public double getError() {
        return error;
    }
    
    public double getAprox(){
        return Aprox;
    }
    
}
