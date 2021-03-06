/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


/*import java.sql.Connection;
import Codigo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;*/

import java.util.*;



/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioDAO {
  
    public Usuario insertar(String NombreUsuario,String Contraseña, String Rol, String key){
        String q= "INSERT INTO Usuario VALUES ('"+ NombreUsuario +"','"+ Rol +"',ENCRYPTBYPASSPHRASE('"+ key +"','"+ Contraseña +"'))";
        
        if  (new Database().actualizar(q) > 0 ){                  
            return new Usuario(NombreUsuario,Contraseña,Rol);          // Entonces le mando los datos a la tabla  
        }
        return null;     // si no se insert el registro devuelve null
    }
    
    public int actualizar(String NombreUsuario, String Rol){
        String q= " UPDATE Usuario SET Rol='"
                + Rol + "' WHERE NombreUsuario="+"'"+NombreUsuario+"'";     
        return new Database().actualizar(q);    
    }
       
    public Usuario obtenerRegistro(String Rol, String NombreUsuario, String Password, String key) {             /// ACA TENGO QUE DESENCRIPTAR
        String q = "SELECT NombreUsuario, Rol, CONVERT(VARCHAR(MAX), DECRYPTBYPASSPHRASE('"+ key +"',Contraseña))"
                + " FROM Usuario"
                + " WHERE NombreUsuario = '"+ NombreUsuario +"'"
                + " AND Rol = '"+ Rol +"'";
        List<Map> registros = new Database().ejecutar(q);                         //Lista que guarda los registros de la tabla  
        Usuario usuario = null;
        for (Map registro : registros) {
            usuario = new Usuario(
                    (String) registro.get("NombreUsuario"),
                    (String) registro.get("Contraseña"),
                    (String) registro.get("Rol"));
        }
        return usuario;                          // si entra bien al for entonces el cliente es agarrado de la base de datos y lo retorna

    }

    public List obtenerRegistros(){                     
        String q = "SELECT * FROM Usuario ";
        List <Map>  registros = new Database().ejecutar(q);  
        List <Usuario> usuarios = new ArrayList();
         for(Map registro: registros){
            Usuario usuario = new Usuario(
                    (String)registro.get("NombreUsuario"), 
                    (String)registro.get("Contraseña"),
                    (String)registro.get("Rol"));
            usuarios.add(usuario);
         }
        return usuarios;  
    }
       
     public List obtenerRegistrosUsuario(String NombreUsuario, String key){                               // traerse todos los procedimientos segun su tipo
         String q = "SELECT NombreUsuario, Rol, CONVERT(VARCHAR(MAX), DECRYPTBYPASSPHRASE('"+ key +"',Contraseña)) "
                 + " FROM Usuario "
                 + " WHERE NombreUsuario='"
                 + NombreUsuario + "'" ;
        List <Map>  registros = new Database().ejecutar(q);  
        List <Usuario> usuarios = new ArrayList();
         for(Map registro : registros){
            Usuario usuario = new Usuario((String)registro.get("NombreUsuario"), 
                    (String)registro.get("Contraseña"),
                    (String)registro.get("Rol"));   
            usuarios.add(usuario);
         }
        return usuarios;     
        }  
     public List obtenerRegistrosRol(String Rol, String key){                               // traerse todos los procedimientos segun su tipo
         String q = "SELECT NombreUsuario, Rol, CONVERT(VARCHAR(MAX), DECRYPTBYPASSPHRASE('"+ key +"',Contraseña)) "
                 + " FROM Usuario "
                 + " WHERE Rol='"
                 + Rol + "'" ;
        List <Map>  registros = new Database().ejecutar(q);  
        List <Usuario> usuarios = new ArrayList();
         for(Map registro : registros){
            Usuario usuario = new Usuario((String)registro.get("NombreUsuario"), 
                    (String)registro.get("Contraseña"),
                    (String)registro.get("Rol"));   
            usuarios.add(usuario);
         }
        return usuarios;     
        }  
      
     public int eliminar(String NombreUsuario){
         String q = "DELETE FROM Usuario WHERE NombreUsuario='"
                 + NombreUsuario + "'";
         return new Database().actualizar(q);
     }  
}
