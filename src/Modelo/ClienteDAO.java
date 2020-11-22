
package Modelo;
import java.util.*;

public class ClienteDAO {
    
    public Cliente insertar(int Cedula){
        String q = "INSERT INTO Cliente VALUES("
                + Cedula +")";
        if (new Database().actualizar(q) > 0){
            return new Cliente(Cedula);
        }
        return null;
    }
    
    //Actualiza mediante la cedula del usuario
    public int actualizar(int Cedula){
        String q = "INSERT INTO Cliente VALUES("
                + Cedula +")";; 
        return new Database().actualizar(q);
    }
    
    public Cliente obtenerRegistro(int Cedula){
       String q = "SELECT * FROM Cliente WHERE Cedula='"
               + Cedula + "'";
       List<Map> registros = new Database().ejecutar(q);
       Cliente cliente = null;
       for (Map registro : registros){
           cliente = new Cliente ((int)registro.get("Cedula"));
       }
       return cliente;
    }
    
    public List obtenerClientes(){
        String q = "SELECT Persona.Cedula, Persona.Nombre, Persona.Apellido, Persona.Email FROM Cliente, Persona WHERE Cliente.Cedula = Persona.Cedula";
        List<Map> registros = new Database().ejecutar(q);
        List<ConsultClien> clientes = new ArrayList();
        for (Map registro : registros){
           ConsultClien cliente = new ConsultClien ((int)registro.get("Cedula"),
           (String)registro.get("Nombre"),
           (String)registro.get("Apellido"),
           (String)registro.get("Email"));
           clientes.add(cliente);
       }
       return clientes; 
    }
    
    public List consultaCitasCliente (int Cedula){
        String q ="SELECT [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado FROM [Cita Medica], Cliente WHERE [Cita Medica].CedulaCliente = Cliente.Cedula AND Cliente.Cedula ="+Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<ConsultClien> consultCliens = new ArrayList();
        for (Map registro : regis){
                   ConsultClien consultClien = new ConsultClien ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"));        
                   consultCliens.add(consultClien);
       }    
       return consultCliens; 
    }
    
    public int eliminar(int Cedula){
        String q = "DELETE FROM Cliente WHERE Cedula="
                + Cedula;
        return new Database().actualizar(q);
    }   
}
