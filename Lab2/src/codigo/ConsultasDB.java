/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import database.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
        
public class ConsultasDB {
    
    DBConexion con = new DBConexion();
    
    private PreparedStatement ps;
    
    public void ejecutarSQL(String sql) {
        con.Conexion();
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.execute();
            ps.close();
            con.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Consulta realizada.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
