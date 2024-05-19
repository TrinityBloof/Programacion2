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
public class PilotoVueloRegistrado {
    
    private String nombrePiloto;
    private String nombreAerolinea;
    private String modeloAvion;
    private String estadoPuerta;
    
    public static ArrayList listaPilotoVueloRegistrado = new ArrayList<>();
    
    public PilotoVueloRegistrado(String nombrePiloto, String nombreAerolinea, String modeloAvion, String estadoPuerta) {
        this.nombrePiloto = nombrePiloto;
        this.nombreAerolinea = nombreAerolinea;
        this.modeloAvion = modeloAvion;
        this.estadoPuerta = estadoPuerta;
    }

    public PilotoVueloRegistrado() {

    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public String getEstadoPuerta() {
        return estadoPuerta;
    }

    public void setEstadoPuerta(String estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }
    
    
    
}
