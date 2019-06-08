/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanchereandoObjeto;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author TejaART
 */
public class UsandoObjetos {

    public static void main(String[] args) {

        Motocicleta moto1 = new Motocicleta(0, "rojo", 2, "honda", 120, 300, 500);
        Motocicleta moto2 = new Motocicleta(0, "blanco", 2, "rutaAtlantica", 200, 150, 300);
        Motocicleta motoCheater = new Motocicleta(0, "TodosLosColores", 1000, "jorgito", 10000, 10001, 1);

        moto1.truquito_moto();

        Auto autito1 = new Auto(0, "Celeste", 4, "Dia", 80, 500, 1000, false);
        Auto autito2 = new Auto(0, "bordo", 4, "renault", 180, 600, 1500, true);
        Auto autito3 = new Auto(0, "negro", 4, "audi", 200, 550, 1000, true);

        Persona teja = new Persona("Ariel Rodrigo Tejada", 75, 18);
        Persona sere = new Persona("Serena Nancy Jazmine Garbarino", 55, 18);

        autito1.llevarUnaPersona(teja);
        System.out.println("tu auto lleva " + autito1.getPesoDeCargaActual() + "kg");

        /* ArrayList<Motocicleta> arrayDeMotosCancheras = new ArrayList<Motocicleta>();
        arrayDeMotosCancheras.add(moto1);
        arrayDeMotosCancheras.add(moto2);
        arrayDeMotosCancheras.add(motoCheater);
        
        for(int i=0;i<arrayDeMotosCancheras.size();i++){
            System.out.println("La moto numero "+ i + " recorrio "+ arrayDeMotosCancheras.get(i).getKm_recorridos()+"km");
            System.out.println("La moto numero "+ i + " es de color "+ arrayDeMotosCancheras.get(i).getColor());
            System.out.println("La moto numero "+ i + " tiene "+ arrayDeMotosCancheras.get(i).getCant_ruedas()+ " ruedas");
            System.out.println("La moto numero "+ i + " tiene una velocidad maxima de "+ arrayDeMotosCancheras.get(i).getVelocidad_max()+"km");
            System.out.println("La moto numero "+ i + " pesa "+ arrayDeMotosCancheras.get(i).getPeso()+"kg y puede aguantar "+ arrayDeMotosCancheras.get(i).getCapacidad_carga()+"kg de carga");
            System.out.println("\n");
            System.out.println("\n");
            
        }
    }*/
    }
}
