/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import objetos.*;
import database.*;

/**
 *
 * @author gara8
 */
public class Cargas {
    
    DBCargas cargas = new DBCargas();
    
    public ArrayList<Grafico> cargarGrafico() {
        ArrayList<Grafico> listaGrafico = cargas.cargarGrafico();
        return listaGrafico;
    }
    
    public ArrayList<VuelosPorAvion> cargarVuelosPorAvion() {
        ArrayList<VuelosPorAvion> listaVuelosPorAvion = cargas.cargarVuelosPorAvion();
        return listaVuelosPorAvion;
    }
    
    
    public ArrayList<TripulantesServicioCliente> cargarTripulantesServicioCliente() {
        ArrayList<TripulantesServicioCliente> listaTripulantesServicioCliente = cargas.cargarTripulantesServicioCliente();
        return listaTripulantesServicioCliente;
    }
    
    
    
    public ArrayList<PilotoVueloRegistrado> cargarPilotoVueloRegistrado() {
        ArrayList<PilotoVueloRegistrado> listaPilotoVueloRegistrado = cargas.cargarPilotoVueloRegistrado();
        return listaPilotoVueloRegistrado;
    }
    
    
    public ArrayList<VuelosPorAerolinea> cargarVueloPorAerolinea() {
        ArrayList<VuelosPorAerolinea> listaVuelosPorAerolinea = cargas.cargarVueloPorAerolinea();
        return listaVuelosPorAerolinea;
    }
    
    
    public ArrayList<VuelosSalidaPanama> cargarVuelosSalidaPanama() {
        ArrayList<VuelosSalidaPanama> listaVuelosSalidaPanama = cargas.cargarVuelosSalidaPanama();
        return listaVuelosSalidaPanama;
    }
    
    public ArrayList<EdadTripulantes> cargarEdadTripulantes() {
        ArrayList<EdadTripulantes> listaEdadTripulantes = cargas.cargarEdadTripulantes();
        return listaEdadTripulantes;
    }
}
