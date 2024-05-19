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
    private String nombreJugador;
    private String puntajeFinal;
    private String paloFuerte;
    
    public static ArrayList listaHistorial = new ArrayList<>();

    public objHistorial(String fechaHora, String nombreJugador, String puntajeFinal, String paloFuerte) {
        this.fechaHora = fechaHora;
        this.nombreJugador = nombreJugador;
        this.puntajeFinal = puntajeFinal;
        this.paloFuerte = paloFuerte;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPuntajeFinal() {
        return puntajeFinal;
    }

    public void setPuntajeFinal(String puntajeFinal) {
        this.puntajeFinal = puntajeFinal;
    }

    public String getPaloFuerte() {
        return paloFuerte;
    }

    public void setPaloFuerte(String paloFuerte) {
        this.paloFuerte = paloFuerte;
    }

    public static ArrayList getListaHistorial() {
        return listaHistorial;
    }

    public static void setListaHistorial(ArrayList listaHistorial) {
        objHistorial.listaHistorial = listaHistorial;
    }
    
    
}
