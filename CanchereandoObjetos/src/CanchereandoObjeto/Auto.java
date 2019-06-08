/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanchereandoObjeto;

/**
 *
 * @author TejaART
 */
public class Auto extends Vehiculo {

    private boolean aire;

    public Auto(double km_recorridos, String color, int cant_ruedas, String marca, int velocidad_max, int capacidad_carga, int peso, boolean aire) {
        super(km_recorridos, color, cant_ruedas, marca, velocidad_max, capacidad_carga, peso);

    }

    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }
}
