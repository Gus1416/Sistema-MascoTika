
package Modelo;
import java.util.*;

public class CitaMedicaDAO {
    
    public CitaMedica insertar (String IDCitaMed, String Fecha, String Estado, int CedulaCliente){
        String q = "INSERT INTO CitaMedica VALUES('"
                + IDCitaMed + "','"
                + Fecha + "','"
                + Estado + "',"
                + CedulaCliente + ")";
        if (new Database().actualizar(q) > 0){
            return new CitaMedica(IDCitaMed, Fecha, Estado, CedulaCliente);
        }
        return null;
    }
    
    public int actualizar(String IDCitaMed, String Fecha, String Estado, int CedulaCliente){
        String q = "UPDATE CitaMedica SET IDCitaMed='"
                + IDCitaMed + "', IDVet='"
                + Fecha + "', Calificacion='"
                + Estado + "',"
                + CedulaCliente +"";
        return new Database().actualizar(q);
    }
    
    public CitaMedica obtenerRegistro(String IDCitaMed){
       String q = "SELECT * FROM CitaMedica WHERE IDCitaMed='"
               + IDCitaMed + "'";
       List<Map> registros = new Database().ejecutar(q);
       CitaMedica citamedica = null;
       for (Map registro : registros){
           citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
       }
       return citamedica;
    }
    
    public CitaMedica obtenerRegistroFecha(String Fecha){
       String q = "SELECT * FROM CitaMedica WHERE Fecha='"
               + Fecha + "'";
       List<Map> registros = new Database().ejecutar(q);
       CitaMedica citamedica = null;
       for (Map registro : registros){
           citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
       }
       return citamedica;
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM CitaMedica";
        List<Map> registros = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : registros){
           CitaMedica citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
           citasmedicas.add(citamedica);
       }
       return citasmedicas; 
    }
    
    public int eliminar(String IDCitaMed){
        String q = "DELETE FROM CitaMedica WHERE IDCitaMed='"
                + IDCitaMed + "'";
        return new Database().actualizar(q);
    }
}
