
package Modelo;
import java.util.*;

public class CitaMedicaDAO {
    
    public CitaMedica insertar (String IDCitaMed, java.sql.Date Fecha, String Estado){
        String q = "INSERT INTO CitaMedica VALUES('"
                + IDCitaMed + "','"
                + Fecha + "','"
                + Estado + "')";
        if (new Database().actualizar(q) > 0){
            return new CitaMedica(IDCitaMed, Fecha, Estado);
        }
        return null;
    }
    
    public int actualizar(String IDCitaMed, java.sql.Date Fecha, String Estado){
        String q = "UPDATE CitaMedica SET IDCitaMed='"
                + IDCitaMed + "', IDVet='"
                + Fecha + "', Calificacion='"
                + Estado + "'";
        return new Database().actualizar(q);
    }
    
    public CitaMedica obtenerRegistro(String IDCitaMed){
       String q = "SELECT * FROM CitaMedica WHERE IDCitaMed='"
               + IDCitaMed + "'";
       List<Map> registros = new Database().ejecutar(q);
       CitaMedica citamedica = null;
       for (Map registro : registros){
           citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (java.sql.Date)registro.get("Fecha"), 
                   (String)registro.get("Estado"));
       }
       return citamedica;
    }
    
    public CitaMedica obtenerRegistro(java.sql.Date Fecha){
       String q = "SELECT * FROM CitaMedica WHERE Fecha='"
               + Fecha + "'";
       List<Map> registros = new Database().ejecutar(q);
       CitaMedica citamedica = null;
       for (Map registro : registros){
           citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (java.sql.Date)registro.get("Fecha"), 
                   (String)registro.get("Estado"));
       }
       return citamedica;
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM CitaMedica";
        List<Map> registros = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : registros){
           CitaMedica citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (java.sql.Date)registro.get("Fecha"), 
                   (String)registro.get("Estado"));
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
