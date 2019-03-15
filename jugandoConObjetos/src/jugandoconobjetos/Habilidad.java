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
     public void Q() {
         System.out.println("Usaste la Q ,hiciste "+this.daño+" diste "+this.vidaOescudo+" de vida o escudo y gastaste "+this.costo+" de lo que sea que uses y ahora esperate "+this.cd+" segundos para tirarla de vuelta");
         }
     public void W() {
         System.out.println("Usaste la W ,hiciste "+this.daño+" diste "+this.vidaOescudo+" de vida o escudo y gastaste "+this.costo+" de lo que sea que uses y ahora esperate "+this.cd+" segundos para tirarla de vuelta");
         }
     public void E() {
         System.out.println("Usaste la E ,hiciste "+this.daño+" diste "+this.vidaOescudo+" de vida o escudo y gastaste "+this.costo+" de lo que sea que uses y ahora esperate "+this.cd+" segundos para tirarla de vuelta");
         }
     public void R() {
         System.out.println("Usaste la R ,hiciste "+this.daño+" diste "+this.vidaOescudo+" de vida o escudo y gastaste "+this.costo+" de lo que sea que uses y ahora esperate "+this.cd+" segundos para tirarla de vuelta");
         }
}