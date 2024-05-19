/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

public class Grafico {
    
    private Integer cantidadViajes;
    private String nombreAerolinea;
    
    public static ArrayList listaDatos = new ArrayList<>();
    
    public Grafico(String nombreAerolinea, Integer cantidadViajes) {
        this.nombreAerolinea = nombreAerolinea;
        this.cantidadViajes = cantidadViajes;
    }

    public Grafico() {

    }

    public Integer getCantidadViajes() {
        return cantidadViajes;
    }

    public void setCantidadViajes(Integer cantidadViajes) {
        this.cantidadViajes = cantidadViajes;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }
    
    
    
    
}
