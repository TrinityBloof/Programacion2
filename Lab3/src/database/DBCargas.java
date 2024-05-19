/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.*;

/**
 *
 * @author gara8
 */
public class DBCargas {

    private ResultSet rs, rs2, rs3, rs4, rs5 = null;
    private Statement s = null;
    DBConexion conexion = new DBConexion();
    private Connection connection = null;

    public ArrayList<Grafico> cargarGrafico() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT c_avion, aerolinea FROM vuelo GROUP BY c_avion, aerolinea HAVING COUNT(*)>0");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT av.modelo, av.id FROM aerolinea ae, avion av WHERE ae.nombre_aerolinea = '" + rs.getString("aerolinea") + "' AND ae.tipo = 'Internacional' AND av.id = '" + rs.getString("c_avion") + "'");
                while (rs2.next()) {
                    rs3 = s.executeQuery("SELECT Count(c_avion) FROM vuelo WHERE c_avion = '" + rs2.getString("id") + "'");
                    while (rs3.next()) {
                        Grafico.listaDatos.add(new Grafico(rs2.getString("modelo"), rs3.getInt("Count")));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Grafico.listaDatos;
    }

    public ArrayList<VuelosPorAvion> cargarVuelosPorAvion() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT c_avion FROM vuelo GROUP BY c_avion HAVING COUNT(*)>0");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT id, modelo FROM avion WHERE id = '" + rs.getInt("c_avion") + "'");
                while (rs2.next()) {
                    rs3 = s.executeQuery("SELECT Count(c_avion) FROM vuelo WHERE c_avion = '" + rs2.getString("id") + "'");
                    while (rs3.next()) {
                        VuelosPorAvion.listaVuelosPorAvion.add(new VuelosPorAvion(rs3.getInt("Count"), rs2.getString("modelo")));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return VuelosPorAvion.listaVuelosPorAvion;
    }

    public ArrayList<TripulantesServicioCliente> cargarTripulantesServicioCliente() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT nombre, trabaja_aerolinea, rol_tripulacion, id_vuelo FROM tripulacion WHERE rol_tripulacion = 'Servicio al cliente' AND id_vuelo IS NOT NULL");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT a.nombre_aerolinea, v.id_vuelo FROM aerolinea a, vuelo v WHERE a.nombre_aerolinea = '" + rs.getString("trabaja_aerolinea") + "' AND v.id_vuelo = " + rs.getInt("id_vuelo") + "");
                while (rs2.next()) {
                    TripulantesServicioCliente.listaTripulantesServicioCliente.add(new TripulantesServicioCliente(rs.getString("nombre"), rs2.getString("nombre_aerolinea"), rs.getString("rol_tripulacion"), rs2.getInt("id_vuelo")));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return TripulantesServicioCliente.listaTripulantesServicioCliente;
    }

    public ArrayList<PilotoVueloRegistrado> cargarPilotoVueloRegistrado() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT nombre, trabaja_aerolinea, id_vuelo FROM tripulacion WHERE rol_tripulacion = 'Piloto' AND id_vuelo IS NOT NULL");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT a.nombre_aerolinea, v.p_abordaje, v.c_avion FROM aerolinea a, vuelo v WHERE a.nombre_aerolinea = '" + rs.getString("trabaja_aerolinea") + "' AND v.id_vuelo = " + rs.getInt("id_vuelo") + "");
                while (rs2.next()) {
                    rs3 = s.executeQuery("SELECT a.modelo, p.estado FROM avion a, puerta p WHERE a.id = '" + rs2.getString("c_avion") + "' AND p.num_puerta = " + rs2.getInt("p_abordaje") + "");
                    while (rs3.next()) {
                        PilotoVueloRegistrado.listaPilotoVueloRegistrado.add(new PilotoVueloRegistrado(rs.getString("nombre"), rs2.getString("nombre_aerolinea"), rs3.getString("modelo"), rs3.getString("estado")));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return PilotoVueloRegistrado.listaPilotoVueloRegistrado;
    }

    public ArrayList<VuelosPorAerolinea> cargarVueloPorAerolinea() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT aerolinea, pista FROM vuelo GROUP BY aerolinea, pista HAVING COUNT(*)>0");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT a.nombre_aerolinea, p.num_pista FROM aerolinea a, pista p WHERE a.nombre_aerolinea = '" + rs.getString("aerolinea") + "' AND p.num_pista = " + rs.getInt("pista") + "");
                while (rs2.next()) {
                    rs3 = s.executeQuery("SELECT Count(aerolinea) FROM vuelo WHERE aerolinea = '" + rs2.getString("nombre_aerolinea") + "' AND pista = " + rs2.getInt("num_pista") + "");
                    while (rs3.next()) {
                        VuelosPorAerolinea.listaVuelosPorAerolinea.add(new VuelosPorAerolinea(rs3.getInt("Count"), rs2.getString("nombre_aerolinea"), rs2.getInt("num_pista")));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return VuelosPorAerolinea.listaVuelosPorAerolinea;
    }

    public ArrayList<VuelosSalidaPanama> cargarVuelosSalidaPanama() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT id_vuelo, a_salida, pista FROM vuelo WHERE a_salida = 'aero_Panama'");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT p.num_pista, p.estado FROM pista p WHERE p.num_pista = " + rs.getInt("pista") + " AND p.estado = 'Disponible'");
                while (rs2.next()) {
                    VuelosSalidaPanama.listaVuelosSalidaPanama.add(new VuelosSalidaPanama(rs.getInt("id_vuelo"), rs.getString("a_salida"), rs2.getInt("num_pista"), rs2.getString("estado")));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return VuelosSalidaPanama.listaVuelosSalidaPanama;
    }

    public ArrayList<EdadTripulantes> cargarEdadTripulantes() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT nombre, AGE(CAST(f_nacimiento AS DATE)) FROM tripulacion");
            while (rs.next()) {
                int edad = Integer.parseInt(rs.getString("AGE").substring(0, 2));
                EdadTripulantes.listaEdadTripulantes.add(new EdadTripulantes(rs.getString("nombre"), edad));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return EdadTripulantes.listaEdadTripulantes;
    }
}
