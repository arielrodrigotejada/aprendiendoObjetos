/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import jdk.nashorn.tools.ShellFunctions;

/**
 *
 * @author mtejada
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Dame la cantidad de ventas ");
        int nVentas = sc.nextInt();
        double[] ventas = new double[nVentas];
        double sumaDeVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Dame el precio del producto " + (i + 1));
            ventas[i] = sc.nextDouble();

            sumaDeVentas += ventas[i];
        }
        

        System.out.println("The sum is " + sumaDeVentas);
    }

}
