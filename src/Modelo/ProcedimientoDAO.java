
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


        
        ///////////////////////// SETSET 
        
        
public class ProcedimientoDAO {
    
    public Procedimiento insertar(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente){
        String q = "INSERT INTO Procedimiento VALUES('"
                + IDProcedimiento + "','"
                + Tipo + "',"
                + MontoUnitario + ","
                + MontoServAdom + ",'"
                + DescripcionProcedimiento + "',"
                + CodigoCategoria + ","
                + IDPaciente + ",)";
        if (new Database().actualizar(q) > 0){
            return new Procedimiento(IDProcedimiento, Tipo, MontoUnitario, MontoServAdom, DescripcionProcedimiento, CodigoCategoria, IDPaciente);
        }
        return null;     
    }
    
    public int actualizar(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente){
        String q = "UPDATE Procedimiento SET Tipo='"
                + Tipo + "', MontoUnitario="
                + MontoUnitario + ", MontoServAdom="
                + MontoServAdom + ", DescripcionProcedimiento='"
                + DescripcionProcedimiento + "', CodigoCategoria="
                + CodigoCategoria + ", IDPaciente="
                + IDPaciente + " WHERE IDProcedimiento='"
                + IDProcedimiento + "'";
        return new Database().actualizar(q);
    }
    
    public Procedimiento obtenerRegistro(String IDProcedimiento){
        String q = "SELECT * FROM WHERE IDProcedimiento='"
                + IDProcedimiento + "'";
        List<Map> registros = new Database().ejecutar(q);
        Procedimiento procedimiento = null;
        for (Map registro : registros){
            procedimiento = new Procedimiento(
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (int)registro.get("CodigoCategoria"), 
                    (int)registro.get("IDPaciente"));
        }
        return procedimiento;
    }
    
    public List obtenerRegistros(){
        String q = "SELECT * FROM Procedimiento";
        List<Map> registros = new Database().ejecutar(q);
        List<Procedimiento> procedimientos = new ArrayList();
        for (Map registro : registros){
            Procedimiento procedimiento = new Procedimiento(
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (int)registro.get("CodigoCategoria"), 
                    (int)registro.get("IDPaciente"));
            procedimientos.add(procedimiento);
        }
        return procedimientos;
    }
    
    public int eliminar(String IDProcedimiento){
        String q = "DELETE FROM Procedimiento WHERE IDProcedimiento='"
                + IDProcedimiento + "'";
        return new Database().actualizar(q);
    }
    
    
   /* public Procedimiento insertar(int ID,String tipo,int montounitario, String descriproced, int montoservadom){
        
        String q= "INSERT INTO Procedimiento VALUES(' " +ID+ "  ', '  "  +tipo + "  ' , '   " + montounitario + "  ' ,  '  "  +descriproced+ " ' , ' " + montoservadom  +" ' ) ";
        
        if  (new Database().actualizar(q)    > 0 ){                  
            return new Procedimiento(ID,tipo,montounitario,descriproced,montoservadom);             // Entonces le mando los datos a la tabla  
        }
        return null;     // si no se insert el registro devuelve null

    }
    
    
    public int actualizar(int ID,String tipo,int montounitario, String descriproced, int montoservadom){
        String q= " UPDATE Procedimiento SET  Tipo= '  " + tipo  + " '  ,  MontoUnitario = '  "
                + " "+montounitario +" ' , MontoServAdom=  '  "
                + "" +montoservadom+ "  ' , DescripcionProcedimiento= '   "
                + " " +descriproced + "  "
                + "'  WHERE  IDProcedimiento= '  " +  ID+ " '   " ;
        
        
        return new Database().actualizar(q);
          
    }
    
    
    public Procedimiento obtenerRegistro(int ID){      //// Hacer una consulta con unicamente el ID del procedimiento
        String q= "SELECT * FROM Procedimiento WHERE IDProcedimiento = '      "  +  ID + "  '        ";
        List <Map>  registros=  new Database().ejecutar(q);                         //Lista que guarda los registros de la tabla
        
        Procedimiento proced=null;
        for(Map registro: registros){
            proced = new Procedimiento((int)registro.get("ID"), (String)registro.get("tipo"), (int)registro.get("montounitario"), (String)registro.get("descriproced"),(int)registro.get("montoservadom"));
        }
        return proced;                          // si entra bien al for entonces el cliente es agarrado de la base de datos y lo retorna
    
    }
    ////////////---------------------------------------------------------------------------
    
    public List obtenerRegistros(){                     /// traerse todos los procedimientos 
        String q = "SELECT * FROM Procedimiento ";
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Procedimiento> procedemento =new ArrayList();
         for(Map registro: registros){
            Procedimiento proced= new Procedimiento((int)registro.get("ID"), (String)registro.get("tipo"), (int)registro.get("montounitario"), (String)registro.get("descriproced"),(int)registro.get("montoservadom"));
       
            procedemento.add(proced);
         }
        return procedemento;  
    }
    
    
     public List obtenerRegistros(String tipo){                               // traerse todos los procedimientos segun su tipo
         String q = "SELECT * FROM Procedimiento WHERE Tipo= '  "+ tipo  + " ' " ;
        List <Map>  registros=  new Database().ejecutar(q);  
        List <Procedimiento> procedemento =new ArrayList();
         for(Map registro: registros){
            Procedimiento proced= new Procedimiento((int)registro.get("ID"), (String)registro.get("tipo"), (int)registro.get("montounitario"), (String)registro.get("descriproced"),(int)registro.get("montoservadom"));
       
            procedemento.add(proced);
         }
        return procedemento;     
        }  
     
     
     public int eliminar(String ID){
         String q = "DELETE FROM Procedimiento WHERE IDProcedimiento= '  " +ID + "  ' ";
         return new Database().actualizar(q);
     }        

    public void insertar(int id, String tipo, int montounitario, int montoadom, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        
        
        
        
    
    
    
    
    


}
