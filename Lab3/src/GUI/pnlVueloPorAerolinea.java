/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import codigo.*;
import objetos.VuelosPorAerolinea;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class pnlVueloPorAerolinea extends javax.swing.JPanel {

    Cargas cargas = new Cargas();
    
    public pnlVueloPorAerolinea() {
        initComponents();
        mostrarDatosJTable();
    }
    
    public void mostrarDatosJTable() {
        DefaultTableModel model = (DefaultTableModel) tbDatos.getModel();
        model.setRowCount(0);
        VuelosPorAerolinea.listaVuelosPorAerolinea = new ArrayList<>();
        ArrayList<VuelosPorAerolinea> listaVuelosPorAerolinea = cargas.cargarVueloPorAerolinea();
        Object[] arreglo = new Object[3];
        for (int i = 0; i < listaVuelosPorAerolinea.size(); i++) {
            arreglo[0] = listaVuelosPorAerolinea.get(i).getCantidadVeces();
            arreglo[1] = listaVuelosPorAerolinea.get(i).getNombreAerolinea();
            arreglo[2] = listaVuelosPorAerolinea.get(i).getNumeroPista();
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cantidad de vuelos", "Aerolínea", "# Pista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                .addGap(236, 236, 236)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    // End of variables declaration//GEN-END:variables
}