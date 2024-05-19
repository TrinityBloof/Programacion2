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
            String nombreJugador = listaHistoria.get(i).getNombreJugador();
            String puntajeFinal = listaHistoria.get(i).getPuntajeFinal();
            String paloFuerte = listaHistoria.get(i).getPaloFuerte();
            datos = fechaHora + "," + nombreJugador + "," + puntajeFinal + "," + paloFuerte;
        }

        bdhistorial.InsertarEnArchivo(datos);
    }
}
