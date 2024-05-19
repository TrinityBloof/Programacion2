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

    public ArrayList<GraficaPastel> cargarGrafico() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre  FROM tipos_delincuentes");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT Count(tipo_delincuente) FROM delincuentes WHERE tipo_delincuente = '" + rs.getInt("codigo") + "'");
                while (rs2.next()) {
                    GraficaPastel.listaDatos.add(new GraficaPastel(rs.getString("nombre"), rs2.getInt("Count")));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return GraficaPastel.listaDatos;
    }

    public ArrayList<TiposDelincuentes> cargarTiposDelicuentes() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre FROM tipos_delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                TiposDelincuentes.listaTipoDelincuentes.add(new TiposDelincuentes(rs.getInt("codigo"), rs.getString("nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return TiposDelincuentes.listaTipoDelincuentes;
    }

    public ArrayList<Integer> cargarCodigosTiposDelincuentes() {
        ArrayList<Integer> codigos = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo FROM tipos_delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                codigos.add(rs.getInt("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return codigos;
    }

    public TiposDelincuentes cargarUnTipoDelincuente(Integer codigo) {
        TiposDelincuentes datos = new TiposDelincuentes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre FROM tipos_delincuentes WHERE codigo = '" + codigo + "'");
            while (rs.next()) {
                datos.setCodigo(rs.getInt("codigo"));
                datos.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<Organizaciones> cargarOrganizaciones() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, tipo, descripcion, fecha_creacion FROM organizaciones ORDER BY codigo ASC");
            while (rs.next()) {
                Organizaciones.listaOrganizaciones.add(new Organizaciones(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("tipo"), rs.getString("descripcion"), rs.getDate("fecha_creacion")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return Organizaciones.listaOrganizaciones;
    }

    public ArrayList<Integer> cargarCodigosOrganizaciones() {
        ArrayList<Integer> codigos = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo FROM organizaciones ORDER BY codigo ASC");
            while (rs.next()) {
                codigos.add(rs.getInt("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return codigos;
    }

    public Organizaciones cargarUnaOrganizacion(Integer codigo) {
        Organizaciones datos = new Organizaciones();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, tipo, descripcion, fecha_creacion FROM organizaciones WHERE codigo = '" + codigo + "'");
            while (rs.next()) {
                datos.setCodigo(rs.getInt("codigo"));
                datos.setNombre(rs.getString("nombre"));
                datos.setTipo(rs.getString("tipo"));
                datos.setDescripcion(rs.getString("descripcion"));
                datos.setFecha_creacion(rs.getDate("fecha_creacion"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<Delincuentes> cargarDelincuentes() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, fecha_nacimiento, pais_origen, recompensa, alias, tipo_delincuente, organizacion, fecha_primer_delito, cantidad_delitos FROM delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                Delincuentes.listaDelincuentes.add(new Delincuentes(rs.getInt("codigo"), rs.getString("nombre"), rs.getDate("fecha_nacimiento"), rs.getString("pais_origen"), rs.getInt("recompensa"), rs.getString("alias"), rs.getInt("tipo_delincuente"), rs.getInt("organizacion"), rs.getDate("fecha_primer_delito"), rs.getInt("cantidad_delitos")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return Delincuentes.listaDelincuentes;
    }

    public ArrayList<Integer> cargarCodigosDelincuentes() {
        ArrayList<Integer> codigos = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo FROM delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                codigos.add(rs.getInt("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return codigos;
    }

    public Delincuentes cargarUnDelincuente(Integer codigo) {
        Delincuentes datos = new Delincuentes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, fecha_nacimiento, pais_origen, recompensa, alias, tipo_delincuente, organizacion, fecha_primer_delito, cantidad_delitos FROM delincuentes WHERE codigo = '" + codigo + "'");
            while (rs.next()) {
                datos.setCodigo(rs.getInt("codigo"));
                datos.setNombre(rs.getString("nombre"));
                datos.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                datos.setPais_origen(rs.getString("pais_origen"));
                datos.setRecompensa(rs.getInt("recompensa"));
                datos.setAlias(rs.getString("alias"));
                datos.setTipo_delincuente(rs.getInt("tipo_delincuente"));
                datos.setOrganizacion(rs.getInt("organizacion"));
                datos.setFecha_primer_delito(rs.getDate("fecha_primer_delito"));
                datos.setCantidad_delitos(rs.getInt("cantidad_delitos"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<Agentes> cargarAgentes() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, direccion, telefono FROM agentes ORDER BY codigo ASC");
            while (rs.next()) {
                Agentes.listaAgentes.add(new Agentes(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("direccion"), rs.getInt("telefono")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return Agentes.listaAgentes;
    }

    public ArrayList<Integer> cargarCodigosAgentes() {
        ArrayList<Integer> codigos = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo FROM agentes ORDER BY codigo ASC");
            while (rs.next()) {
                codigos.add(rs.getInt("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return codigos;
    }

    public Agentes cargarUnAgente(Integer codigo) {
        Agentes datos = new Agentes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, nombre, direccion, telefono FROM agentes WHERE codigo = '" + codigo + "'");
            while (rs.next()) {
                datos.setCodigo(rs.getInt("codigo"));
                datos.setNombre(rs.getString("nombre"));
                datos.setDireccion(rs.getString("direccion"));
                datos.setTelefono(rs.getInt("telefono"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<ReAgentesDelincuentes> cargarRelacion() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, codigo_agente, codigo_delincuente FROM re_agentes_delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                ReAgentesDelincuentes.listaRelacion.add(new ReAgentesDelincuentes(rs.getInt("codigo"), rs.getInt("codigo_agente"), rs.getInt("codigo_delincuente")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return ReAgentesDelincuentes.listaRelacion;
    }

    public ArrayList<Integer> cargarCodigosRelacion() {
        ArrayList<Integer> codigos = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo FROM re_agentes_delincuentes ORDER BY codigo ASC");
            while (rs.next()) {
                codigos.add(rs.getInt("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return codigos;
    }

    public ReAgentesDelincuentes cargarUnaRelacion(Integer codigo) {
        ReAgentesDelincuentes datos = new ReAgentesDelincuentes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT codigo, codigo_agente, codigo_delincuente FROM re_agentes_delincuentes WHERE codigo = '" + codigo + "'");
            while (rs.next()) {
                datos.setCodigo(rs.getInt("codigo"));
                datos.setCodigoAgente(rs.getInt("codigo_agente"));
                datos.setCodigoDelincuente(rs.getInt("codigo_delincuente"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<Reporte> cargarReporte(Integer codigo) {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs2 = s.executeQuery("SELECT codigo_delincuente FROM re_agentes_delincuentes WHERE codigo_agente = '" + codigo + "'");
            while (rs2.next()) {
                rs = s.executeQuery("SELECT nombre FROM agentes WHERE codigo = '" + codigo + "'");
                while (rs.next()) {
                    rs3 = s.executeQuery("SELECT nombre, alias, tipo_delincuente, organizacion FROM delincuentes WHERE codigo = '" + rs2.getInt("codigo_delincuente") + "'");
                    while (rs3.next()) {
                        rs4 = s.executeQuery("SELECT nombre FROM tipos_delincuentes WHERE codigo = '" + rs3.getInt("tipo_delincuente") + "'");
                        while (rs4.next()) {
                            rs5 = s.executeQuery("SELECT nombre FROM organizaciones WHERE codigo = '" + rs3.getInt("organizacion") + "'");
                            while (rs5.next()) {
                                Reporte.listaReporte.add(new Reporte(rs.getString("nombre"), rs3.getString("nombre"), rs3.getString("alias"), rs4.getString("nombre"), rs5.getString("nombre")));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Reporte.listaReporte;
    }
}
