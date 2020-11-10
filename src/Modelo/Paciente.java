
package Modelo;


public class Paciente {
    
    private String IDPaciente;
    private String Raza;
    private String Nombre;
    private int Edad;

    /**
     * @return the IDPaciente
     */
    public String getIDPaciente() {
        return IDPaciente;
    }

    /**
     * @param IDPaciente the IDPaciente to set
     */
    public void setIDPaciente(String IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
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
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}
