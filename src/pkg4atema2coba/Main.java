package pkg4atema2coba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
       VentanaPrincipal prin = new VentanaPrincipal();
       prin.setTitle("Metodos de Solución de Ecuaciones");
       prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       prin.setSize(628,420);
       prin.setResizable(false);
       prin.setLocationRelativeTo(null); //centrar
       prin.setVisible(true);
   
    }
    
}
