package Controlador;
import Vista.*;

/**
 *Ventana principal del Sistema, desde acá se accede a los módulos
 * @author Gustavo, Sebastián
 */
public class SistemaMascoTika extends javax.swing.JFrame {
    
    private ListaVeterinarios listaVeterinarios;
    private NuevoVeterinario nuevoVeterinario;
    private ListaProcedimientos listaProcedimientos;
    private CreacionProcedimientos nuevoProcedimientos;
    private CreacionCitaMedica nuevacitamedica;
    private ListaCitaMedica listaCitaMedica;
    private NuevaCategoria nuevacategoria; 
    private ListaCategorias listaCategoria;
    private NuevoPaciente nuevoPaciente;
    private ListaPacientes listaPacientes;
    private GestionPacientes historialclinico;
    private ConsultaPacientes consultaPacientes;
    private ConsultaClientes consultaClientes;
    private ListaUsuarios listaUsuarios;
    private GestionCitasVet gestioncitasvet;
    private Login login;
    private ModuloClientes gestioncitascliente;
    private Filtros filtros;
    private ModuloAdministracion moduloAdministracion;
    private ModuloVeterinarios moduloVeterinarios;
    
    /**
     * Crea un Form para la ventana principal
     */
    public SistemaMascoTika() {
        initComponents();
        setTitle("Sistema MascoTika");
        
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton2.setEnabled(false);
        
        listaVeterinarios = new ListaVeterinarios();
        nuevoVeterinario = new NuevoVeterinario();
        listaProcedimientos = new ListaProcedimientos();
        nuevoProcedimientos = new CreacionProcedimientos();
        nuevacitamedica = new CreacionCitaMedica();
        listaCitaMedica = new ListaCitaMedica();
        nuevacategoria = new NuevaCategoria();
        listaCategoria = new ListaCategorias();
        nuevoPaciente =new NuevoPaciente();
        listaPacientes = new ListaPacientes();
        historialclinico = new GestionPacientes();
        consultaPacientes = new ConsultaPacientes();
        consultaClientes = new ConsultaClientes();
        listaUsuarios = new ListaUsuarios();
        gestioncitasvet = new GestionCitasVet();
        login = new Login();
        gestioncitascliente = new ModuloClientes();
        filtros = new Filtros();
        moduloAdministracion = new ModuloAdministracion();
        moduloVeterinarios = new ModuloVeterinarios();
          
        //Agregamos los frames internos al desktop pane
        desktopPane.add(listaVeterinarios);
        desktopPane.add(nuevoVeterinario);
        desktopPane.add(listaProcedimientos);
        desktopPane.add(nuevoProcedimientos);
        desktopPane.add(nuevacitamedica);
        desktopPane.add(listaCitaMedica);
        desktopPane.add(nuevacategoria);
        desktopPane.add(listaCategoria);
        desktopPane.add(nuevoPaciente);
        desktopPane.add(listaPacientes);
        desktopPane.add(historialclinico);
        desktopPane.add(consultaPacientes);
        desktopPane.add(consultaClientes);
        desktopPane.add(listaUsuarios);
        desktopPane.add(gestioncitasvet);
        desktopPane.add(login);
        desktopPane.add(gestioncitascliente);
        desktopPane.add(filtros);
        desktopPane.add(moduloAdministracion);
        desktopPane.add(moduloVeterinarios);
    }

    //Botones de la ventana principal
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jMenuItem8.setText("jMenuItem8");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setAutoscrolls(true);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(557, 20, 90, 23);

        jButton2.setText("CLIENTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(50, 320, 130, 70);

        jButton3.setText("ADMINISTRADOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton3);
        jButton3.setBounds(50, 140, 130, 70);

        jButton4.setText("VETERINARIO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton4);
        jButton4.setBounds(50, 230, 130, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gestioncitascliente.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        moduloAdministracion.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        moduloVeterinarios.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Método main para la ventana principal
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaMascoTika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaMascoTika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaMascoTika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaMascoTika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaMascoTika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables

}
