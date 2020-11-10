
package Modelo;
import java.sql.Connection;
import Codigo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProcedimientoDAO {
   Conexion conectar = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   
   public List listar () {
       List<Procedimiento> datos = new ArrayList<> ();
       String sql = "select * from Procedimiento";
       try {
           con = conectar.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               Procedimiento p = new Procedimiento();
               p.setIDProcedimiento(rs.);
           }
       }catch (Exception e) {
           
       }
       return datos;
   }
}


