/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gara8
 */
public class EdadTripulantes {
    
    private String nombre;
    private Integer edad;
    
    public static ArrayList listaEdadTripulantes = new ArrayList<>();
    
    public EdadTripulantes(String nombre, Integer edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public EdadTripulantes() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
    
}
