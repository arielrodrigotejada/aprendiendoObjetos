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
public class ProbandoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Auto cafe2 = new Auto("Fiat 700",2012,0,"Maxi");
        //System.out.println("el cafe tiene "+cafe2.getAniosAntiguedad()+" años");
        cafe2.avanzar(20);
          cafe2.retroceder(5);
          cafe2.detener();
    }

}
