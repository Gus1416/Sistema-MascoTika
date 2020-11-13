
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
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Cliente";
        List<Map> registros = new Database().ejecutar(q);
        List<Cliente> clientes = new ArrayList();
        for (Map registro : registros){
           Cliente cliente = new Cliente ((int)registro.get("Cedula"));
           clientes.add(cliente);
       }
       return clientes; 
    }
    
    public int eliminar(int Cedula){
        String q = "DELETE FROM Cliente WHERE Cedula="
                + Cedula;
        return new Database().actualizar(q);
    }   
}
