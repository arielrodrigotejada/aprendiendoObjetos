/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
      
       String  fraseSinE ="";

        for (int i = 0; i < frase.length(); i++) {

            
               fraseSinE =  frase.replaceAll("a","e");
            
            
            
        }
        System.out.println(fraseSinE);
    }
}
