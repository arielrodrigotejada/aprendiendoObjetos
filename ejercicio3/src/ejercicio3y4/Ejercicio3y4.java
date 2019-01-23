/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3y4;

import javax.swing.JOptionPane;

/**
 *
 * @author mtejada
 */
public class Ejercicio3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String nombre = "teja";
        System.out.println("bienvenido "+nombre);*/
        
       String respuesta = JOptionPane.showInputDialog("¿cual es tu nombre?");
        System.out.println("bienvenido "+respuesta);
        
        JOptionPane.showMessageDialog(null,"bienvenido "+respuesta);
    }
    
}
