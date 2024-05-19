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
public class objHistorial {
    private String fechaHora;
    private String espaciosLimpios;
    private String espaciosSucios;
    private String espaciosObstaculos;
    private String posicionesRecorridas;
    private String posicionesLimpias;
    private String suciudadFaltante;
    
    public static ArrayList listaHistorial = new ArrayList<>();

    public objHistorial(String fechaHora, String espaciosLimpios, String espaciosSucios, String espaciosObstaculos, String posicionesRecorridas, String posicionesLimpias, String suciudadFaltante) {
        this.fechaHora = fechaHora;
        this.espaciosLimpios = espaciosLimpios;
        this.espaciosSucios = espaciosSucios;
        this.espaciosObstaculos = espaciosObstaculos;
        this.posicionesRecorridas = posicionesRecorridas;
        this.posicionesLimpias = posicionesLimpias;
        this.suciudadFaltante = suciudadFaltante;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEspaciosLimpios() {
        return espaciosLimpios;
    }

    public void setEspaciosLimpios(String espaciosLimpios) {
        this.espaciosLimpios = espaciosLimpios;
    }

    public String getEspaciosSucios() {
        return espaciosSucios;
    }

    public void setEspaciosSucios(String espaciosSucios) {
        this.espaciosSucios = espaciosSucios;
    }

    public String getEspaciosObstaculos() {
        return espaciosObstaculos;
    }

    public void setEspaciosObstaculos(String espaciosObstaculos) {
        this.espaciosObstaculos = espaciosObstaculos;
    }

    public String getPosicionesRecorridas() {
        return posicionesRecorridas;
    }

    public void setPosicionesRecorridas(String posicionesRecorridas) {
        this.posicionesRecorridas = posicionesRecorridas;
    }

    public String getPosicionesLimpias() {
        return posicionesLimpias;
    }

    public void setPosicionesLimpias(String posicionesLimpias) {
        this.posicionesLimpias = posicionesLimpias;
    }

    public String getSuciudadFaltante() {
        return suciudadFaltante;
    }

    public void setSuciudadFaltante(String suciudadFaltante) {
        this.suciudadFaltante = suciudadFaltante;
    }
}
