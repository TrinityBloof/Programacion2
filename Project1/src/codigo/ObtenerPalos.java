/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import objetos.objHistorial;

/**
 *
 * @author gara8
 */
public class ObtenerPalos {
    
    Historial historial = new Historial();
    
    public ArrayList<String> obtenerPalos() {
        ArrayList<objHistorial> listaHistorial = historial.LeerHistorialObjetos();
        ArrayList<String> arreglo = new ArrayList<String>();
        for (int i = 0; i < listaHistorial.size(); i++) {
            arreglo.add(listaHistorial.get(i).getPaloFuerte());
        }
        return arreglo;
    }
}
