/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones7;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        if( primo(sc.nextInt())){
            System.out.println("es primo");
            
            
        }else{
            System.out.println("no es primo");
        }
    }
    public static Boolean primo(int numero){
        Boolean respuesta = true;
        if (numero <= 1) {
          respuesta = false ;
        } else if ((numero % 2 == 0) || (numero % 3 == 0) || (numero % 5 == 0) || (numero % 7 == 0)) {
            respuesta = false;
        }else{
            respuesta = true;
        }
        return respuesta;
    }
}
