/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase =" ";
        String todoJunto = "";
        while(!frase.equals("")){
            System.out.println("tirame una frase");
             frase = sc.nextLine();
             todoJunto = todoJunto +" "+ frase;
        }
        System.out.println(todoJunto);
    }
    
}
