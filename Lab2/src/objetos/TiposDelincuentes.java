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
public class TiposDelincuentes {
    
    private Integer codigo;
    private String nombre;
    
    public static ArrayList listaTipoDelincuentes = new ArrayList<>();
    
    public TiposDelincuentes(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public TiposDelincuentes() {

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
    
    
    
}
