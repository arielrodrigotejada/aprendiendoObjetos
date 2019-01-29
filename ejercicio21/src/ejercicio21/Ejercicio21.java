/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        
      
            
        while(numero<100){
            numero++;
         if((numero==2 || numero==3 || numero==5 ||numero==7) ||((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 != 0) && (numero % 7 != 0))){
                System.out.println(numero);
            }   
        }
        
    }
    
}
