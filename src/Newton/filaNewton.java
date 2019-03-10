/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newton;

/**
 *
 * @author cobak
 */
public class filaNewton {
    private int i;
    private double xi,x2,fxi,fdxi,error;

    @Override
    public String toString() {
        return "filaSecante{" + "i=" + i + ", xi=" + xi + ", xs=" + ", xr=" + ", fxi=" + fxi + ", fxs=" + ", fxr=" + ", error=" + error + '}';
    }
    

    public void setI(int i) {
        this.i = i;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public void setFdxi(double fdxi) {
        this.fdxi= fdxi;
    }

    public void setError(double error) {
        this.error = error;
    }
   

    public int getI() {
        return i;
    }

    public double getXi() {
        return xi;
    }

    public double getX2() {
        return x2;
    }

    public double getFxi() {
        return fxi;
    }

    public double getFdxi() {
        return fdxi;
    }

    public double getError() {
        return error;
    }    
}
