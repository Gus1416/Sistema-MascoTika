
package Modelo;


public class Paciente {
    
    private int IDPaciente;
    private String Raza;
    private String Nombre;
    private int Edad;

    public Paciente(){
    }
    
    public Paciente (int IDPaciente, String Raza, String Nombre, int Edad){
        this.IDPaciente = IDPaciente;
        this.Raza = Raza;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    
    /**
     * @return the IDPaciente
     */
    public int getIDPaciente() {
        return IDPaciente;
    }

    /**
     * @param IDPaciente the IDPaciente to set
     */
    public void setIDPaciente(int IDPaciente) {
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
