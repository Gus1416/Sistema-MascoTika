
package Modelo;
import java.util.*;

public class ClienteDAO {
    
    public Cliente insertar(int Cedula, String Usuario, String Contraseña){
        String q = "INSERT INTO Cliente VALUES('"
                + Cedula + "','"
                + Usuario + "','"
                + Contraseña + "')";
        if (new Database().actualizar(q) > 0){
            return new Cliente(Cedula, Usuario, Contraseña);
        }
        return null;
    }
    
    //Actualiza mediante la cedula del usuario
    public int actualizar(int Cedula, String Usuario, String Contraseña){
        String q = "UPDATE Cliente SET Usuario='"
                + Usuario + "', Contraseña='"
                + Contraseña + "' WHERE Cedula='"
                + Cedula + "'"; 
        return new Database().actualizar(q);
    }
    
    public Cliente obtenerRegistro(int Cedula){
       String q = "SELECT * FROM Cliente WHERE Cedula='"
               + Cedula + "'";
       List<Map> registros = new Database().ejecutar(q);
       Cliente cliente = null;
       for (Map registro : registros){
           cliente = new Cliente ((int)registro.get("Cedula"),
           (String)registro.get("Usuario"), (String)registro.get("Contraseña"));
       }
       return cliente;
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Cliente";
        List<Map> registros = new Database().ejecutar(q);
        List<Cliente> clientes = new ArrayList();
        for (Map registro : registros){
           Cliente cliente = new Cliente ((int)registro.get("Cedula"),
           (String)registro.get("Usuario"), (String)registro.get("Contraseña"));
           clientes.add(cliente);
       }
       return clientes; 
    }
    
    public int eliminar(int Cedula){
        String q = "DELETE FROM Cliente WHERE Cedula='"
                + Cedula + "'";
        return new Database().actualizar(q);
    }   
}
