/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tirame una frase");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        for(int i = 0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
        
    }
    
}
