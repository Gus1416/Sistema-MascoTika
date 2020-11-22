/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.PacienteDAO;
import Modelo.*;
import Modelo.VeterinarioDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class CitasPaciente extends javax.swing.JInternalFrame {

    String IDPaciente;
    /**
     * Creates new form CitasPaciente
     */
    public CitasPaciente(String IDPaciente) {
        initComponents();
        this.IDPaciente = IDPaciente;
    }
    
    public void ObtenerDatos(String IDPaciente){
        List<ConsultPaci> consultPacis = new PacienteDAO().consultaCitasPaciente(IDPaciente);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID Cita Medica", "Fecha", "Estado", "Cedula Cliente", "Tipo"};
        modelo.setColumnIdentifiers(columnas);
        for (ConsultPaci consultPaci : consultPacis){
            String[] renglon = {consultPaci.getIDCitaMed(), 
                consultPaci.getFecha(), 
                consultPaci.getEstado(), 
                Integer.toString(consultPaci.getCedulaCliente()), 
                consultPaci.getTipo()};

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
