/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.*;

/*import java.sql.Connection;
import Codigo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.*;

import Modelo.Procedimiento;*/



public class PersonaDAO {
    
    public Persona insertar(int Cedula, String Nombre, String Apellido, String Provincia, String Canton, String Distrito, String UbicacionGmaps, String Email, String NombreUsuario){
        String q = "INSERT INTO Persona VALUES("
                + Cedula +",'"
                + Nombre + "','"
                + Apellido + "','"
                + Provincia + "','"
                + Canton + "','"
                + Distrito + "','"
                + UbicacionGmaps + "','"
                + Email + "','"
                + NombreUsuario + "')";
        if (new Database().actualizar(q) > 0){
            return new Persona(Cedula, Nombre, Apellido, Provincia, Canton, Distrito, UbicacionGmaps, Email, NombreUsuario);
        }
        return null;
    }
    
    public int actualizar(int Cedula, String Nombre, String Apellido, String Provincia, String Canton, String Distrito, String UbicacionGmaps, String Email, String NombreUsuario){
        String q = "UPDATE Persona SET Cedula="
                + Cedula + ", Nombre='"
                + Nombre + "', Apellido='"
                + Apellido + "',Provincia='"
                + Provincia + "', Canton='"
                + Canton + "', Distrito='"
                + Distrito + "', UbicacionGmaps='"
                + UbicacionGmaps + "', Email='"
                + Email + "', NombreUsuario='"
                + NombreUsuario + "'";
        return new Database().actualizar(q);
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Persona";
        List<Map> registros = new Database().ejecutar(q);
        List<Persona> personas = new ArrayList();
        for (Map registro : registros){
            Persona persona = new Persona(
                    (int)registro.get("Cedula"),
            (String)registro.get("Nombre"),
            (String)registro.get("Apellido"),
            (String)registro.get("Provincia"),
            (String)registro.get("Canton"),
            (String)registro.get("Distrito"),
            (String)registro.get("UbicacionGmaps"),
            (String)registro.get("Email"),
            (String)registro.get("NombreUsuario"));
            personas.add(persona);
        }
        return personas;
    }
    
    public List obtenerRegistros(int Cedula){
        String q = "SELECT * FROM Persona WHERE Cedula=" + Cedula;
        List<Map> registros = new Database().ejecutar(q);
        List<Persona> personas = new ArrayList();
        for (Map registro : registros){
            Persona persona = new Persona(
                    (int)registro.get("Cedula"),
            (String)registro.get("Nombre"),
            (String)registro.get("Apellido"),
            (String)registro.get("Provincia"),
            (String)registro.get("Canton"),
            (String)registro.get("Distrito"),
            (String)registro.get("UbicacionGmaps"),
            (String)registro.get("Email"),
            (String)registro.get("NombreUsuario"));
            personas.add(persona);
        }
        return personas;
    }
    
    public int eliminar(int Cedula){
        String q = "DELETE FROM Persona WHERE Cedula=" + Cedula;
        return new Database().actualizar(q);
    }
    
    
   /* public Persona  insertar(int cedula, String nombre ,String apellido ,String provincia , String canton, String distrito, String ubicaciongmaps,  String email){
        
        String q= "INSERT INTO Persona VALUES( ' "+cedula+" ' ,  '  " +nombre+ "  ', '  "  +apellido + "  ' , '   " + provincia + "  ' ,  '  "  +canton+ " ' , ' " + distrito  +" ',   '    " +   ubicaciongmaps  +" ,   '   "+  email+  "   ') ";        
        if  (new Database().actualizar(q)    > 0 ){                  
            return new Persona(cedula,nombre,apellido,provincia,canton,distrito,ubicaciongmaps,email);             // Entonces le mando los datos a la tabla  
        }
        return null;     // si no se insert el registro devuelve null

    }
    
    
    public int actualizar(int cedula, String nombre ,String apellido ,String provincia , String canton, String distrito, String ubicaciongmaps,  String email){
        String q= " UPDATE Persona SET  Nombre = '  " +nombre+ "  ' , Apellido= '  "  +apellido + "  ' , Provincia= '   " + provincia + "  ' , Canton= '  "  +canton+ " ' , Distrito =  ' " + distrito  +" ',  UbicacionGmaps= ' " +   ubicaciongmaps  +" ,Email=   '   "+  email+  "   ";    
        return new Database().actualizar(q);
          
    }
    
    
    public Persona obtenerRegistro(int cedula){      //// Hacer una consulta con unicamente el ID del procedimiento
        String q= "SELECT * FROM Persona WHERE Cedula = '      "  +  cedula + "  '        ";
        List <Map>  registros=  new Database().ejecutar(q);                         //Lista que guarda los registros de la tabla
        
        Persona person=null;
        for(Map registro: registros){
            person= new Persona ( (int)registro.get("cedula"), (String)registro.get("nombre"), (String)registro.get("apellido"), (String)registro.get("canton"),(String)registro.get("distrito"), (String)registro.get("ubicaciongmaps"), (String)registro.get("email") );
        }
        return person;                          // si entra bien al for entonces el cliente es agarrado de la base de datos y lo retorna
    
    }
    ////////////---------------------------------------------------------------------------
    
    public List obtenerRegistros(){                     /// traerse todos los procedimientos 
        String q = "SELECT * FROM Persona ";
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Persona> people =new ArrayList();
         for(Map registro: registros){
            Persona person= new Persona ((int)registro.get("cedula"), (String)registro.get("nombre"), (String)registro.get("apellido"), (String)registro.get("canton"),(String)registro.get("distrito"), (String)registro.get("ubicaciongmaps"), (String)registro.get("email"));      
            people.add(person);
         }
        return people;  
    }
    
    
     public List obtenerRegistros(String nombre){                               // traerse todos los procedimientos segun su tipo
         String q = "SELECT * FROM Persona WHERE Nombre= '  "+ nombre  + " ' " ;
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Persona> people =new ArrayList();
         for(Map registro: registros){
         Persona person= new Persona((int)registro.get("cedula"), (String)registro.get("nombre"), (String)registro.get("apellido"), (String)registro.get("canton"),(String)registro.get("distrito"), (String)registro.get("ubicaciongmaps"), (String)registro.get("email"));
       
            people.add(person);
         }
        return people;     
        }  
     
     
     public int eliminar(int cedula){
         String q = "DELETE FROM Persona WHERE Cedula= '  " +cedula + "  ' ";
         return new Database().actualizar(q);
     } */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
