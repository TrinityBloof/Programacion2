/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import objetos.objHistorial;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gara8
 */
public class InsetarDatos {

    String fechaHora = "";
    String espaciosLimpios = "";
    String espaciosSucios = "";
    String espaciosObstaculos = "";
    String posicionesRecorridas = "";
    String posicionesLimpias = "";
    String suciudadFaltante = "";
    MostrarDatos reset = new MostrarDatos();
    Historial historial = new Historial();

    public void insertar(JTable tbMostrar, JTextField text1, JTextField text2, JTextField text3, JButton[][] MatrizBotones) {
        reset.reiniciarListaObjeto();
        int contadorX, contadorY;
        int limpio = 0, sucio = 0, obstaculo = 0;
        loops:
        for (contadorX = 0; contadorX < 8; contadorX++) {
            for (contadorY = 0; contadorY < 8; contadorY++) {
                JButton revisar = MatrizBotones[contadorX][contadorY];
                if ("Limpio".equals(revisar.getToolTipText())) {
                    limpio++;
                }
                if ("Sucio".equals(revisar.getToolTipText())) {
                    sucio++;
                }
                if ("Pared".equals(revisar.getToolTipText())) {
                    obstaculo++;
                }
                if ("Suelo".equals(revisar.getToolTipText())) {
                    obstaculo++;
                }
                if ("Techo".equals(revisar.getToolTipText())) {
                    obstaculo++;
                }
            }
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        fechaHora = String.valueOf(dtf.format(LocalDateTime.now()));
        espaciosLimpios = String.valueOf(limpio);
        espaciosSucios = String.valueOf(sucio);
        espaciosObstaculos = String.valueOf(obstaculo);
        suciudadFaltante = text1.getText();
        posicionesLimpias = text2.getText();
        posicionesRecorridas = text3.getText();
        objHistorial.listaHistorial.add(new objHistorial(fechaHora, espaciosLimpios, espaciosSucios, espaciosObstaculos, posicionesRecorridas, posicionesLimpias, suciudadFaltante));
        historial.InsertarHistorial(objHistorial.listaHistorial);
        reset.mostrarDatosObjetos(tbMostrar);
        reset.reiniciarListaObjeto();
    }
}
