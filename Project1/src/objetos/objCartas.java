/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author gara8
 */
public class objCartas {
    
    String forma;
    String nombre;
    public boolean cartaUsada = false;
    public String simbolo;
    public int valor;
    
    public static ArrayList listaCartas = new ArrayList<>();
    
    public objCartas(String nombre, String f) {
        this.forma = f;
        this.nombre = nombre;
        
        if ("Jota".equals(nombre)) {
            simbolo = "J";
            valor = 11;
        } else if ("Reina".equals(nombre)) {
            simbolo = "Q";
            valor = 12;
        } else if ("Rey".equals(nombre)) {
            simbolo = "K";
            valor = 13;
        } else if ("As".equals(nombre)) {
            simbolo = "A";
            valor = 1;
        } else {
            simbolo = nombre;
            valor = Integer.parseInt(nombre);
        }
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList getListaCartas() {
        return listaCartas;
    }

    public static void setListaCartas(ArrayList listaCartas) {
        objCartas.listaCartas = listaCartas;
    }
    
    
}
