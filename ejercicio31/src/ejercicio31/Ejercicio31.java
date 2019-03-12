/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tirame una frase");
        String frase = sc.nextLine();
         String fraseSinEspacios = frase.replaceAll(" ", "");
        int numeroDeLetras = fraseSinEspacios.length();
        
        
        System.out.println(numeroDeLetras);
    }
    
}
