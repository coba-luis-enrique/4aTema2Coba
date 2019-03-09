/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aproximaciones;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Familiadc
 */
public class tablaAproximaciones extends AbstractTableModel{
public String [] columnas={"i","Xi","Error","Gx"};

public Class [] tipos ={
        Integer.class, Double.class, Double.class, Double.class
    };

private ArrayList<filaMetodo> filas ;


public tablaAproximaciones(ArrayList<filaMetodo> filas) {
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
    public Object getValueAt(int rowIndex, int columnIndex) {
       filaMetodo fila = this.filas.get(rowIndex);
       switch(columnIndex){
           case 0: return fila.getIteraciones();
           case 1: return fila.getXi();
           case 2: return fila.getGx();
           case 3: return fila.getErrorDeseado();
       }
        
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return this.tipos[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
//super.getColumnName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
