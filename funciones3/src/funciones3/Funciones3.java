/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones3;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        bosteroloco(numero);
    }
    public static void bosteroloco(int n){
        if(n<0){
            System.out.println("es menor, te vas en cana");
        }else if(n==0){
            System.out.println("es igual");
            
        }else{
            System.out.println("es mayor,zafaste");
        }
    }
}
