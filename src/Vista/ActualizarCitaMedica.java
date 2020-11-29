
package Vista;


import javax.swing.JOptionPane;



import Modelo.CitaMedica;
import Modelo.CitaMedicaDAO;
import Modelo.Database;
import Modelo.FacturaData;
import Modelo.PDF;
import Modelo.Persona;
import Modelo.SendEmail;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ActualizarCitaMedica extends javax.swing.JInternalFrame {

  
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Procedimiento;
    private String Categoria;
    private String Veterinario;
    private int Paciente;
    private int MontoUnitario;
    private int MontoADomicilio;
    
    
    public ActualizarCitaMedica() {
        initComponents();
    }

   
    
    
    private String IDCitaMed;
      
    
   
    
   public List obtenerRegistroFactura(String IDCitavet){
 
        String query ="SELECT * FROM Veterinario, Procedimiento, [Cita Medica], CitaMedicaContieneProcedimientos, VeterinarioEjecutaProcedimiento WHERE Procedimiento.IDProcedimiento = VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND CitaMedicaContieneProcedimientos.IDCitaMed = [Cita Medica].IDCitaMed AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento AND [Cita Medica].IDCitaMed = '"+IDCitavet+"'         ";   
        List<Map> registros = new Database().ejecutar(query);
        List<FacturaData> search = new ArrayList();
        for (Map registro : registros){
            FacturaData   factura = new FacturaData (
                    (String)registro.get("Tipo"), 
                    (String)registro.get("NombreProcedimiento"), 
                    (String)registro.get("IDVet"),
                    (int)registro.get("IDPaciente"), 
                    (int)registro.get("MontoUnitario"), 
                     (int)registro.get("MontoServAdom"));
                    search.add(factura);
                    
                    Procedimiento= factura.getProcedimiento() ;
                    Categoria=factura.getCategoria();
                    Veterinario=factura.getVeterinario();
                    Paciente=factura.getPaciente();
                    MontoUnitario=factura.getMontoUnitario();
                    MontoADomicilio=factura.getMontoADomicilio();
          
        }        
         return search  ;     
    }  
 
   public List obtenerRegistros(int Cedula){
        String q = "SELECT * FROM Persona WHERE Cedula=" + Cedula;
        List<Map> registros = new Database().ejecutar(q);
        List<Persona> personas = new ArrayList();
        for (Map registro : registros){
            Persona persona = new Persona(
                    (int)registro.get("Cedula"),
            (String)registro.get("Nombre"),
            (String)registro.get("Apellido"),
            (String)registro.get("Provincia"),
            (String)registro.get("Canton"),
            (String)registro.get("Distrito"),
            (String)registro.get("Email"),
            (String)registro.get("NombreUsuario"));
            personas.add(persona);
            Nombre= persona.getNombre();
            Apellido= persona.getApellido();
             Email= persona.getEmail(); 
        }
        
        
        return personas;
    }
    

    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Digite la informacion de la Cita");

        jLabel2.setText("ID Cita Medica");

        jLabel3.setText("Fecha");

        jLabel4.setText("Estado");

        jLabel5.setText("Cedula Cliente");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(28, 28, 28)
                            .addComponent(jTextField4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(70, 70, 70)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(75, 75, 75)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        String IDCitaMed= jTextField1.getText();
        String Fecha = jTextField2.getText();
        String Estado = jTextField3.getText();
        String CedulaCliente = jTextField4.getText();
        
        System.out.println(IDCitaMed);
        System.out.println(Fecha);
        System.out.println(Estado);
        System.out.println(CedulaCliente);
        
        List iniciarvariables = this.obtenerRegistros(Integer.parseInt(CedulaCliente));
        List generarvarfactura= this.obtenerRegistroFactura(IDCitaMed);
              
        if(IDCitaMed.equals("") || Fecha.equals("") || Estado.equals("") || CedulaCliente.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Por Favor llene todos los campos mi bro");
            return;
        }
        
        if(Estado.equals("Asignada")){
           PDF facturar = new PDF();
           facturar.Facturar(Nombre, Apellido, Procedimiento, Categoria, Veterinario, Paciente, MontoUnitario, MontoADomicilio);
            
            int citamed = new CitaMedicaDAO().actualizar(IDCitaMed, Fecha, Estado,Integer.parseInt(CedulaCliente));   
            JOptionPane.showMessageDialog(rootPane, "Informacion de la cita medica con ID : "+IDCitaMed+" actualizada");    
         
            
            // int Ced =  this.obtenerRegistros(Integer.parseInt(CedulaCliente)).getCedula();
           // String name = this.obtenerRegistros(Integer.parseInt(CedulaCliente)).getNombre();
            //String apellido= this.obtenerRegistros(Integer.parseInt(CedulaCliente)).getApellido();
           // String correo =   this.obtenerRegistros(Integer.parseInt(CedulaCliente)).getEmail();
            
            
           
            SendEmail mail = new SendEmail();
            mail.EnvioMail(Email, Nombre, Apellido, Fecha);
            JOptionPane.showMessageDialog(rootPane, "Informacion de la cita medica con ID : "+IDCitaMed+" actualizada");
        
        }
        
        // Por si el mae le pone algun estado distinto
        int citamed = new CitaMedicaDAO().actualizar(IDCitaMed, Fecha, Estado,Integer.parseInt(CedulaCliente));
        
        if (citamed== 0){
           JOptionPane.showMessageDialog(rootPane, "No se pudo actualizar la informacion :(");
           return; 
        }
        
       JOptionPane.showMessageDialog(rootPane, "Informacion de la cita medica con ID : "+IDCitaMed+" actualizada"); 
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
      jTextField4.setText("");
       this.setVisible(false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
