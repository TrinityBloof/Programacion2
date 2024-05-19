/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConexion {
    
    Connection conectar = null;
    
    
    public Connection getConexion() {
        return conectar;
    }
    
    public Connection Conexion() {
        String url = "jdbc:postgresql://localhost:5432/seguridad";
        String password = "1234";
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(url, "user", password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error: " + e.toString() );
        }
        return conectar;
    }
    
    public void cerrarConexion() {
        try {
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString() );
        }
    }
}
