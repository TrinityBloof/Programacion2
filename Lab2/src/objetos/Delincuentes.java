/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gara8
 */
public class Delincuentes {
    
    private Integer codigo;
    private String nombre;
    private Date fecha_nacimiento;
    private String pais_origen;
    private Integer recompensa;
    private String alias;
    private Integer tipo_delincuente;
    private Integer organizacion;
    private Date fecha_primer_delito;
    private Integer cantidad_delitos;
    
    public static ArrayList listaDelincuentes = new ArrayList<>();
    
    public Delincuentes(Integer codigo, String nombre, Date fecha_nacimiento, String pais_origen, Integer recompensa, String alias, Integer tipo_delincuente, Integer organizacion, Date fecha_primer_delito, Integer cantidad_delitos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais_origen = pais_origen;
        this.recompensa = recompensa;
        this.alias = alias;
        this.tipo_delincuente = tipo_delincuente;
        this.organizacion = organizacion;
        this.fecha_primer_delito = fecha_primer_delito;
        this.cantidad_delitos = cantidad_delitos;
    }

    public Delincuentes() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getTipo_delincuente() {
        return tipo_delincuente;
    }

    public void setTipo_delincuente(Integer tipo_delincuente) {
        this.tipo_delincuente = tipo_delincuente;
    }

    public Integer getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Integer organizacion) {
        this.organizacion = organizacion;
    }

    public Date getFecha_primer_delito() {
        return fecha_primer_delito;
    }

    public void setFecha_primer_delito(Date fecha_primer_delito) {
        this.fecha_primer_delito = fecha_primer_delito;
    }

    public Integer getCantidad_delitos() {
        return cantidad_delitos;
    }

    public void setCantidad_delitos(Integer cantidad_delitos) {
        this.cantidad_delitos = cantidad_delitos;
    }
    
    
}
