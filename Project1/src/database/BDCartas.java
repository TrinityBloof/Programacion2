/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.objCartas;

/**
 *
 * @author gara8
 */
public class BDCartas {
    public ArrayList<objCartas> masoCartas() {
        String[] cartas = new String[1];
        objCartas.listaCartas = new ArrayList<>();
        try {
            File archivo = new File("baraja.txt");
            try (BufferedReader archi = new BufferedReader(new FileReader(archivo))) {
                while (archi.ready()) {
                    String linea = archi.readLine();
                    cartas = linea.split(",");
                    objCartas.listaCartas.add(new objCartas(cartas[0], cartas[1]));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }

        return objCartas.listaCartas;
    }
}
