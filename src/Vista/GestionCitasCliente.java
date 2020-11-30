/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.CitaMedica;
import Modelo.CitaMedicaDAO;
import Modelo.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class GestionCitasCliente extends javax.swing.JInternalFrame {

  
    /**
     * Creates new form GestionCitasCliente
     */
    public GestionCitasCliente() {
        initComponents();
    }
    
    

    public void ObtenerDatos(int CedulaCliente) {
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().CitasPorCliente(CedulaCliente);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID Cita", "Fecha", "Estado", "Procedimiento", "Categoria", "Veterinario"};
        modelo.setColumnIdentifiers(columnas);
        for (CitaMedica cita : citasmedicas) {
            String[] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                cita.getNombreProcedimiento(),
                cita.getCategoriaProcedimiento(),
                cita.getNombreVet()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
    }
    
    public void ObtenerDatosEstado(int Cedula, String Estado) {
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().CitasPorEstado(Cedula, Estado);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID Cita", "Fecha", "Estado", "Procedimiento", "Categoria", "Veterinario"};
        modelo.setColumnIdentifiers(columnas);
        for (CitaMedica cita : citasmedicas) {
            String[] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                cita.getNombreProcedimiento(),
                cita.getCategoriaProcedimiento(),
                cita.getNombreVet()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
    }
    
    public void ObtenerDatosCategoria(int Cedula, String Categoria) {
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().CitasPorCategoria(Cedula, Categoria);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID Cita", "Fecha", "Estado", "Procedimiento", "Categoria", "Veterinario"};
        modelo.setColumnIdentifiers(columnas);
        for (CitaMedica cita : citasmedicas) {
            String[] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                cita.getNombreProcedimiento(),
                cita.getCategoriaProcedimiento(),
                cita.getNombreVet()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
    }
    
    public void ObtenerDatosVeterinario(int Cedula, String Veterinario) {
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().CitasPorVeterinario(Cedula, Veterinario);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID Cita", "Fecha", "Estado", "Procedimiento", "Categoria", "Veterinario"};
        modelo.setColumnIdentifiers(columnas);
        for (CitaMedica cita : citasmedicas) {
            String[] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                cita.getNombreProcedimiento(),
                cita.getCategoriaProcedimiento(),
                cita.getNombreVet()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Pendientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Canceladas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda Avanzada");

        jLabel2.setText("Categoria:");

        jLabel3.setText("Veterinario:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar Cita");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(41, 41, 41)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        this.ObtenerDatosEstado(Cedula, "Cancelada");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        this.ObtenerDatosEstado(Cedula, "Pendiente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        this.ObtenerDatosEstado(Cedula, "Asignada");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        String Categoria = jTextField1.getText();
        this.ObtenerDatosCategoria(Cedula, Categoria);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        String Veterinario = jTextField2.getText();
        this.ObtenerDatosVeterinario(Cedula, Veterinario);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila = jTable1.getSelectedRow();
        String IDCitaMed = jTable1.getValueAt(fila, 0).toString();
        String Fecha = jTable1.getValueAt(fila, 1).toString();
        int Cedula = Integer.parseInt(ModuloClientes.jTextField1.getText());
        String Estado = "Cancelada";
        
        int cita = new CitaMedicaDAO().actualizar(IDCitaMed, Fecha, Estado, Cedula);
        JOptionPane.showMessageDialog(rootPane, "Cita Cancelada");
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
