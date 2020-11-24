
package Vista;

import Controlador.SistemaMascoTika;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JInternalFrame {
    
    
    private RegistroCliente    registrocliente;
     private RegistroVet   vetregister;
    
    public Login() {
        initComponents();
        jComboBox1.addItem("Veterinario");
        jComboBox1.addItem("Cliente");
        jComboBox1.addItem("Administrador");
        
        registrocliente =new RegistroCliente();
        vetregister =new RegistroVet();
        
         
   
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("MascoTika Login");

        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Rol:");

        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarme");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        
     
        
        
        
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String USERNAME = jTextField1.getText();
        String PASSWORD= jTextField2.getText();
        String ROLE=(String) jComboBox1.getSelectedItem();
        
        
        Usuario user =new UsuarioDAO().obtenerRegistro(ROLE, USERNAME, PASSWORD);
        

        
       if (user== null){
           JOptionPane.showMessageDialog(rootPane, "Este usuario no esta registrado, registrelo!");
           return; 
        }
        
        if(ROLE.equalsIgnoreCase("Veterinario")){
            if(user.getNombreUsuario().equals(USERNAME) && user.getContraseña().equals(PASSWORD) && user.getRol().equals(ROLE)){
                
                 JOptionPane.showMessageDialog(rootPane, " Bienvenido al sistema veterinario");   
            }
            else{
                JOptionPane.showMessageDialog(rootPane, " El usuario no esta registrado en el sistema, registrelo !");
            }
            
        }
        
         if(ROLE.equalsIgnoreCase("Cliente")){
             if(user.getNombreUsuario().equals(USERNAME) && user.getContraseña().equals(PASSWORD) && user.getRol().equals(ROLE)){
                
                 JOptionPane.showMessageDialog(rootPane, " Bienvenido al sistema cliente");   
            }
                else{
                JOptionPane.showMessageDialog(rootPane, " El usuario no esta registrado en el sistema, registrelo !");
            }
        }
         
         if(ROLE.equalsIgnoreCase("Administrador")){
            System.out.println(" SE ABRE MODULO DE ADMINISTRADOR VERDAAA");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String ROLE =  (String) jComboBox1.getSelectedItem();
        
        if(ROLE.equalsIgnoreCase("Veterinario")){
           
         RegistroVet  registervet = new RegistroVet();
        SistemaMascoTika.desktopPane.add(registervet);
       registervet.toFront();
       registervet.setVisible(true);
        }
        
         if(ROLE.equalsIgnoreCase("Cliente")){
         RegistroCliente  registrocliente = new RegistroCliente();
        SistemaMascoTika.desktopPane.add(registrocliente);
       registrocliente.toFront();
       registrocliente.setVisible(true); 
             
             
        }
         
         if(ROLE.equalsIgnoreCase("Administrador")){
        
        /**SistemaMascoTika.desktopPane.add(registeradm);
       registeradm.toFront();
       registeradm.setVisible(true); */
       
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
