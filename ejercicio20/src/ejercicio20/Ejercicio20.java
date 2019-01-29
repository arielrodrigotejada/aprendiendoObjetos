/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("tirame un numero");
        int numero = sc.nextInt();
        if (numero <= 1) {
            System.out.println("No es primo de una");
        } else if ((numero % 2 == 0) || (numero % 3 == 0) || (numero % 5 == 0) || (numero % 7 == 0)) {
            System.out.println("no es primo te la comes");
        }else{
            System.out.println("es primo");
        }

    }
}
