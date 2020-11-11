
package Modelo;


public class Veterinario {
    
    private int Cedula;
    private String IDVet;
    private int Calificacion;
    private String HorarioAtencion;
    private String SitioWeb;

    public Veterinario() {
    }

    public Veterinario(int Cedula, String IDVet, int Calificacion, String HorarioAtencion, String SitioWeb) {
        this.Cedula = Cedula;
        this.IDVet = IDVet;
        this.Calificacion = Calificacion;
        this.HorarioAtencion = HorarioAtencion;
        this.SitioWeb = SitioWeb;
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
}
