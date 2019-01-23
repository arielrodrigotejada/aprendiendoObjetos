/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author mtejada
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        while(n<100){
            n++;
            if((n % 2 == 0) && (n % 3 == 0)){
                System.out.println(n);
            }
            
        }
    
    }
}