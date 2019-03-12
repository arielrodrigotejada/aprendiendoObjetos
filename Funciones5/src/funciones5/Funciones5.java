/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double numero = numerosRandom();
        System.out.println(numero);
       
    }
    public static double numerosRandom(){
         double numeroMayor= 0;
        double numeroMenor= 0;
        double Random =0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("tirame un numero");
        double n1 = sc.nextDouble();
        System.out.println("tira otro");
        double n2 = sc.nextDouble();
        if(n1<n2){
            numeroMayor = n2;
            numeroMenor = n1;
        }else if(n1==n2){
            
            
        }else{
            numeroMayor = n1;
            numeroMayor = n2;
        }
        
        if(n1 != n2){
        for(int i=0;i<1;i++){
            Random =numeroMenor +  (double)(Math.random()*(numeroMayor - numeroMenor));
            
        }
        }else{
            System.out.println("no se puede loca");
        }return Random;
    }
}
