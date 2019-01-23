/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mtejada
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contrasenia = "putoelquelee";
        Scanner sc = new Scanner(System.in);
        String intentoDeContrasenia;
        int numDeIntentos = 0;

        do {
            System.out.println("ingrese la contraseña");
            intentoDeContrasenia = sc.nextLine();
            if (intentoDeContrasenia.equals(contrasenia)) {
                System.out.println("buena prro");
            } else {
                System.out.println("la comiste");
                numDeIntentos++;
            }
        } while (!intentoDeContrasenia.equals(contrasenia) && numDeIntentos<3);

        /*if (intentoDeContrasenia.equals(contrasenia)) {
            System.out.println("buena prro");

        } else {
            System.out.println("la comiste, te quedan 2 intentos");
        }
        String intentoDeContrasenia2 = sc.nextLine();
        if (intentoDeContrasenia2.equals(contrasenia)) {
            System.out.println("buena prro");
        } else {
            System.out.println("la comiste otra vez, te queda un intento salame");
        }
        String intentoDeContrasenia3 = sc.nextLine();
        if (intentoDeContrasenia3.equals(contrasenia)) {
            System.out.println("buena prro");
        }*/
    }
}
