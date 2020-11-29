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


public class GestionCitasVet extends javax.swing.JInternalFrame {


    public GestionCitasVet() {
        initComponents();
         modPendiente.setEnabled(false);
        modAsignada.setEnabled(false);
        
    }
    
   
    public void ObtenerDatos(){
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().obtenerRegistros();
         System.out.println();
        System.out.println();
        System.out.println();
        System.out.println( "Estoy obteniendo esta lista en obtener datos RASTA IRIE : " + citasmedicas);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDCitaMed", "Fecha", "Estado","Cedula Cliente"};
        modelo.setColumnIdentifiers(columnas);
        for(CitaMedica cita : citasmedicas){
            String [] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                Integer.toString(cita.getCedulacliente()   ) };
            modelo.addRow(renglon);
            }
       tablacitavet.setModel(modelo);
        }
    
    
    
        public void ObtenerDatosEstados(String Estado){
         List<CitaMedica> citasmedicas = new CitaMedicaDAO().obtenerRegistrosEstado(Estado);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDCitaMed", "Fecha", "Estado","CedulaCliente"};
        modelo.setColumnIdentifiers(columnas);
        for(CitaMedica cita : citasmedicas){
            String [] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                Integer.toString(cita.getCedulacliente())};
            modelo.addRow(renglon);
            }
       tablacitavet.setModel(modelo);
        }
           
        
       public void ObtenerDatosIDGEST(String IDCitaMed){
        List<CitaMedica> citasmedicas = new CitaMedicaDAO().obtenerRegistrosLista(IDCitaMed);    //check this
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDCitaMed", "Fecha", "Estado","CedulaCliente"};
        modelo.setColumnIdentifiers(columnas);
        for(CitaMedica cita : citasmedicas){
            String [] renglon = {cita.getIDCitaMed(),
                cita.getFecha(),
                cita.getEstado(),
                Integer.toString(cita.getCedulacliente())};
            modelo.addRow(renglon);
            }
        tablacitavet.setModel(modelo);
        } 
    
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pendiente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacitavet = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        modPendiente = new javax.swing.JButton();
        modAsignada = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Citas - Veterinario ");

        Pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendienteActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tablacitavet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cita Medica", "Fecha", "Estado", "CedulaCliente", "Veterinario "
            }
        ));
        jScrollPane1.setViewportView(tablacitavet);

        jButton5.setText("Refrescar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        modPendiente.setText("Modificar");
        modPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPendienteActionPerformed(evt);
            }
        });

        modAsignada.setText("Modificar");
        modAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modAsignadaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Cita Medica");

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pendiente");

        jLabel3.setText("Asignada");

        jLabel4.setText("Realizada");

        jLabel5.setText("Cancelada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modPendiente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modAsignada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modAsignada)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(73, 73, 73)
                .addComponent(jButton5)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite una ID de cita valido");
            return;
        }
        String  IDCitaMed = jTextField1.getText();
        System.out.println(IDCitaMed);
        this.ObtenerDatosIDGEST(IDCitaMed);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void PendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendienteActionPerformed

        String  Estado = jLabel2.getText();        
        this.ObtenerDatosEstados(Estado);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        modPendiente.setVisible(true);
        modPendiente.setEnabled(true);   
    }//GEN-LAST:event_PendienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String  Estado = jLabel3.getText();
        this.ObtenerDatosEstados(Estado);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        modAsignada.setVisible(true);
        modAsignada.setEnabled(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String  Estado = jLabel4.getText();  
        this.ObtenerDatosEstados(Estado);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       String  Estado = jLabel5.getText();
        this.ObtenerDatosEstados(Estado);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void modPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPendienteActionPerformed
        String idcitamedica = jTextField1.getText();
        ActualizarCitaMedica actualizarCitaPendiente = new ActualizarCitaMedica();
        SistemaMascoTika.desktopPane.add(actualizarCitaPendiente);
        actualizarCitaPendiente.toFront();
        actualizarCitaPendiente.setVisible(true);
    }//GEN-LAST:event_modPendienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.ObtenerDatos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modAsignadaActionPerformed
       String idcitamedica = jTextField1.getText();
        ActualizarCitaMedica actualizarCitaAsignada = new ActualizarCitaMedica();
        SistemaMascoTika.desktopPane.add(actualizarCitaAsignada);
        actualizarCitaAsignada.toFront();
        actualizarCitaAsignada.setVisible(true);
    }//GEN-LAST:event_modAsignadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pendiente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modAsignada;
    private javax.swing.JButton modPendiente;
    private javax.swing.JTable tablacitavet;
    // End of variables declaration//GEN-END:variables
}
