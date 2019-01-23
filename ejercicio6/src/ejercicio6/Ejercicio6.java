/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author mtejada
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 //sc.useDelimiter("[:\\s]");
        int n = sc.nextInt();
        //int n2 = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" es divisible por 2 carajoo");
            }else{
            System.out.println(n+" se la come");
        }
        
        
                
      
    }
    
}
