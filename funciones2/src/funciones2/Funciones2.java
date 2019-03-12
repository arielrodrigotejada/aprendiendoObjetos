/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones2;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int resultadoPosta= suma(4,5);
        System.out.println(resultadoPosta);
    }
    public static int suma(int n1,int n2) {
       int resultado = n1 + n2;
      return resultado;
    }
}
