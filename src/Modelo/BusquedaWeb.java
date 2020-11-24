
package Modelo;

import java.awt.Desktop;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.net.URISyntaxException;

public class BusquedaWeb {
    
    public static void goToURL(String url){
        try {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(BusquedaWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            java.util.logging.Logger.getLogger(BusquedaWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
