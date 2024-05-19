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
public class TripulantesServicioCliente {
    
    private String nombreTripulante;
    private String aerolineaEnQueTrabaja;
    private String rolTripulante;
    private Integer idVuelo;
    
    public static ArrayList listaTripulantesServicioCliente = new ArrayList<>();
    
    public TripulantesServicioCliente(String nombreTripulante, String aerolineaEnQueTrabaja, String rolTripulante, Integer idVuelo) {
        this.nombreTripulante = nombreTripulante;
        this.aerolineaEnQueTrabaja = aerolineaEnQueTrabaja;
        this.rolTripulante = rolTripulante;
        this.idVuelo = idVuelo;
    }

    public TripulantesServicioCliente() {

    }

    public String getNombreTripulante() {
        return nombreTripulante;
    }

    public void setNombreTripulante(String nombreTripulante) {
        this.nombreTripulante = nombreTripulante;
    }

    public String getAerolineaEnQueTrabaja() {
        return aerolineaEnQueTrabaja;
    }

    public void setAerolineaEnQueTrabaja(String aerolineaEnQueTrabaja) {
        this.aerolineaEnQueTrabaja = aerolineaEnQueTrabaja;
    }

    public String getRolTripulante() {
        return rolTripulante;
    }

    public void setRolTripulante(String rolTripulante) {
        this.rolTripulante = rolTripulante;
    }

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }
    
    
}
