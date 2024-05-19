/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import objetos.*;

/**
 *
 * @author gara8
 */
public class MostrarDatos {
    
    Historial historial = new Historial();
    
    public void mostrarDatosObjetos(JTable tbMostrar) {
        reiniciarListaObjeto();
        DefaultTableModel model = (DefaultTableModel) tbMostrar.getModel();
        model.setRowCount(0);
        ArrayList<objHistorial> listaHistorial = historial.LeerHistorialObjetos();
        Object[] arreglo = new Object[3];
        for (int i = 0; i < listaHistorial.size(); i++) {
            arreglo[0] = listaHistorial.get(i).getFechaHora();
            arreglo[1] = listaHistorial.get(i).getNombreJugador();
            arreglo[2] = listaHistorial.get(i).getPuntajeFinal();
            model.addRow(arreglo);
        }
    }
    
    public void reiniciarListaObjeto() {
        objHistorial.listaHistorial = new ArrayList<>();
    }
}
