
package Modelo;
import java.sql.Connection;
import Codigo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


        
        ///////////////////////// SETSET 
        
        
public class ProcedimientoDAO {
   Conexion conectar = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   
   public List listar () {
       List<Procedimiento> datos = new ArrayList<> ();
       String sql = "select * from Procedimiento";
       try {
           con = Conexion.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               Procedimiento p = new Procedimiento();
               p.setIDProcedimiento(rs.getInt(1));
                p.setTipo(rs.getString(2));
                p.setMontoUnitario(rs.getInt(3));
                p.setMontoServAdom(rs.getInt(4));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    
   }
}


