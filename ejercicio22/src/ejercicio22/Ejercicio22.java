/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";

        int contador = 0;
        char[] listadoLetras = frase.toCharArray();
        //habías hecho que comience con 1, debería empezar con cero:  https://www.tutorialspoint.com/java/java_string_charat.htm  The string indexes start from zero.
         
        for (int i = 0; i < frase.length() ; i++) {

            //forma 1 de resolver esto 
            if (frase.charAt(i) == 'a' || (frase.charAt(i) == 'e') || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador++;
            }

            //forma 2 
           /* if (listadoLetras[i] == 'a' || listadoLetras[i] == 'e' || listadoLetras[i] == 'i' || listadoLetras[i] == 'o' || listadoLetras[i] == 'u') {
                contador++;
            }*/
        }
        System.out.println(contador);

    }

}
