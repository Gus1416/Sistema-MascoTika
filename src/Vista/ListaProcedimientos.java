/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SistemaMascoTika;
import Modelo.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaProcedimientos extends javax.swing.JInternalFrame {

  
    
    
    //// Calm down
    
    
    
    public ListaProcedimientos() {
        initComponents();
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    
    
    public void ObtenerDatos(){
        List<Procedimiento> procedimientos = new ProcedimientoDAO().obtenerRegistrosLista();
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "Nombre", "ID", "Tipo", "MontoUnitario","MontoServAdom","Descripcion"};
        modelo.setColumnIdentifiers(columnas);
        for(Procedimiento proced : procedimientos){
            String [] renglon = {proced.getNombreProcedimiento(),
                proced.getIDProcedimiento(),
                proced.getTipo(),
                Integer.toString(proced.getMontoUnitario()),
                Integer.toString(proced.getMontoServAdom()),
                proced.getDescripcionProcedimiento()};
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
    
    public void ObtenerDatos(String IDProcedimiento){
        List<Procedimiento> procedimientos = new ProcedimientoDAO().obtenerRegistroIDLista(IDProcedimiento);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "ID Procedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","CodigoCategoria","IDPaciente"};
        modelo.setColumnIdentifiers(columnas);
        for(Procedimiento proced : procedimientos){
            String [] renglon = {proced.getIDProcedimiento(),
                proced.getTipo(),
                Integer.toString(proced.getMontoUnitario()),
                Integer.toString(proced.getMontoServAdom()),
                proced.getDescripcionProcedimiento(),
                Integer.toString(proced.getCodigoCategoria()),
                Integer.toString(proced.getIDPaciente())    };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista Procedimientos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Procedimiento", "Tipo", "Monto Unitario", "Monto A domicilio", "Cod.Categoria ", "ID Procedimiento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Busqueda Avanzada");

        jLabel2.setText("ID Procedimiento");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refrescar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Asignar Procedimiento");

        jLabel4.setText("Digite su ID:");

        jButton5.setText("Asignar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite una cedula valida");
            return;
        }
        String  IDProcedimiento = jTextField1.getText();
       this.ObtenerDatos(IDProcedimiento);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String IDProcedimiento = jTextField1.getText();
        ActualizarProcedimiento actualizarProcedimiento = new ActualizarProcedimiento(IDProcedimiento);
        SistemaMascoTika.desktopPane.add(actualizarProcedimiento);
        actualizarProcedimiento.toFront();
        actualizarProcedimiento.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String  IDProcedimiento = jTextField1.getText();
        int proced = new ProcedimientoDAO().eliminar(IDProcedimiento);
        if (proced == 0){
           JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar el veterinario");
           return; 
        }
        JOptionPane.showMessageDialog(rootPane, "Se elimino al procedimiento con ID: "+ IDProcedimiento);
        jTextField1.setText("");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.ObtenerDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String IDVet = jTextField2.getText();
        int fila = jTable1.getSelectedRow();
        String IDProcedimiento = jTable1.getValueAt(fila, 1).toString();
        VeterinarioProcedimiento vetproc = new VeterinarioProcedimientoDAO().insertar(IDVet, IDProcedimiento);
        if (vetproc == null) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo asignar el procedimeinto");
        }
        JOptionPane.showMessageDialog(rootPane, "Prcedimiento " + IDProcedimiento + " asignado a Veterinario " + IDVet);

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
