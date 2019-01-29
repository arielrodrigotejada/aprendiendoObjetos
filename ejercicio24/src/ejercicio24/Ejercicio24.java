/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import javax.print.DocFlavor;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
          int ascii= 0;
          String todoJunto = "";
                for (int i = 0; i < frase.length() ; i++){
                  ascii = (int) frase.charAt(i);
                   todoJunto = todoJunto +" "+Integer.toString(ascii) ;
               
        } 
        
        String resultado = todoJunto; 
        System.out.print(resultado);
    }  
    
    
}
