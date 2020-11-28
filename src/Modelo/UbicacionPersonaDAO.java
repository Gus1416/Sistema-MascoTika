
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class UbicacionPersonaDAO {
    
    public UbicacionPersona insertar(int Cedula, String Ubicacion, String Latitud, String Longitud){
        String q = "INSERT INTO UbicacionPersona VALUES("
                + Cedula +",'"
                + Ubicacion + "', '"
                + Latitud +"', '"
                + Longitud +"')";
        if (new Database().actualizar(q) > 0){
            return new UbicacionPersona(Cedula,Ubicacion, Latitud, Longitud);
        }
        return null;
    }
    
    
    
    public List consultarLatitud (int Cedula){
        String q = "SELECT Latitud FROM UbicacionPersona WHERE Cedula="+Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<UbicacionPersona> ubicacionesPersona = new ArrayList();   
        for (Map registro : regis){
                   UbicacionPersona ubicacionPersona = new UbicacionPersona (
                   (String)registro.get("Latitud"));
                   ubicacionesPersona.add(ubicacionPersona);
                   System.out.println(registro.get("Latitud"));
       } 
       return ubicacionesPersona; 
    }
    
    public List consultarLongitud (int Cedula){
        String q = "SELECT Longitud FROM UbicacionPersona WHERE Cedula ="+Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<UbicacionPersona> ubicacionesPersona = new ArrayList();  
        for (Map registro : regis){
                   UbicacionPersona ubicacionPersona = new UbicacionPersona (
                   (String)registro.get("Longitud"), 1);
                   ubicacionesPersona.add(ubicacionPersona);   
                   System.out.println("Longitud");
       } 
       
       return ubicacionesPersona; 
    }
    
    
    
}
