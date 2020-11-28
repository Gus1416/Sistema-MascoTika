
package Modelo;
    
   
public class Persona {
    
    private int Cedula;
    private String Nombre;
    private String Apellido;
    private String Provincia;
    private String Canton;
    private String Distrito;
    //private String UbicacionGmaps;
    private String Email;
    private String NombreUsuario;

    public Persona() {
    }

    public Persona(int Cedula, String Nombre, String Apellido, String Provincia, String Canton, String Distrito, String Email, String NombreUsuario) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Provincia = Provincia;
        this.Canton = Canton;
        this.Distrito = Distrito;
        //this.UbicacionGmaps = UbicacionGmaps;
        this.Email = Email;
        this.NombreUsuario = NombreUsuario;
    }

    /*Persona(int i, String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Persona(int i, String string, int i0, String string0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Provincia
     */
    public String getProvincia() {
        return Provincia;
    }

    /**
     * @param Provincia the Provincia to set
     */
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    /**
     * @return the Canton
     */
    public String getCanton() {
        return Canton;
    }

    /**
     * @param Canton the Canton to set
     */
    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    /**
     * @return the Distrito
     */
    public String getDistrito() {
        return Distrito;
    }

    /**
     * @param Distrito the Distrito to set
     */
    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    /**
     * @return the UbicacionGmaps
     */
    /*public String getUbicacionGmaps() {
        return UbicacionGmaps;
    }*/

    /**
     * @param UbicacionGmaps the UbicacionGmaps to set
     */
    /*public void setUbicacionGmaps(String UbicacionGmaps) {
        this.UbicacionGmaps = UbicacionGmaps;
    }*/

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
    
    
}
