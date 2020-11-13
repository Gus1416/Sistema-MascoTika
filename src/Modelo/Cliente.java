
package Modelo;

public class Cliente {
    
    private int Cedula;
    
    public Cliente() {
    }
    
    public Cliente(int Cedula){
        this.Cedula = Cedula;
        ;
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
 }

