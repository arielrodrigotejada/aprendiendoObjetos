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
    private String rol = "";

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
    public int getManaOenergia(){
        return manaOenergia;
    }
    public void setRol(String rolDelCampeon){
        this.rol = rolDelCampeon;
    }
    public String getRol(){
        return rol;
    }
}
