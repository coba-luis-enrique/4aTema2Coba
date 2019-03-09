/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secante;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cobak
 */
    
public class tablaSecante extends AbstractTableModel{
    public String[] columnas={
        "i", "Xi-1", "Xi", "F(xi-1)" , "F(xi)", "x2", "Error","Aproximacion"
    };
    
    public Class [] tipos ={
        Integer.class, Double.class, Double.class, Double.class, 
        Double.class, Double.class, Double.class ,Double.class
    };
    
    private ArrayList<filaSecante> filas;
    
    public tablaSecante(ArrayList<filaSecante> filas){
        this.filas = filas;
    }
    
    @Override
    public int getRowCount() {
        return this.filas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        filaSecante fila = this.filas.get(i);
        switch(i1){
            case 0: return fila.getI();
            case 1: return fila.getXi();
            case 2: return fila.getXs();
            case 3: return fila.getFxi();
            case 4: return fila.getFxs();
            case 5: return fila.getFxr();
            case 6: return fila.getError();
            case 7: return fila.getAprox();
        }
        return null;
    }

    @Override
     public boolean isCellEditable(int i, int i1) {   
         return false;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return this.tipos[i];
    }

    @Override
    public String getColumnName(int i) {
       return this.columnas[i];
    }
    
}
