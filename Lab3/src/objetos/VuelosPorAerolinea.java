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
public class VuelosPorAerolinea {
    
    private Integer cantidadVeces;
    private String nombreAerolinea;
    private Integer numeroPista;
    
    public static ArrayList listaVuelosPorAerolinea = new ArrayList<>();
    
    public VuelosPorAerolinea(Integer cantidadVeces, String nombreAerolinea, Integer numeroPista) {
        this.cantidadVeces = cantidadVeces;
        this.nombreAerolinea = nombreAerolinea;
        this.numeroPista = numeroPista;
    }

    public VuelosPorAerolinea() {

    }

    public Integer getCantidadVeces() {
        return cantidadVeces;
    }

    public void setCantidadVeces(Integer cantidadVeces) {
        this.cantidadVeces = cantidadVeces;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public Integer getNumeroPista() {
        return numeroPista;
    }

    public void setNumeroPista(Integer numeroPista) {
        this.numeroPista = numeroPista;
    }
    
    
}
