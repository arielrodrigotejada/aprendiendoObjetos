/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tirame una frase");
        String frase = sc.nextLine();
        System.out.println("Queres la frase en mayuscula o minuscula?");
        String respuesta = sc.nextLine();
        if(respuesta.equals("mayuscula") ){
            String fraseMayuscula =frase.toUpperCase();
            System.out.println(fraseMayuscula);
        }else if(respuesta.equals("minuscula") ){
           String fraseMinuscula = frase.toLowerCase();
            System.out.println(fraseMinuscula);
        }else{
            System.out.println("no es lo que pedi y ahora el mundo va a explotar");
        }
    }
    
}
