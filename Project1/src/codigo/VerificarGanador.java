/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.abs;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import juegocartas.GUI;
import objetos.objCartas;
import objetos.objHistorial;

/**
 *
 * @author gara8
 */
public class VerificarGanador {

    String mensaje;
    String fechaHora = "";
    String nombreJugador = "";
    String puntajeFinal = "";
    String paloFuerte = "";
    MostrarDatos reset = new MostrarDatos();
    Historial historial = new Historial();

    public String verifGanador(JTextField gano, JTextField perdio, JTextField pts, ArrayList<objCartas> cartasJugador, ArrayList<objCartas> cartasDealer, int turno, JLabel fuerte, JLabel debil, JLabel regular1, JLabel regular2, JTextField score, String nombre, JTable tbMostrar) {
        int valorJugador = cartasJugador.get(turno + 1).valor;
        int valorDealer = cartasDealer.get(turno + 1).valor;
        String formaCartaJugador = cartasJugador.get(turno + 1).getForma();
        String formaCartaDealer = cartasDealer.get(turno + 1).getForma();
        String fuerte2 = fuerte.getToolTipText();
        String debil2 = debil.getToolTipText();
        String regular3 = regular1.getToolTipText();
        String regular4 = regular2.getToolTipText();

        int gano2 = Integer.parseInt(gano.getText());
        int perdio2 = Integer.parseInt(perdio.getText());
        int pts2 = Integer.parseInt(pts.getText());

        if (formaCartaJugador.equals(formaCartaDealer)) {
            if (valorJugador > valorDealer) {
                mensaje = "Los palos son iguales. El jugador gana esta ronda por carta mayor";
                gano2++;
                gano.setText(String.valueOf(gano2));
            } else {
                mensaje = "Los palos son iguales. El dealer gana esta ronda por carta mayor";
                perdio2++;
                perdio.setText(String.valueOf(perdio2));
            }
        } else if ((formaCartaJugador.equals(regular3) || formaCartaJugador.equals(regular4)) && (formaCartaDealer.equals(regular3) || formaCartaDealer.equals(regular4))) {
            if (valorJugador > valorDealer) {
                mensaje = "Ambas cartas son palos regulares. El jugador gana esta ronda por carta mayor.";
                gano2++;
                gano.setText(String.valueOf(gano2));
            } else if (valorJugador == valorDealer) {
                mensaje = "Empate de cartas regulares. El jugador gana esta ronda.";
                gano2++;
                gano.setText(String.valueOf(gano2));
            } else {
                mensaje = "Ambas cartas son palos regulares. El dealer gana esta ronda por carta mayor";
                perdio2++;
                perdio.setText(String.valueOf(perdio2));
            }
        } else if ((formaCartaJugador.equals(fuerte2) && formaCartaDealer.equals(regular3)) || (formaCartaJugador.equals(fuerte2) && formaCartaDealer.equals(regular4))) {
            mensaje = "El jugador gana esta ronda por palo fuerte.";
            gano2++;
            gano.setText(String.valueOf(gano2));
        } else if ((formaCartaDealer.equals(fuerte2) && formaCartaJugador.equals(regular3)) || (formaCartaDealer.equals(fuerte2) && formaCartaJugador.equals(regular4))) {
            mensaje = "El dealer gana esta ronda por palo fuerte.";
            perdio2++;
            perdio.setText(String.valueOf(perdio2));
        } else if ((formaCartaJugador.equals(regular3) && formaCartaDealer.equals(debil2)) || (formaCartaJugador.equals(regular4) && formaCartaDealer.equals(debil2))) {
            mensaje = "El jugador gana esta ronda por palo regular.";
            gano2++;
            gano.setText(String.valueOf(gano2));
        } else if ((formaCartaDealer.equals(regular3) && formaCartaJugador.equals(debil2)) || (formaCartaDealer.equals(regular4) && formaCartaJugador.equals(debil2))) {
            mensaje = "El dealer gana esta ronda por palo regular.";
            perdio2++;
            perdio.setText(String.valueOf(perdio2));
        } else if (formaCartaJugador.equals(debil2) && formaCartaDealer.equals(fuerte2)) {
            mensaje = "El jugador gana esta ronda por palo débil.";
            gano2++;
            gano.setText(String.valueOf(gano2));
        } else if (formaCartaDealer.equals(debil2) && formaCartaJugador.equals(fuerte2)) {
            mensaje = "El dealer gana esta ronda por palo débil.";
            perdio2++;
            perdio.setText(String.valueOf(perdio2));
        }
        if (turno == 8) {
            pts2 = 10 - (abs(gano2 - Integer.parseInt(score.getText())));
            pts.setText(String.valueOf(pts2));
            reset.reiniciarListaObjeto();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            fechaHora = String.valueOf(dtf.format(LocalDateTime.now()));
            nombreJugador = nombre;
            puntajeFinal = String.valueOf(pts2);
            paloFuerte = fuerte.getToolTipText();
            objHistorial.listaHistorial.add(new objHistorial(fechaHora, nombreJugador, puntajeFinal, paloFuerte));
            historial.InsertarHistorial(objHistorial.listaHistorial);
            reset.mostrarDatosObjetos(tbMostrar);
            reset.reiniciarListaObjeto();
        }
        return mensaje;
    }
}
