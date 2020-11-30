
package Modelo;


public class OtrasSeñasPersona {
    
    private int Cedula;
    private String OtrasSeñas;

    public OtrasSeñasPersona() {
    }

    public OtrasSeñasPersona(int Cedula, String OtrasSeñas) {
        this.Cedula = Cedula;
        this.OtrasSeñas = OtrasSeñas;
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
     * @return the OtrasSeñas
     */
    public String getOtrasSeñas() {
        return OtrasSeñas;
    }

    /**
     * @param OtrasSeñas the OtrasSeñas to set
     */
    public void setOtrasSeñas(String OtrasSeñas) {
        this.OtrasSeñas = OtrasSeñas;
    }
    
    
    
}
