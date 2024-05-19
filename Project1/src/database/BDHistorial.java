/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.objHistorial;

/**
 *
 * @author gara8
 */
public class BDHistorial {
    public ArrayList<objHistorial> LeerDesdeArchivoObjeto() {
        String[] datos = new String[4];
        objHistorial.listaHistorial = new ArrayList<>();
        try {
            File archivo = new File("Historial.txt");
            try (BufferedReader archi = new BufferedReader(new FileReader(archivo))) {
                while (archi.ready()) {
                    String linea = archi.readLine();
                    datos = linea.split(",");
                    objHistorial.listaHistorial.add(new objHistorial(datos[0], datos[1], datos[2], datos[3]));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }

        return objHistorial.listaHistorial;
    }
    
    public void InsertarEnArchivo(String datosUsuario) {
        try {
            File archivo = new File("Historial.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datosUsuario + "\r\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
