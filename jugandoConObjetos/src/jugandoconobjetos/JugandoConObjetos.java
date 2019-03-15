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
public class JugandoConObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //usando constructor
        Personaje mid = new Personaje("ZED", 584, 200, "asesino");
        //usando set y get
        mid.setNombre("ZED");
        mid.setHP(584);
        mid.setManaOenergia(200);
        mid.setRol("asesino");

        Personaje adc = new Personaje("jhin", 556, 300, "tirador");
        Habilidad QJHIN = new Habilidad(40, 45, 0, 5);
        Habilidad WJHIN = new Habilidad(50, 50, 0, 8);
        Habilidad EJHIN = new Habilidad(30, 20, 0, 20);
        Habilidad RJHIN = new Habilidad(100, 1000, 0, 101);

        Personaje sup = new Personaje("tresh", 560, 273, "soporte");
        Habilidad QTRESH = new Habilidad(70, 80, 0, 15);
        Habilidad WTRESH = new Habilidad(50, 0, 60, 20);
        Habilidad ETRESH = new Habilidad(60, 65, 0, 10);
        Habilidad RTRESH = new Habilidad(100, 250, 0, 80);

        Personaje top = new Personaje("sion", 542, 325, "tanque");
        Habilidad QSION = new Habilidad(45, 60, 0, 9);
        Habilidad WSION = new Habilidad(65, 40, 30, 10);
        Habilidad ESION = new Habilidad(35, 65, 0, 13);
        Habilidad RSION = new Habilidad(100, 500, 0, 90);

        Personaje jg = new Personaje("pyke", 600, 415, "asesino");
        Habilidad QPYKE = new Habilidad(70, 75, 0, 10);
        Habilidad WPYKE = new Habilidad(50, 0, 0, 17);
        Habilidad EPYKE = new Habilidad(40, 95, 0, 13);
        Habilidad RPYKE = new Habilidad(100,300,0,90);
        
        
        

    }
}
