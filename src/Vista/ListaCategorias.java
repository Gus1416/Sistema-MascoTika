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
    

public class ListaCategorias extends javax.swing.JInternalFrame {
    
    public ListaCategorias() {
        initComponents();
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }

    
     public void ObtenerDatos(){
        List<CategoriaServicio> categoria = new CategoriaServicioDAO().obtenerRegistrosCategoList();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Codigo Categoria", "Nombre Categoria", "Estado", "Descripcion Categoria", "Tipo Categoria"};
        modelo.setColumnIdentifiers(columnas);
        for (CategoriaServicio catego : categoria){
            String[] renglon = {Integer.toString(catego.getCodigoCategoria()), 
                catego.getNombreCategoria(), 
                catego.getEstado(), 
                catego.getDescripcionCategoria(), 
                catego.getTipoCategoria()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
    }
     
     
     public void ObtenerDatosCategoCode(int CodigoCategoria){
        List<CategoriaServicio> categoria = new CategoriaServicioDAO().obtenerRegistrosCategoCodList(CodigoCategoria);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Codigo Categoria", "Nombre Categoria", "Estado", "Descripcion Categoria", "Tipo Categoria"};
        modelo.setColumnIdentifiers(columnas);
        for (CategoriaServicio catego : categoria){
            String[] renglon = {Integer.toString(catego.getCodigoCategoria()), 
                catego.getNombreCategoria(), 
                catego.getEstado(), 
                catego.getDescripcionCategoria(), 
                catego.getTipoCategoria()};
            modelo.addRow(renglon);
        }
        jTable1.setModel(modelo);
    }
     
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista Categorias");

        jLabel1.setText("Codigo Categoria");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Refrescar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(codigo)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (codigo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite una cedula valida");
            return;
        }
        int CodigoCategoria = Integer.parseInt(codigo.getText());
        this.ObtenerDatosCategoCode(CodigoCategoria);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true); 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int CodigoCategoria = Integer.parseInt(codigo.getText());
        ActualizarCategoria actualizarcategoria = new ActualizarCategoria(CodigoCategoria);
        SistemaMascoTika.desktopPane.add(actualizarcategoria);
        actualizarcategoria.toFront();
        actualizarcategoria.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int CodigoCategoria = Integer.parseInt(codigo.getText());
        int catego = new CategoriaServicioDAO().eliminar(CodigoCategoria);
        if (catego == 0){
           JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar el veterinario");
           return; 
        }
        JOptionPane.showMessageDialog(rootPane, "Se elimino la categoria con ID "+CodigoCategoria);
        codigo.setText("");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.ObtenerDatos();
    }//GEN-LAST:event_jButton4ActionPerformed


    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
