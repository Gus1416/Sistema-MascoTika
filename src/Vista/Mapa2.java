
package Vista;

import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.dom.By;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.dom.DOMElement;
import com.teamdev.jxbrowser.chromium.dom.DOMInputElement;
import com.teamdev.jxbrowser.chromium.events.ConsoleEvent;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;
import Modelo.*;
import java.util.List;
import Vista.*;



public class Mapa2 extends javax.swing.JFrame {

    public Mapa2() {
        ModificarHTML();
        initComponents();
        open_site();
    }

 public String ObtenerDatosLat(int Cedula){
        List<UbicacionPersona> lat = new UbicacionPersonaDAO().consultarLatitud(Cedula);
        String latitud = lat.get(0).toString();
        return latitud;
    } 
 public String ObtenerDatosLon(int Cedula){
        List<UbicacionPersona> lon = new UbicacionPersonaDAO().consultarLongitud(Cedula);
        String longitud = lon.get(0).toString();
        return longitud;
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        map_panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ruta Hacia Su Veterinario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map_panel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(map_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 830, 600));

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 45)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" M\n A\n S\n C\n O\n T\n I\n K\n A");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(746, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(rootPane, "Veterinario registrado");
        this.setVisible(false);       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel map_panel;
    // End of variables declaration//GEN-END:variables

Browser browser;
BrowserView view;

private void open_site(){
    BrowserUtil.setVersion(Version.V6_22);
    
    browser = new Browser();
    view = new BrowserView(browser);
    
    map_panel.add(view, BorderLayout.CENTER);
    
    browser.addTitleListener((TitleEvent evt) -> {
        setTitle (evt.getTitle());
    });
    
    browser.addConsoleListener((ConsoleEvent evt) -> {
        System.out.println("LOG:" +evt.getMessage());
    });
    
    browser.addLoadListener(new LoadAdapter(){        
        @Override
            public void onFinishLoadingFrame(FinishLoadingEvent evt) {
                evt.getBrowser().setZoomLevel(-2);
            }
    });
    
    browser.loadURL("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\Sistema MascoTika\\HTMLGMaps\\simple_map2.html");
}
    public void ModificarHTML(){
         
        String latCliente = SolicitarCita.getLatCliente();
        String lonCliente = SolicitarCita.getLonCliente();
        String latVeterinario = SolicitarCita.getLatVet();
        String lonVeterinario = SolicitarCita.getLonVet();
        
        String HTML = 
                "<!DOCTYPE html>\n" +
"<html>\n" +
"  <head>\n" +
"    <title>Distance Matrix Service</title>\n" +
"    <script src=\"https://polyfill.io/v3/polyfill.min.js?features=default\"></script>\n" +
"    <script\n" +
"      src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAybuV4kX7ogp97TusKeAuzXaCW_OoJ1Rg&callback=initMap&libraries=&v=weekly\"\n" +
"      defer\n" +
"    ></script>\n" +
"    <style type=\"text/css\">\n" +
"\n" +
"      html,\n" +
"      body {\n" +
"        height: 80%;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"      }\n" +
"\n" +
"      #map {\n" +
"        height: 700px;\n" +
"        width: 100%;\n" +
"      }\n" +
"\n" +
"      #output {\n" +
"        font-size: 40px;\n" +
"      }\n" +
"    </style>\n" +
"    <script>\n" +
"      function initMap() {\n" +
"\n" +
"        const directionsRenderer = new google.maps.DirectionsRenderer();\n" +
"        const directionsService = new google.maps.DirectionsService();\n" +
"        const bounds = new google.maps.LatLngBounds();\n" +
"        const markersArray = [];\n" +
"        const origin1 = { lat: "+ latCliente +", lng: "+ lonCliente +" };\n" +
"        const destinationA = { lat: "+ latVeterinario +", lng: "+ lonVeterinario +" };\n" +
"        const destinationIcon =\n" +
"          \"https://chart.googleapis.com/chart?\" +\n" +
"          \"chst=d_map_pin_letter&chld=D|FF0000|000000\";\n" +
"        const originIcon =\n" +
"          \"https://chart.googleapis.com/chart?\" +\n" +
"          \"chst=d_map_pin_letter&chld=O|FFFF00|000000\";\n" +
"        const map = new google.maps.Map(document.getElementById(\"map\"), {\n" +
"          center: { lat: 9.847481937010377, lng: -83.9407497023317 },\n" +
"          zoom: 10,\n" +
"        });\n" +
"\n" +
"        directionsRenderer.setMap(map);\n" +
"        calculateAndDisplayRoute(directionsService, directionsRenderer);\n" +
"        document.getElementById(\"mode\").addEventListener(\"change\", () => {\n" +
"          calculateAndDisplayRoute(directionsService, directionsRenderer);\n" +
"        });\n" +
"        const geocoder = new google.maps.Geocoder();\n" +
"        const service = new google.maps.DistanceMatrixService();\n" +
"        service.getDistanceMatrix(\n" +
"          {\n" +
"            origins: [origin1],\n" +
"            destinations: [destinationA],\n" +
"            travelMode: google.maps.TravelMode.DRIVING,\n" +
"            unitSystem: google.maps.UnitSystem.METRIC,\n" +
"            avoidHighways: false,\n" +
"            avoidTolls: false,\n" +
"          },\n" +
"          (response, status) => {\n" +
"            if (status !== \"OK\") {\n" +
"              alert(\"Error was: \" + status);\n" +
"            } else {\n" +
"              const originList = response.originAddresses;\n" +
"              const destinationList = response.destinationAddresses;\n" +
"              const outputDiv = document.getElementById(\"output\");\n" +
"              outputDiv.innerHTML = \"\";\n" +
"              deleteMarkers(markersArray);\n" +
"\n" +
"              const showGeocodedAddressOnMap = function (asDestination) {\n" +
"                const icon = asDestination ? destinationIcon : originIcon;\n" +
"\n" +
"                return function (results, status) {\n" +
"                  if (status === \"OK\") {\n" +
"                    map.fitBounds(bounds.extend(results[0].geometry.location));\n" +
"                    markersArray.push(\n" +
"                      new google.maps.Marker({\n" +
"                        map,\n" +
"                        position: results[0].geometry.location,\n" +
"                        icon: icon,\n" +
"                      })\n" +
"                    );\n" +
"                  } else {\n" +
"                    alert(\"Geocode was not successful due to: \" + status);\n" +
"                  }\n" +
"                };\n" +
"              };\n" +
"\n" +
"              for (let i = 0; i < originList.length; i++) {\n" +
"                const results = response.rows[i].elements;\n" +
"                geocoder.geocode(\n" +
"                  { address: originList[i] },\n" +
"              \n" +
"                );\n" +
"\n" +
"                for (let j = 0; j < results.length; j++) {\n" +
"                  geocoder.geocode(\n" +
"                    { address: destinationList[j] },\n" +
"              \n" +
"                  );\n" +
"                  outputDiv.innerHTML +=\n" +
"                    \"Duración estimada de la ruta: \" +\n" +
"                    results[j].duration.text +\n" +
"                    \"<br>\";\n" +
"                }\n" +
"              }\n" +
"            }\n" +
"          }\n" +
"        );\n" +
"      }\n" +
"\n" +
"      function deleteMarkers(markersArray) {\n" +
"        for (let i = 0; i < markersArray.length; i++) {\n" +
"          markersArray[i].setMap(null);\n" +
"        }\n" +
"        markersArray = [];\n" +
"      }\n" +
"      function calculateAndDisplayRoute(directionsService, directionsRenderer) {\n" +
"        const selectedMode = document.getElementById(\"mode\").value;\n" +
"        directionsService.route(\n" +
"          {\n" +
"            origin: { lat: "+ latCliente +", lng: "+ lonCliente +" },\n" +
"            destination: { lat: "+ latVeterinario +", lng: "+ lonVeterinario +" },\n" +
"            // Note that Javascript allows us to access the constant\n" +
"            // using square brackets and a string value as its\n" +
"            // \"property.\"\n" +
"            travelMode: google.maps.TravelMode[selectedMode],\n" +
"          },\n" +
"          (response, status) => {\n" +
"            if (status == \"OK\") {\n" +
"              directionsRenderer.setDirections(response);\n" +
"            } else {\n" +
"              window.alert(\"Directions request failed due to \" + status);\n" +
"            }\n" +
"          }\n" +
"        );\n" +
"      }\n" +
"    </script>\n" +
"  </head>\n" +
"  <body>\n" +
"      <div id=\"floating-panel\">\n" +
"      <b>Mode of Travel: </b>\n" +
"      <select id=\"mode\">\n" +
"        <option value=\"DRIVING\">Driving</option>\n" +
"        <option value=\"WALKING\">Walking</option>\n" +
"        <option value=\"BICYCLING\">Bicycling</option>\n" +
"        <option value=\"TRANSIT\">Transit</option>\n" +
"      </select>\n" +
"    </div>\n" +
"    <div id=\"map\"></div>\n" +
"    <div id=\"right-panel\">\n" +
"      <div id=\"inputs\">\n" +
"        <pre>\n" +
"        </pre>\n" +
"      </div>\n" +
"      <div id=\"output\"></div>\n" +
"    </div>\n" +
"    <div id=\"map\"></div>\n" +
"  </body>\n" +
"</html>";
        File archivo = new File("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\Sistema MascoTika\\HTMLGMaps\\simple_map2.html");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write(HTML);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
