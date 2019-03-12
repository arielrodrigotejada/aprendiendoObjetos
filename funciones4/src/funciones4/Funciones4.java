/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones4;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Funciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letraPosta = sc.nextLine();
        char ahoraLetraPosta = letraPosta.charAt(0);
        int valorPosta = valorASCII(ahoraLetraPosta);
        System.out.println(valorPosta);
    }

    public static int valorASCII(char letra) {
        int ValorASCII = Character.getNumericValue(letra);
        return ValorASCII;
    }
}
