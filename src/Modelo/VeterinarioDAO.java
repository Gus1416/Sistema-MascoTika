
package Modelo;
import java.util.*;

public class VeterinarioDAO {
    
    public Veterinario insertar (int Cedula, String IDVet, int Calificacion, String HorarioAtencion, String SitioWeb){
        String q = "INSERT INTO Veterinario VALUES("
                + Cedula + ",'"+ IDVet + "',"+ Calificacion + ",'"
                + HorarioAtencion + "','"
                + SitioWeb + "')";
        if (new Database().actualizar(q) > 0){
            return new Veterinario(Cedula, IDVet, Calificacion, HorarioAtencion, SitioWeb);
        }
        return null;
    }
    
    public int actualizar(int Cedula, String IDVet, int Calificacion, String HorarioAtencion, String SitioWeb){
        String q = "UPDATE Veterinario SET IDVet='"
                + IDVet + "', Calificacion="
                + Calificacion + ", HorarioAtencion='"
                + HorarioAtencion + "', SitioWeb='"
                + SitioWeb + "' WHERE Cedula="
                + Cedula;
        return new Database().actualizar(q);
    }
   
    public int actualizarCalificacion(String IDVet, int Calificacion) {
        String q = "UPDATE Veterinario SET Calificacion = " + Calificacion
                + " WHERE IDVet = '"+ IDVet +"'";
        return new Database().actualizar(q);
    }
    
    
    public Veterinario obtenerRegistro(int Cedula){
       String q = "SELECT * FROM Veterinario WHERE Cedula="
               + Cedula;
       List<Map> registros = new Database().ejecutar(q);
       Veterinario veterinario = null;
       for (Map registro : registros){
           veterinario = new Veterinario (
                   (int)registro.get("Cedula"), 
                   (String)registro.get("IDVet"),
                   (int)registro.get("Calificacion"), 
                   (String)registro.get("HorarioAtencion"), 
                   (String)registro.get("SitioWeb"));
       }
       return veterinario;
    }
    
    public Veterinario obtenerRegistroID(String IDVet){
       String q = "SELECT * FROM Veterinario WHERE IDVet='"
               + IDVet + "'";
       List<Map> registros = new Database().ejecutar(q);
       Veterinario veterinario = null;
       for (Map registro : registros){
           veterinario = new Veterinario (
                   (int)registro.get("Cedula"), 
                   (String)registro.get("IDVet"),
                   (int)registro.get("Calificacion"), 
                   (String)registro.get("HorarioAtencion"), 
                   (String)registro.get("SitioWeb"));
       }
       return veterinario;
    }
   
   /// ------------------------------------------------------------------------------------------------------------------
    public List obtenerRegistros(){
        String q = "SELECT * FROM Veterinario";
        List<Map> registros = new Database().ejecutar(q);
        List<Veterinario> veterinarios = new ArrayList();
        for (Map registro : registros){
           Veterinario veterinario = new Veterinario (
                   (int)registro.get("Cedula"), 
                   (String)registro.get("IDVet"),     
                   (int)registro.get("Calificacion"), 
                   (String)registro.get("HorarioAtencion"), 
                   (String)registro.get("SitioWeb"));
           veterinarios.add(veterinario);
       }
       return veterinarios; 
    }
    
    public List obtenerRegistrosCedula(int Cedula){
        String q = "SELECT * FROM Veterinario WHERE Cedula="
               + Cedula;
        List<Map> registros = new Database().ejecutar(q);
        List<Veterinario> veterinarios = new ArrayList();
        for (Map registro : registros){
           Veterinario veterinario = new Veterinario (
                   (int)registro.get("Cedula"), 
                   (String)registro.get("IDVet"),     
                   (int)registro.get("Calificacion"), 
                   (String)registro.get("HorarioAtencion"), 
                   (String)registro.get("SitioWeb"));
           veterinarios.add(veterinario);
       }
       return veterinarios; 
    }
    
    public List ObtenerVetProcedimiento(String IDProcedimiento){
        String q = "SELECT Veterinario.Cedula, Veterinario.IDVet, Persona.Nombre, Persona.Apellido, Veterinario.Calificacion, Veterinario.HorarioAtencion, Veterinario.SitioWeb" +
" FROM Persona, Veterinario, VeterinarioEjecutaProcedimiento, Procedimiento" +
" WHERE Persona.Cedula = Veterinario.Cedula" +
" AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet" +
" AND VeterinarioEjecutaProcedimiento.IDProcedimiento = Procedimiento.IDProcedimiento" +
" AND Procedimiento.IDProcedimiento = '"+ IDProcedimiento + "'";
        List<Map> registros = new Database().ejecutar(q);
        List<Veterinario> veterinarios = new ArrayList();
        for (Map registro : registros){
            Veterinario veterinario = new Veterinario(
                    (int)registro.get("Cedula"),
                    (String)registro.get("IDVet"),
                    (int)registro.get("Calificacion"),                  
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("SitioWeb"),
                    (String)registro.get("Nombre"),
                    (String)registro.get("Apellido")
            );
            veterinarios.add(veterinario);
        }
        return veterinarios;
    }
    
    public List ObtenerIDVet(String NombreUsuario) {
        String q = "SELECT IDVet FROM Persona, Veterinario"
                + " WHERE Persona.Cedula = Veterinario.Cedula"
                + " AND Persona.NombreUsuario='"+NombreUsuario+"'";
        List<Map> registros = new Database().ejecutar(q);
        List<Veterinario> veterinarios = new ArrayList();
        for (Map registro : registros){
            Veterinario veterinario = new Veterinario(
                    (String)registro.get("IDVet")
            );
            veterinarios.add(veterinario);
        }
        return veterinarios;
    }
    
    
    
    public int eliminar(int Cedula){
        String q = "DELETE FROM Veterinario WHERE Cedula="
                + Cedula;
        return new Database().actualizar(q);
    }
}
