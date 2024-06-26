/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import codigo.*;
import objetos.TripulantesServicioCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class pnlTripulantesServicioCliente extends javax.swing.JPanel {

    Cargas cargas = new Cargas();
    
    public pnlTripulantesServicioCliente() {
        initComponents();
        mostrarDatosJTable();
    }
    
    public void mostrarDatosJTable() {
        DefaultTableModel model = (DefaultTableModel) tbDatos.getModel();
        model.setRowCount(0);
        TripulantesServicioCliente.listaTripulantesServicioCliente = new ArrayList<>();
        ArrayList<TripulantesServicioCliente> listaTripulantesServicioCliente = cargas.cargarTripulantesServicioCliente();
        Object[] arreglo = new Object[4];
        for (int i = 0; i < listaTripulantesServicioCliente.size(); i++) {
            arreglo[0] = listaTripulantesServicioCliente.get(i).getNombreTripulante();
            arreglo[1] = listaTripulantesServicioCliente.get(i).getAerolineaEnQueTrabaja();
            arreglo[2] = listaTripulantesServicioCliente.get(i).getRolTripulante();
            arreglo[3] = listaTripulantesServicioCliente.get(i).getIdVuelo();
            model.addRow(arreglo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre tripulante", "Aerolínea", "Rol", "Id de vuelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    // End of variables declaration//GEN-END:variables
}
