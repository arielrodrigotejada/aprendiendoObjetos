/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mtejada
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] datos = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("introdusca valor " + (i + 1));
            datos[i] = sc.nextDouble();
        }
        double cuadradoDeB = Math.pow(-datos[1], 2);

        double restoDelDiscriminante = 4 * datos[0] * datos[2];

        double discriminante = cuadradoDeB - restoDelDiscriminante;

        double discriminanteConRaiz = Math.sqrt(discriminante);
        if (discriminante < 0) {
            System.out.println("te la comes por que no se puede");

        } else if (discriminante == 0) {
            double respuesta = -datos[1] / datos[0];
            System.out.println("felicidades, la solucion es " + respuesta );
        } else {
            double respuesta1 = (-datos[1] - discriminanteConRaiz) / datos[0];
            double respuesta2 = (-datos[1] + discriminanteConRaiz) / datos[0];
            System.out.println("felicidades, la solucion 1 es " + respuesta1 + " y la solucion 2 es " + respuesta2);
        }
    }

}
