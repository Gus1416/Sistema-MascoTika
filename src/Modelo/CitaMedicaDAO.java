
package Modelo;
import java.util.*;

public class CitaMedicaDAO {
    
    public CitaMedica insertar (String IDCitaMed, String Fecha, String Estado, int CedulaCliente){
        String q = "INSERT INTO [Cita Medica] VALUES('"
                + IDCitaMed + " ', ' "
                + Fecha + " ' , ' " 
                +  Estado + " ', " 
                + CedulaCliente+" )";
        if (new Database().actualizar(q) > 0){
            return new CitaMedica(IDCitaMed, Fecha, Estado, CedulaCliente);
        }
        return null;
    }
    
    public int actualizar(String IDCitaMed, String Fecha, String Estado, int CedulaCliente){
        String q = "UPDATE [Cita Medica] SET Fecha=' "
                + Fecha + " ', Estado=' "
                + Estado + " ', CedulaCliente="
                 +CedulaCliente + " WHERE IDCitaMed='"
                + IDCitaMed + "  '  ";
        return new Database().actualizar(q);
    }
    
    public CitaMedica obtenerRegistro(String IDCitaMed){
       String q = "SELECT * FROM [Cita Medica] WHERE IDCitaMed='"
               + IDCitaMed + " ' ";
       List<Map> registros = new Database().ejecutar(q);
       CitaMedica citamedica = null;
       for (Map registro : registros){
           citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
       }
       return citamedica;
    }
    
    public CitaMedica obtenerRegistroFecha(String Fecha){
       String q = "SELECT * FROM [Cita Medica] WHERE Fecha='"
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
        String q = "SELECT * FROM [Cita Medica]";
        List<Map> registros = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : registros){
           CitaMedica citamed = new CitaMedica (
                (String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
          citasmedicas.add(citamed);
       }
       return citasmedicas; 
    }
    
    public List obtenerRegistrosLista(String IDCitaMed){
        
        System.out.print("ESTA LLEGANDO EL ID DE LA CITA MI BRO" + IDCitaMed);
        String q = "SELECT * FROM [Cita Medica] WHERE IDCitaMed='"
                + IDCitaMed  + " ' ";
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis){
                   CitaMedica citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
           citasmedicas.add(citamedica);
       }
       return citasmedicas; 
    }
    
    
    
     public List obtenerRegistrosEstado(String Estado){
        
        System.out.print(" ESTE ES EL ID QUE LLEGA AL METODO DE OBTENER INFO SEGUN EL ESTADO MAEEEE :::::" + Estado);
        
        String q = "SELECT * FROM [Cita Medica] WHERE Estado= ' "
                + Estado  + " '   ";
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis){
                   CitaMedica citamedica = new CitaMedica ((String)registro.get("IDCitaMed"), (String)registro.get("Fecha"), 
                   (String)registro.get("Estado"), (int)registro.get("CedulaCliente"));
           citasmedicas.add(citamedica);
       }
       return citasmedicas; 
    }
    
    
    
    
    
    
    
    
    
    
    
    public int eliminar(String IDCitaMed){
        String q = "DELETE FROM [Cita Medica] WHERE IDCitaMed='"
                + IDCitaMed + "'";
        return new Database().actualizar(q);
    }
}
