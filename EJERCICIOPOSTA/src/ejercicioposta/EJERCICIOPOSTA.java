/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioposta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Maximiliano Tejada
 */
public class EJERCICIOPOSTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        muestraArchivo("C:\\Users\\TejaART\\Desktop\\ejercicio master\\PC010319.855");
    }

    public static void muestraArchivo(String archivo) throws FileNotFoundException, IOException {
        ArrayList<String> arrayDeDatos = new ArrayList<String>();
        String nombreArchivoPosta = fechaActual() + ".cafe.txt";
        String ruta = "C:\\Users\\TejaART\\Desktop\\ejercicio master\\" + nombreArchivoPosta;
        String texto;
        String FechaDePago = "";
        String numeroDeSecuencia = "";
        String numeroDeTerminal = "";
        String codigoDeBarras = "";
        String importe = "";

        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((texto = b.readLine()) != null) {
            if (texto.startsWith("5")) {
                numeroDeSecuencia = texto.substring(77, 81);

                numeroDeTerminal = texto.substring(59, 65);

                FechaDePago = texto.substring(8, 16);

            } else if (texto.startsWith("6")) {
                codigoDeBarras = texto.substring(1, 18);
            } else if (texto.startsWith("7")) {
                importe = texto.substring(86, 101);
                if (!(numeroDeSecuencia.equals("") || numeroDeTerminal.equals("") || importe.equals("") || codigoDeBarras.equals(""))) {
                    String conjuntoDeDatos = codigoDeBarras + ";" + importe + ";" + FechaDePago + ";" + numeroDeTerminal + ";" + numeroDeSecuencia;
                    arrayDeDatos.add(conjuntoDeDatos);
                }
            }

        }
        File archivoNuevo = new File(ruta);
        // Si el archivo no existe es creado
        if (!archivoNuevo.exists()) {
            archivoNuevo.createNewFile();
        }

        FileWriter fw = new FileWriter(archivoNuevo);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < arrayDeDatos.size(); i++) {

            bw.write(arrayDeDatos.get(i) + "\n");
        }

        bw.close();

        b.close();
        subirFTP(ruta, nombreArchivoPosta + ".subido");

    }

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("ddMMYYYY");
        return formatoFecha.format(fecha);
    }

    public static void subirFTP(String rutaArchivo, String nombreArchivo) {

        FTPClient client = new FTPClient();

        FileInputStream fis = null;

        try {
            client.connect("127.0.0.1");
            client.login("cdpdemo", "demo");

            //
            // Create an InputStream of the file to be uploaded
            // client.changeWorkingDirectory("/estoEsDelFTPEh/");
            fis = new FileInputStream(rutaArchivo);

            //
            // Store file to server
            //
            client.storeFile(nombreArchivo, fis);
            client.logout();
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                client.disconnect();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

    }
}
