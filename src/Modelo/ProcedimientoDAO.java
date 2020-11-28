
package Modelo;

import java.util.*;
import Modelo.*;



        
        ///////////////////////// SETSET 
        
        
public class ProcedimientoDAO {   

    /**
     *
     * @param IDProcedimiento
     * @param Tipo
     * @param MontoUnitario
     * @param MontoServAdom
     * @param DescripcionProcedimiento
     * @param categoriacode
     * @param idpaciente
     * @return
     */
    public Procedimiento insertar(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int categoriacode, int idpaciente) {
        System.out.println(" un print del metodo inserta mi bro " + categoriacode);
        System.out.println("otro print del metodo insertar mi bro " + idpaciente);
        String q = "INSERT INTO Procedimiento VALUES(  ' " + IDProcedimiento +  "   '  ,   '  " + Tipo +   "  '  ,  " + MontoUnitario + " ,  " + MontoServAdom + " ,  '   " + DescripcionProcedimiento + "  '   ,  " + categoriacode + "  ,  " +  idpaciente + " )";
        if (new Database().actualizar(q) > 0){
            return new Procedimiento(IDProcedimiento, Tipo, MontoUnitario, MontoServAdom, DescripcionProcedimiento, categoriacode,idpaciente);
        }
        return null;     
    }
    public int actualizar(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente){
        String q = "UPDATE Procedimiento SET Tipo='  "
                + Tipo + "   ', MontoUnitario="
                + MontoUnitario + ", MontoServAdom="
                + MontoServAdom + ", DescripcionProcedimiento=' "
                + DescripcionProcedimiento + " ', CodigoCategoria="
                + CodigoCategoria + ", IDPaciente="
                + IDPaciente + "WHERE IDProcedimiento= '"
                + IDProcedimiento + " '  "  ;
        return new Database().actualizar(q);
    }
    
    
    public Procedimiento obtenerRegistroID(String IDProcedimiento){
        String q = "SELECT * FROM Procedimiento WHERE IDProcedimiento=' "
               + IDProcedimiento;
        List<Map> registros = new Database().ejecutar(q);
        Procedimiento proced =null;
        for (Map registro : registros){
             proced = new Procedimiento(
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (int)registro.get("CodigoCategoria"), 
                    (int)registro.get("IDPaciente"));
        }
        return proced;
    }
    
  
     public List obtenerRegistrosLista(){
        String q = "SELECT * FROM Procedimiento";
        List<Map> registros = new Database().ejecutar(q);
        List<Procedimiento> procedimientos = new ArrayList();
        for (Map registro : registros){
            Procedimiento procedimie = new Procedimiento(
                    (String)registro.get("NombreProcedimiento"),
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"));
            procedimientos.add(procedimie);
        }
        return procedimientos;
    }
    
    
    public List obtenerRegistroIDLista(String IDProcedimiento){
        String q = "SELECT * FROM Procedimiento WHERE IDProcedimiento='"
                + IDProcedimiento + " '";
        List<Map> registros = new Database().ejecutar(q);
        List<Procedimiento> procedimientos = new ArrayList();
        for (Map registro : registros){
            Procedimiento proced = new Procedimiento(
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (int)registro.get("CodigoCategoria"), 
                    (int)registro.get("IDPaciente"));
            procedimientos.add(proced);
        }
       
        return procedimientos;       
        
    }
    
    public int eliminar(String IDProcedimiento){
        String q = "DELETE FROM Procedimiento WHERE IDProcedimiento='"
                + IDProcedimiento + "'";
        return new Database().actualizar(q);
    }
    
   
}
