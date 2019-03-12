/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Tejada
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lunes = Dia.LUNES.toString();
        String martes = Dia.MARTES.toString();
        String miercoles = Dia.MIERCOLES.toString();
        String jueves = Dia.JUEVES.toString();
        String viernes = Dia.VIERNES.toString();
        String sabado = Dia.SABADO.toString();
        String domingo = Dia.DOMINGO.toString();
  System.out.println("tirame un dia");
        String dia = sc.nextLine();
        switch(dia){
            case lunes:
    }
    
}
public enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
}