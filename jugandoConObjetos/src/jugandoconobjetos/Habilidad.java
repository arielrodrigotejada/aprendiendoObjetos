/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugandoconobjetos;

/**
 *
 * @author TejaART
 */
public class Habilidad {

    private int costo;
    private int daño;
    private int vidaOescudo;
    private int cd;

    public Habilidad(int costo, int daño, int vidaOescudo, int cd) {
        this.costo = costo;
        this.daño = daño;
        this.vidaOescudo = vidaOescudo;
        this.cd = cd;
        
        
        
    }
    
    
    
    
    

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVidaOescudo() {
        return vidaOescudo;
    }

    public void setVidaOescudo(int vidaOescudo) {
        this.vidaOescudo = vidaOescudo;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

}
