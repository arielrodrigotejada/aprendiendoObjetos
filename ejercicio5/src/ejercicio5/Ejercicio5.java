/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author mtejada
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String radio = JOptionPane.showInputDialog("¿cual es el radio?");
             double radio_posta = Double.parseDouble(radio); 
             double respuesta =  Math.PI * (Math.pow(radio_posta, 2));
             System.out.println(respuesta);
    }
    
}
