
package Modelo;
import java.util.*;


public class PacienteDAO {
    
    public Paciente insertar (String IDPaciente, String Raza, String Nombre, int Edad){
        String q = "INSERT INTO Cliente VALUES('"
                + IDPaciente + "','"
                + Raza + "','"
                + Nombre + "','"
                + Edad + "')";
        if (new Database().actualizar(q) > 0){
            return new Paciente(IDPaciente, Raza, Nombre, Edad);
        }
        return null;
    }
    
    public int actualizar(String IDPaciente, String Raza, String Nombre, int Edad){
        String q = "UPDATE Paciente SET IDPaciente='"
                + IDPaciente + "', Raza='"
                + Raza + "', Nombre='"
                + Nombre + "', Edad='"
                + Edad + "'";
        return new Database().actualizar(q);
    }
    
    public Paciente obtenerRegistro(String IDPaciente){
       String q = "SELECT * FROM Paciente WHERE IDPaciente='"
               + IDPaciente + "'";
       List<Map> registros = new Database().ejecutar(q);
       Paciente paciente = null;
       for (Map registro : registros){
           paciente = new Paciente ((String)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (int)registro.get("Edad"));
       }
       return paciente;
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Paciente";
        List<Map> registros = new Database().ejecutar(q);
        List<Paciente> pacientes = new ArrayList();
        for (Map registro : registros){
           Paciente paciente = new Paciente ((String)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (int)registro.get("Edad"));
           pacientes.add(paciente);
       }
       return pacientes; 
    }
    
    public int eliminar(String IDPaciente){
        String q = "DELETE FROM Paciente WHERE IDPaciente='"
                + IDPaciente + "'";
        return new Database().actualizar(q);
    }
}
