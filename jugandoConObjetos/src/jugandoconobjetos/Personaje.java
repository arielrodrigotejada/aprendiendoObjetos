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
public class Personaje {

    private String nombre = "";
    private int HP = 0;
    private int manaOenergia = 0;
    private JugandoConObjetos.ClaseCampeon rol = null;
    private Habilidad q = null;
    private Habilidad w = null;
    private Habilidad e = null;
    private Habilidad r = null;

    public Personaje(String nombre, int HP, int manaOenergia, JugandoConObjetos.ClaseCampeon rol, Habilidad q, Habilidad w, Habilidad e, Habilidad r) {
        this.nombre = nombre;
        this.HP = HP;
        this.manaOenergia = manaOenergia;
        this.rol = rol;
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }

    public Personaje() {

    }

    public void setNombre(String nombreCampeon) {
        this.nombre = nombreCampeon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHP(int vidaCampeon) {
        this.HP = vidaCampeon;
    }

    public int getHP() {
        return HP;
    }

    public void setManaOenergia(int naftaDelCampeon) {
        this.manaOenergia = naftaDelCampeon;
    }

    public int getManaOenergia() {
        return manaOenergia;
    }

    public void setRol(JugandoConObjetos.ClaseCampeon rolDelCampeon) {
        this.rol = rolDelCampeon;
    }

    public JugandoConObjetos.ClaseCampeon getRol() {
        return rol;
    }

    public Habilidad getQ() {
        return q;
    }

    public void setQ(Habilidad q) {
        this.q = q;
    }

    public Habilidad getW() {
        return w;
    }

    public void setW(Habilidad w) {
        this.w = w;
    }

    public Habilidad getE() {
        return e;
    }

    public void setE(Habilidad e) {
        this.e = e;
    }

    public Habilidad getR() {
        return r;
    }

    public void setR(Habilidad r) {
        this.r = r;
    }
    
}
