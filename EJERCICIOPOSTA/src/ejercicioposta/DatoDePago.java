/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioposta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author TejaART
 */
public class DatoDePago {

    
    private String numeroDeSecuencia = "";
    private String numeroDeTerminal = "";
    private String codigoDeBarras = "";
    private String importe = "";
    private String fechaDePago = "";
    
    
    public DatoDePago(String numeroDeSecuencia, String numeroDeTerminal, String codigoDeBarras, String importe, String fechaDePago){
        this.codigoDeBarras = codigoDeBarras;
        this.fechaDePago = fechaDePago;
        this.importe = importe;
        this.numeroDeSecuencia = numeroDeSecuencia;
        this.numeroDeTerminal = numeroDeTerminal;
    } 

    public String getNumeroDeSecuencia() {
        return numeroDeSecuencia;
    }

    public void setNumeroDeSecuencia(String numeroDeSecuencia) {
        this.numeroDeSecuencia = numeroDeSecuencia;
    }

    public String getNumeroDeTerminal() {
        return numeroDeTerminal;
    }

    public void setNumeroDeTerminal(String numeroDeTerminal) {
        this.numeroDeTerminal = numeroDeTerminal;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(String fechaDePago) {
        this.fechaDePago = fechaDePago;
    }
    
    
        
        
    }

