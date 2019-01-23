/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9posta;

import java.util.Scanner;

/**
 *
 * @author mtejada
 */
public class Ejercicio9posta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float precio = sc.nextFloat();
        float precioIva =(float) (precio * 1.21);
        System.out.println(precioIva);
    }
    
}
