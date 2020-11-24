
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
        System.out.println(" este es el id que llega al metodo de busqueda " + IDPaciente);
        String q =  "SELECT * FROM Paciente JOIN Procedimiento on  Paciente.IDPaciente = Procedimiento.IDPaciente  WHERE Paciente.IDPaciente= " + IDPaciente ;   
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
        
        System.out.println(" EL METODO DE OBTENER  BUSQUEDA ESTA FUNCCANDO");
        
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
    
    public List consultaPorVet (String IDVet){
        String q = "Select Paciente.IDPaciente, Paciente.Nombre, Paciente.Raza, Paciente.Edad from Paciente, VeterinarioEjecutaProcedimiento, Veterinario, Procedimiento where Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet  AND VeterinarioEjecutaProcedimiento.IDProcedimiento = Procedimiento.IDProcedimiento AND Procedimiento.IDPaciente = Paciente.IDPaciente  AND Veterinario.IDVet = '"+ IDVet +"'";
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
    
    public List consultaCitasPaciente (String IDPaciente){
        String q = "Select [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado, [Cita Medica].CedulaCliente, Procedimiento.Tipo from [Cita Medica], Procedimiento, Paciente, CitaMedicaContieneProcedimientos where [Cita Medica].IDCitaMed = CitaMedicaContieneProcedimientos.IDCitaMed AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento AND Procedimiento.IDPaciente = Paciente.IDPaciente AND Paciente.IDPaciente = '"+IDPaciente+"'";      
        List<Map> regis = new Database().ejecutar(q);
        List<ConsultPaci> consultPacis = new ArrayList();
        for (Map registro : regis){
                   ConsultPaci consultPaci = new ConsultPaci ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"), (String)registro.get("Tipo"));
           System.out.println(((String)registro.get("Tipo")));
                   consultPacis.add(consultPaci);
       }
        
       return consultPacis; 
    }
    
    public int eliminar(int IDPaciente){
        String q = "DELETE FROM Paciente WHERE IDPaciente="
                + IDPaciente;
        return new Database().actualizar(q);
    }
}
