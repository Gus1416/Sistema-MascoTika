
package Modelo;
import java.util.*;


public class PacienteDAO {
    
    public Paciente insertar (int IDPaciente, String Raza, String Nombre, int Edad){
        
        System.out.println("Esta es la raza que recibe el insertar" + Raza);
        System.out.println("Esta es la Nombre que recibe el insertar "   + Nombre );
        
        String q = "INSERT INTO Paciente VALUES(  " + IDPaciente + ",  '   "+ Raza + "  '    ,    '   " + Nombre + " '   ,   "+ Edad + ")";
        if (new Database().actualizar(q) > 0){
            return new Paciente(IDPaciente, Raza, Nombre, Edad);
        }
        return null;
    }
    
    public int actualizar(int IDPaciente, String Raza, String Nombre, int Edad){
        
        System.out.println("Esta es la raza que recibe actualizar" + Raza);
        System.out.println("Esta es la Nombre que recibe el actualizar "   + Nombre );
        
        String q = "UPDATE Paciente SET Raza=  '  " + Raza + "',   Nombre=   '  " + Nombre + " '    , Edad=" + Edad+ " WHERE IDPaciente="  + IDPaciente ;
        return new Database().actualizar(q);
    }
    
    public Paciente obtenerRegistro(int IDPaciente){
       String q = "SELECT * FROM Paciente WHERE IDPaciente="
               + IDPaciente;
       List<Map> registros = new Database().ejecutar(q);
       Paciente paciente = null;
       for (Map registro : registros){
           paciente = new Paciente ((int)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (int)registro.get("Edad"));
       }
       return paciente;
    }
    
    
    public List obtenerHistorialID(int IDPaciente){
        String q = "SELECT Paciente.IDPaciente,Paciente.Nombre,Paciente.Raza,"
                + "Procedimiento.IDProcedimiento,Procedimiento.Tipo,Procedimiento.DescripcionProcedimiento,\n" +
                    "Procedimiento.MontoUnitario,Procedimiento.MontoServAdom\n" +
                    "FROM Paciente INNER JOIN Procedimiento on Procedimiento. "+ IDPaciente+" =Paciente. "+IDPaciente+ "   ";
        List<Map> registros = new Database().ejecutar(q);
        List<GestPaci> pacientes = new ArrayList();
        for (Map registro : registros){
           GestPaci paciente = new GestPaci( (int)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (String)registro.get("IDProcedimiento"),(String)registro.get("Tipo"),
                   (String)registro.get("DescripcionProcedimiento"),(int)registro.get("MontoUnitario"),
                   (int)registro.get("MontoServAdom") );
           pacientes.add(paciente);
       }
       return pacientes; 
    }
    
    
    
    
    
    
    
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Paciente";
        List<Map> registros = new Database().ejecutar(q);
        List<Paciente> pacientes = new ArrayList();
        for (Map registro : registros){
           Paciente paciente = new Paciente ((int)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (int)registro.get("Edad"));
           pacientes.add(paciente);
       }
       return pacientes; 
    }
    
    public List obtenerRegistrosListPaciente(int IDPaciente){
        String q = "SELECT * FROM Paciente WHERE IDPaciente= "+ IDPaciente;
        List<Map> registros = new Database().ejecutar(q);
        List<Paciente> pacientes = new ArrayList();
        for (Map registro : registros){
           Paciente paciente = new Paciente ((int)registro.get("IDPaciente"),
           (String)registro.get("Raza"), (String)registro.get("Nombre"), 
                   (int)registro.get("Edad"));
           pacientes.add(paciente);
       }
       return pacientes; 
    }
    
    public int eliminar(int IDPaciente){
        String q = "DELETE FROM Paciente WHERE IDPaciente="
                + IDPaciente;
        return new Database().actualizar(q);
    }
}
