/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones6;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int FactorialPosta = factorial(numero);
        System.out.println(FactorialPosta);
    }

    public static int factorial(int n) {
        int factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            if (n > 0) {
                n--;
            } else {
                n++;
            }

        }
        return factorial;
    }
}
