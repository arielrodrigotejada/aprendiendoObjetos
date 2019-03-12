/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.println("tirame un numero mayor a 1");
             numero = sc.nextInt();
        
        }while(numero<=1);
        
         int resultado = numero + 1;
         System.out.println(resultado);
                
    }
    
}
