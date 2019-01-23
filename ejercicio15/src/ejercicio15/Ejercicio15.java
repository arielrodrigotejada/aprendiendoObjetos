/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mtejada
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        double valorcafetero=0;
        do {
            System.out.println("ingrese numero positivo");
           valorcafetero= sc.nextDouble();
           
        }
        while (valorcafetero<0);
        System.out.println(valorcafetero);
        
        
    }
    
}
