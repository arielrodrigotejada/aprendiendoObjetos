/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanchereandoObjeto;

/**
 *
 * @author MaxiPC
 */
public class Motocicleta extends Vehiculo {

    private int pts_cancheros;

    public Motocicleta(double km_recorridos, String color, int cant_ruedas, String marca, int velocidad_max, int capacidad_carga, int peso) {
        super(km_recorridos, color, cant_ruedas, marca, velocidad_max, capacidad_carga, peso);
        this.pts_cancheros = 0;
    }

    public int getPts_cancheros() {

        return pts_cancheros;
    }

    public void setPts_cancheros(int pts_cancheros) {
        this.pts_cancheros = pts_cancheros;
    }

    public void truquito_moto() {
        this.setPts_cancheros(this.getPts_cancheros() + 10);

    }

    public void mostra_pts_cancheros() {
        System.out.println("Tenes " + this.getPts_cancheros() + " puntos chancheros");
    }

}
