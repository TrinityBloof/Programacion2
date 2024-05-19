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
public class ReAgentesDelincuentes {
    
    private Integer codigo;
    private Integer codigoAgente;
    private Integer codigoDelincuente;
    
    public static ArrayList listaRelacion = new ArrayList<>();
    
    public ReAgentesDelincuentes(Integer codigo, Integer codigoAgente, Integer codigoDelincuente) {
        this.codigo = codigo;
        this.codigoAgente = codigoAgente;
        this.codigoDelincuente = codigoDelincuente;
    }

    public ReAgentesDelincuentes() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(Integer codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public Integer getCodigoDelincuente() {
        return codigoDelincuente;
    }

    public void setCodigoDelincuente(Integer codigoDelincuente) {
        this.codigoDelincuente = codigoDelincuente;
    }
    
    
}
