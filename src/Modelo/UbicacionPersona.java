
package Modelo;


public class UbicacionPersona {
    
   private int Cedula;
   private String Ubicacion;
   private String Latitud;
   private String Longitud;

    public UbicacionPersona() {
    }

    
    
    public UbicacionPersona(String Latitud) {
        this.Latitud = Latitud;
    }

    public UbicacionPersona(String Longitud, int num) {
        this.Longitud = Longitud;
    }
    
    public UbicacionPersona(int Cedula, String Latitud, String Longitud) {
        this.Cedula = Cedula;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    public UbicacionPersona(int Cedula, String Ubicacion, String Latitud, String Longitud) {
        this.Cedula = Cedula;
        this.Ubicacion = Ubicacion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    
    
    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Latitud
     */
    public String getLatitud() {
        return Latitud;
    }

    /**
     * @param Latitud the Latitud to set
     */
    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    /**
     * @return the Longitud
     */
    public String getLongitud() {
        return Longitud;
    }

    /**
     * @param Longitud the Longitud to set
     */
    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    /**
     * @return the Ubicacion
     */
    public String getUbicacion() {
        return Ubicacion;
    }

    /**
     * @param Ubicacion the Ubicacion to set
     */
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
   
   
    
}
