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
public class Vehiculo {

    private double km_recorridos;
    private String color;
    private int cant_ruedas;
    private String marca;
    private int velocidad_max;
    private int capacidad_carga;
    private int peso;
    private int pesoDeCargaActual = 0;

    public Vehiculo(double km_recorridos, String color, int cant_ruedas, String marca, int velocidad_max, int capacidad_carga, int peso) {
        this.km_recorridos = km_recorridos;
        this.color = color;
        this.cant_ruedas = cant_ruedas;
        this.marca = marca;
        this.velocidad_max = velocidad_max;
        this.capacidad_carga = capacidad_carga;
        this.peso = peso;
    }

    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(double km_recorridos) {
        this.km_recorridos = km_recorridos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPesoDeCargaActual() {
        return pesoDeCargaActual;
    }

    public void setPesoDeCargaActual(int pesoDeCargaActual) {
        this.pesoDeCargaActual = pesoDeCargaActual;
    }

    public void avanzameUnosKilometros(int kilometros) {
        this.setKm_recorridos(kilometros);
        System.out.println("avanzaste " + kilometros + " kilometros");
    }

    public void cambiameElColor(String color) {
        this.setColor(color);
        System.out.println("cambiaste a color " + color);
    }

    public void llevarUnaPersona(Persona personita) {
        this.setPesoDeCargaActual(pesoDeCargaActual + personita.getPeso());
        System.out.println("Estas llevando a " + personita.getNombre());
    }

}
