/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoobjetos;

/**
 *
 * @author Maximiliano Tejada
 */
public class Auto {

    private String modelo = "";
    private int anioCreacion = 0;
    private double kmRecorridos = 0;
    private String  nombreDuenio;


    public Auto() {
        this.anioCreacion=2019;
    }

    public Auto(String modelito, int anioCreacioncito, double kmRecorridoscito, String nombredueniocito) {
        this.modelo=modelito;
        this.anioCreacion=anioCreacioncito;
        this.kmRecorridos=kmRecorridoscito;
        
        this.nombreDuenio= nombredueniocito;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setNombreDuenio(char[] nombreDuenio) {
        this.nombreDuenio = nombreDuenio.toString();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    
    //FuncionesAdicionales
    public int getAniosAntiguedad(){
        return 2019-this.anioCreacion;
    }
    
    public void avanzar(int velocidad){
        System.out.println("El auto de "+this.nombreDuenio+" avanza a "+velocidad+" km por hora");
    }
     public void retroceder(int velocidad){
        System.out.println("El auto de "+this.nombreDuenio+" retroceda a "+velocidad+" km por hora");
    }
     public void detener(){
         System.out.println("El auto de "+this.nombreDuenio+" se ha detenido");
     }
}
