
package Modelo;


public class TelefonoPersona {
    
    private int Cedula;
    private int Telefono;

    public TelefonoPersona() {
    }

    public TelefonoPersona(int Cedula, int Telefono) {
        this.Cedula = Cedula;
        this.Telefono = Telefono;
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
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
}
