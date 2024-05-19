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
public class Reporte {
    
    private String nombreAgente;
    private String nombreDelincuente;
    private String aliasDelincuente;
    private String nombreTipoDelincuente;
    private String nombreOrganizacion;
    
    public static ArrayList listaReporte = new ArrayList<>();
    
    public Reporte(String nombreAgente, String nombreDelincuente, String aliasDelincuente, String nombreTipoDelincuente, String nombreOrganizacion) {
        this.nombreAgente = nombreAgente;
        this.nombreDelincuente = nombreDelincuente;
        this.aliasDelincuente = aliasDelincuente;
        this.nombreTipoDelincuente = nombreTipoDelincuente;
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public Reporte() {

    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getNombreDelincuente() {
        return nombreDelincuente;
    }

    public void setNombreDelincuente(String nombreDelincuente) {
        this.nombreDelincuente = nombreDelincuente;
    }

    public String getAliasDelincuente() {
        return aliasDelincuente;
    }

    public void setAliasDelincuente(String aliasDelincuente) {
        this.aliasDelincuente = aliasDelincuente;
    }

    public String getNombreTipoDelincuente() {
        return nombreTipoDelincuente;
    }

    public void setNombreTipoDelincuente(String nombreTipoDelincuente) {
        this.nombreTipoDelincuente = nombreTipoDelincuente;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }
    
    
}
