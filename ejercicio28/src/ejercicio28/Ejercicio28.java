/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("tirame una frase macanuda");
        String fraseMacanuda = sc.nextLine();
       String fraseSinEspacio = fraseMacanuda.replaceAll(" ", "");
        System.out.println(fraseSinEspacio);
    }
    
}
