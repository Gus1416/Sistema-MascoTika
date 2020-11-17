

package Modelo;

import java.util.*;
public class CategoriaServicioDAO {
    
    
public CategoriaServicio insertar(int CodigoCategoria,String NombreCategoria, String Estado,String DescripcionCategoria,String TipoCategoria){ 
    String q = "INSERT INTO Categoria VALUES("
                + CodigoCategoria + ",    '     "      + NombreCategoria + "    '         ,       '   " + Estado + "    '  ,    '    " + DescripcionCategoria + "  '  ,   '    " + TipoCategoria + "  '   )";
        if (new Database().actualizar(q)> 0){
            return new CategoriaServicio(CodigoCategoria,NombreCategoria,Estado,DescripcionCategoria,TipoCategoria);
        }
        return null;
    }

public int actualizar(int CodigoCategoria,String NombreCategoria, String Estado,String DescripcionCategoria,String TipoCategoria){
        String q = "UPDATE Categoria SET NombreCategoria='  "
                + NombreCategoria + "  ', Estado= '  "
                + Estado + "   ', DescripcionCategoria=' "
                + DescripcionCategoria + "  ', TipoCategoria=' "
                + TipoCategoria + "' WHERE CodigoCategoria="
                + CodigoCategoria;
        return new Database().actualizar(q);
    }

public CategoriaServicio obtenerCategoRegistroCod(int CodigoCategoria){
       String q = "SELECT * FROM  Categoria WHERE CodigoCategoria="
               + CodigoCategoria;
       List<Map> registros = new Database().ejecutar(q);
       CategoriaServicio categoria = null;
       for (Map registro : registros){
           categoria = new CategoriaServicio (
                   (int)registro.get("CodigoCategoria"), 
                   (String)registro.get("NombreCategoria"),
                   (String)registro.get("Estado"), 
                   (String)registro.get("DescripcionCategoria"), 
                   (String)registro.get("TipoCategoria"));
       }
       return categoria;
    }

public List obtenerRegistrosCategoList(){
        String q = "SELECT * FROM Categoria";
        List<Map> registros = new Database().ejecutar(q);
        List<CategoriaServicio> catego = new ArrayList();
        for (Map registro : registros){
           CategoriaServicio categoria = new CategoriaServicio(
                   (int)registro.get("CodigoCategoria"), 
                   (String)registro.get("NombreCategoria"),
                   (String)registro.get("Estado"), 
                   (String)registro.get("DescripcionCategoria"), 
                   (String)registro.get("TipoCategoria"));
           catego.add(categoria);
       }
       return catego; 
    }


public List obtenerRegistrosCategoCodList(int CodigoCategoria){
        String q = "SELECT * FROM Categoria WHERE CodigoCategoria="
               + CodigoCategoria;
        List<Map> registros = new Database().ejecutar(q);
        List<CategoriaServicio> categoria = new ArrayList();
        for (Map registro : registros){
           CategoriaServicio catego = new CategoriaServicio (
                   (int)registro.get("CodigoCategoria"), 
                   (String)registro.get("NombreCategoria"),
                   (String)registro.get("Estado"), 
                   (String)registro.get("DescripcionCategoria"), 
                   (String)registro.get("TipoCategoria"));
           categoria.add(catego);
       }
       return categoria; 
    }

public int eliminar(int CodigoCategoria){
        String q = "DELETE FROM Categoria WHERE CodigoCategoria="
                + CodigoCategoria;
        return new Database().actualizar(q);
    }



    
    
}
