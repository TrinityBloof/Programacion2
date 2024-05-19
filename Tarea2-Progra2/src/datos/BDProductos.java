/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gara8
 */
public class BDProductos {
    public void InsertarEnArchivo(String datos) {
        try {
            File archivo = new File("ListaProductos.txt");
            try (BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true))) {
                archi.write(datos + "\r\n");
                JOptionPane.showMessageDialog(null, "Agregado correctamente!");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EditarEnArchivo(String datos) {
        try {
            File archivo = new File("ListaProductos.txt");
            archivo.delete();
            try (BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true))) {
                archi.write(datos + "\r\n");
                JOptionPane.showMessageDialog(null, "Agregado correctamente!");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EliminarArchivo() {
        File archivo = new File("ListaProductos.txt");
        archivo.delete();
    }

    public ArrayList<String> LeerDesdeArchivo() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            File archivo = new File("ListaProductos.txt");
            try (BufferedReader archi = new BufferedReader(new FileReader(archivo))) {
                while (archi.ready()) {
                    lista.add(archi.readLine());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }

        return lista;
    }
}
