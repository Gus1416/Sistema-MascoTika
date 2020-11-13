
package Modelo;


public class Usuario {
    
    private String NombreUsuario;
    private String Contraseña;
    private String Rol;

    public Usuario() {
    }

    public Usuario(String NombreUsuario, String Contraseña, String Rol) {
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.Rol = Rol;
    }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param NombreUsuario the NombreUsuario to set
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Rol
     */
    public String getRol() {
        return Rol;
    }

    /**
     * @param Rol the Rol to set
     */
    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
}
