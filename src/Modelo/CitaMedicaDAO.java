
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
        System.out.println(citasmedicas);
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
    
    public List CitasPorCliente (int CedulaCliente){
        String q = "SELECT [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado, Procedimiento.NombreProcedimiento, Categoria.NombreCategoria, Persona.Nombre" +
" FROM [Cita Medica], Procedimiento, Categoria, CitaMedicaContieneProcedimientos, Persona, Veterinario, VeterinarioEjecutaProcedimiento" +
" WHERE [Cita Medica].IDCitaMed = CitaMedicaContieneProcedimientos.IDCitaMed" +
" AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento" +
" AND Procedimiento.CodigoCategoria = Categoria.CodigoCategoria" +
" AND Procedimiento.IDProcedimiento = VeterinarioEjecutaProcedimiento.IDProcedimiento" +
" AND VeterinarioEjecutaProcedimiento.IDVet = Veterinario.IDVet" +
" AND Veterinario.Cedula = Persona.Cedula" +
" AND [Cita Medica].CedulaCliente =" + CedulaCliente;
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis) {
            CitaMedica citamedica = new CitaMedica(
                    (String) registro.get("IDCitaMed"),
                    (String) registro.get("Fecha"),
                    (String) registro.get("Estado"),
                    (String) registro.get("Nombre"),
                    (String) registro.get("NombreCategoria"),
                    (String) registro.get("NombreProcedimiento")
            );
            citasmedicas.add(citamedica);
        }
        return citasmedicas;
    }
    
    public List CitasPorEstado(int Cedula, String Estado) {
        String q = "SELECT [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado, Procedimiento.NombreProcedimiento, Categoria.NombreCategoria, Persona.Nombre"
                + " FROM [Cita Medica], Procedimiento, Categoria, CitaMedicaContieneProcedimientos, Persona, Veterinario, VeterinarioEjecutaProcedimiento"
                + " WHERE [Cita Medica].IDCitaMed = CitaMedicaContieneProcedimientos.IDCitaMed"
                + " AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento"
                + " AND Procedimiento.CodigoCategoria = Categoria.CodigoCategoria"
                + " AND Procedimiento.IDProcedimiento = VeterinarioEjecutaProcedimiento.IDProcedimiento"
                + " AND VeterinarioEjecutaProcedimiento.IDVet = Veterinario.IDVet"
                + " AND Veterinario.Cedula = Persona.Cedula"
                + " AND [Cita Medica].Estado = ' " + Estado + " '"
                + " AND [Cita Medica].CedulaCliente =" + Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis) {
            CitaMedica citamedica = new CitaMedica(
                    (String) registro.get("IDCitaMed"),
                    (String) registro.get("Fecha"),
                    (String) registro.get("Estado"),
                    (String) registro.get("Nombre"),
                    (String) registro.get("NombreCategoria"),
                    (String) registro.get("NombreProcedimiento")
            );
            citasmedicas.add(citamedica);
        }
        return citasmedicas;
    }
    
    public List CitasPorCategoria(int Cedula, String Categoria) {
        String q = "SELECT [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado, Procedimiento.NombreProcedimiento, Categoria.NombreCategoria, Persona.Nombre"
                + " FROM [Cita Medica], Procedimiento, Categoria, CitaMedicaContieneProcedimientos, Persona, Veterinario, VeterinarioEjecutaProcedimiento"
                + " WHERE [Cita Medica].IDCitaMed = CitaMedicaContieneProcedimientos.IDCitaMed"
                + " AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento"
                + " AND Procedimiento.CodigoCategoria = Categoria.CodigoCategoria"
                + " AND Procedimiento.IDProcedimiento = VeterinarioEjecutaProcedimiento.IDProcedimiento"
                + " AND VeterinarioEjecutaProcedimiento.IDVet = Veterinario.IDVet"
                + " AND Veterinario.Cedula = Persona.Cedula"
                + " AND Categoria.NombreCategoria = '" + Categoria + "'"
                + " AND [Cita Medica].CedulaCliente =" + Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis) {
            CitaMedica citamedica = new CitaMedica(
                    (String) registro.get("IDCitaMed"),
                    (String) registro.get("Fecha"),
                    (String) registro.get("Estado"),
                    (String) registro.get("Nombre"),
                    (String) registro.get("NombreCategoria"),
                    (String) registro.get("NombreProcedimiento")
            );
            citasmedicas.add(citamedica);
        }
        return citasmedicas;
    }
    
    public List CitasPorVeterinario(int Cedula, String Veterinario) {
        String q = "SELECT [Cita Medica].IDCitaMed, [Cita Medica].Fecha, [Cita Medica].Estado, Procedimiento.NombreProcedimiento, Categoria.NombreCategoria, Persona.Nombre"
                + " FROM [Cita Medica], Procedimiento, Categoria, CitaMedicaContieneProcedimientos, Persona, Veterinario, VeterinarioEjecutaProcedimiento"
                + " WHERE [Cita Medica].IDCitaMed = CitaMedicaContieneProcedimientos.IDCitaMed"
                + " AND CitaMedicaContieneProcedimientos.IDProcedimiento = Procedimiento.IDProcedimiento"
                + " AND Procedimiento.CodigoCategoria = Categoria.CodigoCategoria"
                + " AND Procedimiento.IDProcedimiento = VeterinarioEjecutaProcedimiento.IDProcedimiento"
                + " AND VeterinarioEjecutaProcedimiento.IDVet = Veterinario.IDVet"
                + " AND Veterinario.Cedula = Persona.Cedula"
                + " AND Persona.Nombre = '" + Veterinario + "'"
                + " AND [Cita Medica].CedulaCliente =" + Cedula;
        List<Map> regis = new Database().ejecutar(q);
        List<CitaMedica> citasmedicas = new ArrayList();
        for (Map registro : regis) {
            CitaMedica citamedica = new CitaMedica(
                    (String) registro.get("IDCitaMed"),
                    (String) registro.get("Fecha"),
                    (String) registro.get("Estado"),
                    (String) registro.get("Nombre"),
                    (String) registro.get("NombreCategoria"),
                    (String) registro.get("NombreProcedimiento")
            );
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
