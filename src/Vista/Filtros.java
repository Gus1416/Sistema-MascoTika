


package Vista;

import Controlador.SistemaMascoTika;
import Modelo.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Filtros extends javax.swing.JInternalFrame {

 
    public Filtros() {
        initComponents();
    }
    
   
      public void ObtenerDatosTotales(String Categoria,String Tipo,String Ubicacion, int monto1, int monto2 ){
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosConsultaCompleta(Categoria, Tipo, Ubicacion, monto1, monto2);      
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      
      public void ObtenerSoloTIPO(String Tipo ){
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosSoloTipoString(Tipo);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      public void ObtenerSoloCategoria(String Categoria ){
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosSoloCategoria(Categoria);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      
      public void ObtenerSoloUbicacion(String Ubicacion ){
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosSoloUbicacion(Ubicacion);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      
      public void ObtenerSoloMontos(int monto1, int monto2 ){
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosSoloPorMonto(monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      
      
       public void ObtenerTIPOyCATEG(String Categoria,String Tipo ){
        System.out.println("Me llega esto como tipo:"  + Tipo );
        System.out.println("Me llega esto como categoria:"  + Categoria);   
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosCategoriayTipo(Categoria, Tipo);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
       
       
        public void ObtenerTipoyUBICACION(String Tipo,String Ubicacion ){
            
        System.out.println("Me llega esto como tipo:"  + Tipo );
        System.out.println("Me llega esto como ubicacion:"  + Ubicacion);    
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosTipoyUbicacion(Tipo, Ubicacion);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
        
        
         public void ObtenerTIPOyMONTOS(String Tipo, int monto1, int monto2 ){
         System.out.println("Me llega esto como tipo dentro del metodo:"  + Tipo );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 );     
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosTipoyMontos(Tipo, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
         
         
          public void ObtenerCATEGyUBICA(String Categoria,String Ubicacion ){
         System.out.println("Me llega esto como categoria:"  + Categoria );
        System.out.println("Me llega esto como ubicacion:"  + Ubicacion);       
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosCategoyUbicacion(Categoria, Ubicacion);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      public void ObtenerCATEGyMONTOS(String Categoria, int monto1, int monto2 ){
          
        System.out.println("Me llega esto como categoria  dentro del metodo:"  + Categoria );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 );   
        
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosConsultaCategoriayMontos(Categoria, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
      
      
       public void ObtenerUBICAyMONTOS(String Ubicacion, int monto1, int monto2 ){
        
        System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 );     
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerRegistrosUbicacionyMontos(Ubicacion, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
       
       
       public void GETUbicacionCategoriaTipos(String Ubicacion, String Categoria, String Tipo ){
        
        System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Tipo"  + Tipo);    
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerUBICACATEGOTYPE(Ubicacion, Categoria, Tipo);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
       
       
        public void GETUbicacionCategoriaMontos(String Ubicacion, String Categoria, int monto1, int monto2 ){
        
        System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);    
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerUBICACATEGOMONTOSS(Ubicacion, Categoria, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
        
        
        public void GETUbicacionMontosTipo(String Ubicacion, String Tipo, int monto1, int monto2 ){
        
        System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Tipo ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);  
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerUBICAMONTOSTYPE(Tipo, Ubicacion, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
   public void GETCategoMontosTipo(String Categoria, String Tipo, int monto1, int monto2 ){
        
         System.out.println("Me llega esto como Tipo  dentro del metodo:"  + Tipo);
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);   
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerTYPECATEGOMONTOSS(Tipo, Categoria, monto1, monto2);
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
            modelo.addRow(renglon);
            }
       jTable1.setModel(modelo);
        }
        
        
        
       
       
       
       
     
      public void ObtenerRegistros(){
        
          
        List<BusquedaAvanzada>   consulta = new BusquedaAvanzadaDAO().obtenerDATA();
        DefaultTableModel modelo = new DefaultTableModel();
        String [] columnas= { "IDProcedimiento", "Tipo", "MontoUnitario","MontoServAdom","Descripcion","NombreCategoria","IDVet","Horario","Ubicacion"};
        modelo.setColumnIdentifiers(columnas);
        for(BusquedaAvanzada  query : consulta){
            String [] renglon = { query.getIDProcedimiento(),
                query.getTipo(),
                Integer.toString(query.getMontoUnitario()),
                Integer.toString(query.getMontoServAdom()),
                query.getDescripcionProced(),
                query.getCategoria(),
                query.getIDVet(),
                query.getHorario(),
                query.getUbicacion()             };
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busqueda Avanzada - Cliente");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proced", "Tipo", "MontoUnitario", "Mont A Dom", "DescripProce", "Categoria", "IDVet", "Horario", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Escriba su consulta");

        jRadioButton1.setText("jRadioButton1");

        jLabel2.setText("Tipo de Procedimiento");

        jLabel3.setText("Categoria");

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ubicacion de Veterinario");

        jRadioButton3.setText("jRadioButton3");

        jLabel6.setText("Rango de Precios");

        jRadioButton5.setText("jRadioButton5");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio1");

        jLabel8.setText("Precio2");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
  
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed

    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
     
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String  Tipo=  jTextField1.getText();
       String  Categoria= jTextField2.getText();
       String Ubicacion = jTextField3.getText();
       String Monto1=  jTextField5.getText();
       String  Monto2 =   jTextField6.getText();
          
       
       
       ///TODO
       if  ( jRadioButton1.isSelected() &&   jRadioButton2.isSelected() &&  jRadioButton3.isSelected() &&  jRadioButton5.isSelected() ) {
           this.ObtenerDatosTotales(Categoria, Tipo, Ubicacion, Integer.parseInt(Monto1), Integer.parseInt(Monto2));
       } 
       
       //SOLO TIPO
       if  ( jRadioButton1.isSelected() ) {
           this.ObtenerSoloTIPO(Tipo);
       } 
       
       //SOLO CATEGORIA
       if  (   jRadioButton2.isSelected() ) {
           this.ObtenerSoloCategoria(Categoria);
       } 
     //SOLO UBICACION  
      if  (  jRadioButton3.isSelected() ) {
           this.ObtenerSoloUbicacion(Ubicacion);
       } 
      
      //SOLO MONTOS
      if  ( jRadioButton5.isSelected() ) {
          this.ObtenerSoloMontos(Integer.parseInt(Monto1), Integer.parseInt(Monto2));
       } 
   
      
      //Tipoy Categoria
      
      if  ( jRadioButton1.isSelected() &&   jRadioButton2.isSelected() ) {
           this.ObtenerTIPOyCATEG(Categoria, Tipo);
       }
      
      // Tipo y Ubicacion 
      if  ( jRadioButton1.isSelected() &&    jRadioButton3.isSelected()  ) {
         this.ObtenerTipoyUBICACION(Tipo, Ubicacion);
       } 
      
      // TIPO Y MONTOS
      
      if  ( jRadioButton1.isSelected()  &&  jRadioButton5.isSelected() ) {
           this.ObtenerTIPOyMONTOS(Tipo, Integer.parseInt(Monto1), Integer.parseInt(Monto2));
       } 
      
      
      
      //CATEGORIA Y UBICACION
      
      if  (   jRadioButton2.isSelected() &&  jRadioButton3.isSelected()  ) {
           this.ObtenerCATEGyUBICA(Categoria, Ubicacion);
       } 
      
      //Categoria y montos 
      
      if  (   jRadioButton2.isSelected() &&  jRadioButton5.isSelected() ) {
           this.ObtenerCATEGyMONTOS(Categoria, Integer.parseInt(Monto1), Integer.parseInt(Monto2));
       } 
      
      //**************************************************************************************************************************
      
      //UBICACION Y MONTOS
      
      if  ( jRadioButton3.isSelected() &&  jRadioButton5.isSelected() ) {
          this.ObtenerUBICAyMONTOS(Ubicacion, Integer.parseInt(Monto1), Integer.parseInt(Monto2));
       } 
      
      //***************************************************************************************************
      /// TIPO, CATEGORIA Y UBICACION
      if  ( jRadioButton1.isSelected() &&   jRadioButton2.isSelected() &&  jRadioButton3.isSelected()) {
         
       }
      
      /// CATEGORIA UBICACION Y MONTOS
       if  (  jRadioButton2.isSelected() &&  jRadioButton3.isSelected() &&  jRadioButton5.isSelected() ) {
          
       } 
       
       /// TIPO UBICACION Y MONTOS
        if  ( jRadioButton1.isSelected() &&  jRadioButton3.isSelected() &&  jRadioButton5.isSelected() ) {
           
       } 
        
        /// TIPO Categoria Y MONTOS
        if  ( jRadioButton1.isSelected() &&  jRadioButton3.isSelected() &&  jRadioButton5.isSelected() ) {
          
       } 
      
        
      
      
      
      
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
