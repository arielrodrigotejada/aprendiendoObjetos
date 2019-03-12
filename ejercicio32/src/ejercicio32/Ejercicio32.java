/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tirame una palabra");
        String palabra1 = sc.nextLine();
        System.out.println("tirame otra palabra y te digo si es igual a la otra");
        String palabra2 = sc.nextLine();
        if(palabra1.equals(palabra2)){
            System.out.println("son iguales");
        } else {
             System.out.println("te cagas, no son iguales");
        }
    }

}
