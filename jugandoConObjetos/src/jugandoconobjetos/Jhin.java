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
public class Jhin extends Personaje {
    
    public Jhin() {
        super();
        Habilidad QJHIN = new Habilidad(40, 45, 0, 5);
        Habilidad WJHIN = new Habilidad(50, 50, 0, 8);
        Habilidad EJHIN = new Habilidad(30, 20, 0, 20);
        Habilidad RJHIN = new Habilidad(100, 1000, 0, 101);
        
        String nombre = "jhin";
        int HP = 556;
        int manaOenergia = 300;
        JugandoConObjetos.ClaseCampeon rol = JugandoConObjetos.ClaseCampeon.TIRADOR;
        super.setHP(HP);
        super.setManaOenergia(manaOenergia);
        super.setNombre(nombre);
        super.setRol(rol);
        super.setQ(QJHIN);
        super.setW(WJHIN);
        super.setE(EJHIN);
        super.setR(RJHIN);
    }
    
}
