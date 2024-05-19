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
public class VuelosSalidaPanama {
    
    private Integer id_vuelo;
    private Integer num_pista;
    private String aeropuertoSalida;
    private String estadoPista;
    
    public static ArrayList listaVuelosSalidaPanama = new ArrayList<>();
    
    public VuelosSalidaPanama(Integer id_vuelo, String aeropuertoSalida, Integer num_pista, String estadoPista) {
        this.id_vuelo = id_vuelo;
        this.num_pista = num_pista;
        this.aeropuertoSalida = aeropuertoSalida;
        this.estadoPista = estadoPista;
    }

    public VuelosSalidaPanama() {

    }

    public Integer getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(Integer id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public Integer getNum_pista() {
        return num_pista;
    }

    public void setNum_pista(Integer num_pista) {
        this.num_pista = num_pista;
    }

    public String getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public void setAeropuertoSalida(String aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public String getEstadoPista() {
        return estadoPista;
    }

    public void setEstadoPista(String estadoPista) {
        this.estadoPista = estadoPista;
    }
    
    
}
