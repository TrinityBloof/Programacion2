/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import objetos.*;
import database.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author gara8
 */
public class Cargas {
    
    DBCargas cargas = new DBCargas();
    
    public ArrayList<GraficaPastel> cargarGrafico() {
        ArrayList<GraficaPastel> listaGrafico = cargas.cargarGrafico();
        return listaGrafico;
    }
    
    public ArrayList<TiposDelincuentes> cargarTiposDelincuentes() {
        ArrayList<TiposDelincuentes> listaTiposDelincuentes = cargas.cargarTiposDelicuentes();
        return listaTiposDelincuentes;
    }
    
    public DefaultComboBoxModel cargarCodigos() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Integer> listaCodigos = cargas.cargarCodigosTiposDelincuentes();
        for (Integer codigo : listaCodigos) {
            modelo.addElement(codigo);
        }
        return modelo;
    }
    
    public TiposDelincuentes cargarUnTipoDelincuente(Integer codigo) {
        TiposDelincuentes datos = cargas.cargarUnTipoDelincuente(codigo);
        return datos;
    }
    
    
    public ArrayList<Organizaciones> cargarOrganizaciones() {
        ArrayList<Organizaciones> listaOrganizaciones = cargas.cargarOrganizaciones();
        return listaOrganizaciones;
    }
    
    public DefaultComboBoxModel cargarCodigosOrganizaciones() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Integer> listaCodigos = cargas.cargarCodigosOrganizaciones();
        for (Integer codigo : listaCodigos) {
            modelo.addElement(codigo);
        }
        return modelo;
    }
    
    public Organizaciones cargarUnaOrganizacion(Integer codigo) {
        Organizaciones datos = cargas.cargarUnaOrganizacion(codigo);
        return datos;
    }
    
    
    
    public ArrayList<Delincuentes> cargarDelincuentes() {
        ArrayList<Delincuentes> listaDelincuentes = cargas.cargarDelincuentes();
        return listaDelincuentes;
    }
    
    public DefaultComboBoxModel cargarCodigosDelincuentes() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Integer> listaCodigos = cargas.cargarCodigosDelincuentes();
        for (Integer codigo : listaCodigos) {
            modelo.addElement(codigo);
        }
        return modelo;
    }
    
    public Delincuentes cargarUnDelincuentes(Integer codigo) {
        Delincuentes datos = cargas.cargarUnDelincuente(codigo);
        return datos;
    }
    
    
    public ArrayList<Agentes> cargarAgentes() {
        ArrayList<Agentes> listaAgentes = cargas.cargarAgentes();
        return listaAgentes;
    }
    
    public DefaultComboBoxModel cargarCodigosAgentes() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Integer> listaCodigos = cargas.cargarCodigosAgentes();
        for (Integer codigo : listaCodigos) {
            modelo.addElement(codigo);
        }
        return modelo;
    }
    
    public Agentes cargarUnAgente(Integer codigo) {
        Agentes datos = cargas.cargarUnAgente(codigo);
        return datos;
    }
    
    
    public ArrayList<ReAgentesDelincuentes> cargarRelacion() {
        ArrayList<ReAgentesDelincuentes> listaRelacion = cargas.cargarRelacion();
        return listaRelacion;
    }
    
    public DefaultComboBoxModel cargarCodigosRelacion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<Integer> listaCodigos = cargas.cargarCodigosRelacion();
        for (Integer codigo : listaCodigos) {
            modelo.addElement(codigo);
        }
        return modelo;
    }
    
    public ReAgentesDelincuentes cargarUnaRelacion(Integer codigo) {
        ReAgentesDelincuentes datos = cargas.cargarUnaRelacion(codigo);
        return datos;
    }
    
    public ArrayList<Reporte> cargarReporte(Integer codigo) {
        ArrayList<Reporte> listaReporte = cargas.cargarReporte(codigo);
        return listaReporte;
    }
}
