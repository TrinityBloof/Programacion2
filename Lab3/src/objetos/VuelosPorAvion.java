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
public class VuelosPorAvion {
    
    private Integer cantidadVuelos;
    private String modeloAvion;
    
    public static ArrayList listaVuelosPorAvion = new ArrayList<>();
    
    public VuelosPorAvion(Integer cantidadVuelos, String modeloAvion) {
        this.cantidadVuelos = cantidadVuelos;
        this.modeloAvion = modeloAvion;
    }

    public VuelosPorAvion() {

    }

    public Integer getCantidadVuelos() {
        return cantidadVuelos;
    }

    public void setCantidadVuelos(Integer cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }
    
    
    
}
