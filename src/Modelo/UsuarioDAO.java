/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


import java.sql.Connection;
import Codigo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.*;



/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioDAO {

    
    public Usuario insertar(String username,String password, String role){
        
        String q= "INSERT INTO  Usuario VALUES(' " +username+ "  ', '  "  +password + "  ' , '   " + role + "  ' ) " ;
        
        if  (new Database().actualizar(q)    > 0 ){                  
            return new Usuario(username,password,role);          // Entonces le mando los datos a la tabla  
        }
        return null;     // si no se insert el registro devuelve null

    }
    
    
    public int actualizar(String username,String password, String role){
        String q= " UPDATE Usuario SET  Contraseña = '  "
                 +password +" ' , Rol=  '  "
                 +role+ "  "
                +  "'  WHERE  NombreUsuario= '  " +  username+ " '   " ;
        
        
        return new Database().actualizar(q);
          
    }
    
    
    public Usuario obtenerRegistro(String role){      //// Hacer una consulta con unicamente el ID del procedimiento
        String q= "SELECT * FROM Usuario  WHERE Rol = '      "  +  role + "  '        ";
        List <Map>  registros=  new Database().ejecutar(q);                         //Lista que guarda los registros de la tabla
        
        Usuario proced=null;
        for(Map registro: registros){
            proced = new Usuario((String)registro.get("username"), (String)registro.get("password"),(String)registro.get("role"));
        }
        return proced;                          // si entra bien al for entonces el cliente es agarrado de la base de datos y lo retorna
    
    }
    ////////////---------------------------------------------------------------------------
    
    public List obtenerRegistros(){                     /// traerse todos los procedimientos 
        String q = "SELECT * FROM Usuario ";
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Usuario> procedemento =new ArrayList();
         for(Map registro: registros){
            Usuario proced= new Usuario((String)registro.get("username"), (String)registro.get("password"),(String)registro.get("role"));
       
            procedemento.add(proced);
         }
        return procedemento;  
    }
    
    
     public List obtenerRegistros(String username){                               // traerse todos los procedimientos segun su tipo
         String q = "SELECT * FROM Usuario WHERE NombreUsuario= '  "+ username  + " ' " ;
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Usuario> procedemento =new ArrayList();
         for(Map registro: registros){
            Usuario proced= new Usuario((String)registro.get("username"), (String)registro.get("password"),(String)registro.get("role"));
       
            procedemento.add(proced);
         }
        return procedemento;     
        }  
     
     
     public int eliminar(String username){
         String q = "DELETE FROM Usuario WHERE NombreUsuario= '  " + username + "  ' ";
         return new Database().actualizar(q);
     }
    
    
    
    
    
    
}
