/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import database.BDHistorial;
import java.util.ArrayList;
import objetos.objHistorial;

/**
 *
 * @author gara8
 */
public class Historial {
    BDHistorial bdhistorial = new BDHistorial();
    public ArrayList<objHistorial> LeerHistorialObjetos() {
        ArrayList<objHistorial> listaHistorial = bdhistorial.LeerDesdeArchivoObjeto();
        return listaHistorial;
    }
    
    public void InsertarHistorial(ArrayList<objHistorial> listaHistoria) {
        String datos = "";
        for (int i = 0; i <= listaHistoria.size() - 1; i++) {
            String fechaHora = listaHistoria.get(i).getFechaHora();
            String espaciosLimpios = listaHistoria.get(i).getEspaciosLimpios();
            String espaciosSucios = listaHistoria.get(i).getEspaciosSucios();
            String espaciosObstaculos = listaHistoria.get(i).getEspaciosObstaculos();
            String posicionesRecorridas = listaHistoria.get(i).getPosicionesRecorridas();
            String posicionesLimpias = listaHistoria.get(i).getPosicionesLimpias();
            String suciudadFaltante = listaHistoria.get(i).getSuciudadFaltante();
            datos = fechaHora + "," + espaciosLimpios + "," + espaciosSucios + "," + espaciosObstaculos + "," + posicionesRecorridas + "," + posicionesLimpias + "," + suciudadFaltante;
        }

        bdhistorial.InsertarEnArchivo(datos);
    }
}
