/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TejaART
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = 0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
       do{
           System.out.println("tirame un numero entero positivo");
       
         numero = sc.nextInt();
       }while(numero<0);
         String numeroString = String.valueOf(numero);
         
         System.out.println(numeroString.length());
        
       
    
        
    }
    
}
