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
 * @author Maximiliano Tejada
 */
public class EJERCICIOPOSTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        muestraArchivo("D:\\Mis\\Escritorio\\ejercicio master\\PC010319.855");
    }

    public static void muestraArchivo(String archivo) throws FileNotFoundException, IOException {
        String texto;
        String numeroDeSecuencia ="";
        String numeroDeTerminal ="";
        String codigoDeBarras ="";
        String importe ="";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((texto = b.readLine()) != null) {
            if (texto.startsWith("5")) {
                 numeroDeSecuencia = texto.substring(77, 81);

                 numeroDeTerminal = texto.substring(59, 65);

            } else if (texto.startsWith("6")) {
                 codigoDeBarras = texto.substring(2, 18);
            } else if (texto.startsWith("7")) {
                 importe = texto.substring(86, 101);
                 

            }
            if(texto.startsWith("7")){
            System.out.println("Para el codigo de barras "+codigoDeBarras+" , se abonó "+importe+" pesos, con numero de terminal "+numeroDeTerminal+ " , y numero de secuencia "+numeroDeSecuencia);    
            }
            
        }
        b.close();
    }
}
