
package Modelo;


public class Veterinario {
    
    private int Cedula;
    private String IDVet;
    private int Calificacion;
    private String HorarioAtencion;
    private String SitioWeb;
    private String Nombre;
    private String Apellido;

    public Veterinario() {
    }

    public Veterinario(int Cedula, String IDVet, int Calificacion, String HorarioAtencion, String SitioWeb) {
        this.Cedula = Cedula;
        this.IDVet = IDVet;
        this.Calificacion = Calificacion;
        this.HorarioAtencion = HorarioAtencion;
        this.SitioWeb = SitioWeb;
    }

    public Veterinario(int Cedula, String IDVet, int Calificacion, String HorarioAtencion, String SitioWeb, String Nombre, String Apellido) {
        this.Cedula = Cedula;
        this.IDVet = IDVet;
        this.Calificacion = Calificacion;
        this.HorarioAtencion = HorarioAtencion;
        this.SitioWeb = SitioWeb;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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
     * @return the IDVet
     */
    public String getIDVet() {
        return IDVet;
    }

    /**
     * @param IDVet the IDVet to set
     */
    public void setIDVet(String IDVet) {
        this.IDVet = IDVet;
    }

    /**
     * @return the Calificacion
     */
    public int getCalificacion() {
        return Calificacion;
    }

    /**
     * @param Calificacion the Calificacion to set
     */
    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    /**
     * @return the HorarioAtencion
     */
    public String getHorarioAtencion() {
        return HorarioAtencion;
    }

    /**
     * @param HorarioAtencion the HorarioAtencion to set
     */
    public void setHorarioAtencion(String HorarioAtencion) {
        this.HorarioAtencion = HorarioAtencion;
    }

    /**
     * @return the SitioWeb
     */
    public String getSitioWeb() {
        return SitioWeb;
    }

    /**
     * @param SitioWeb the SitioWeb to set
     */
    public void setSitioWeb(String SitioWeb) {
        this.SitioWeb = SitioWeb;
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
}
