/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tirate una frase");
        String frase = sc.nextLine();
        String letras = frase.substring(3, 5);
        System.out.println(letras);
    }
    
}
