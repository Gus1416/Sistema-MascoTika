

package Modelo;



import java.util.*;
import Modelo.*;
import javax.swing.table.DefaultTableModel;


public class BusquedaAvanzadaDAO {

    
  public List obtenerRegistrosConsultaCompleta(String Categoria,String Tipo,String Ubicacion, int monto1, int monto2){
 
            
     
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula AND Categoria.NombreCategoria= ' "+ Categoria +" '  AND  Procedimiento.Tipo =  ' " + Tipo +"' AND Ubicacion =   ' "+Ubicacion+" ' AND  MontoUnitario  between  "  + monto1+   "  AND   "+ monto2+ "  AND  MontoServAdom  between  "  +   monto1   +    "   AND    "  +  monto2 + "      ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
  
 public List obtenerDATA(){ 
        String consult = "SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula "; 
        List<Map> registros = new Database().ejecutar(consult);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map data : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)data.get("IDProcedimiento"),
                    (String)data.get("Tipo"), 
                    (int)data.get("MontoUnitario"), 
                    (int)data.get("MontoServAdom"),
                    (String)data.get("DescripcionProcedimiento"), 
                    (String)data.get("NombreCategoria"), 
                     (String)data.get("IDVet"),
                    (String)data.get("HorarioAtencion"),
                    (String)data.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }  
  
 
 
 
 /// Consulta solo Tipo-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  public List obtenerRegistrosSoloTipoString(String Tipo){
          
   
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND  Procedimiento.Tipo =  '"+ Tipo +"'       ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
 
/// Consulta solo Categoria---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
    public List obtenerRegistrosSoloCategoria(String Categoria){
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula AND Categoria.NombreCategoria=  '"+ Categoria +"'   ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
 
 // Consulta solo Ubicacion -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
      public List obtenerRegistrosSoloUbicacion(String Ubicacion){
          
 
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Ubicacion =   '"+Ubicacion+"'  ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
 
/// Consulta solo por monto ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      
      //************
        public List obtenerRegistrosSoloPorMonto(int monto1, int  monto2){
           

        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND  MontoUnitario  between  "  +  monto1 +   "  AND   "+  monto2 + "  AND  MontoServAdom  between  "  +   monto1   +    "   AND    "  +  monto2 + "      ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
 
 /// Consulta Tipo y Categoria---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
  public List obtenerRegistrosCategoriayTipo(String Categoria,String Tipo){
            
        System.out.println("Me llega esto como tipo:"  + Tipo );
        System.out.println("Me llega esto como categoria:"  + Categoria);
  
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND  Procedimiento.Tipo =  '" +  Tipo + "'     AND Categoria.NombreCategoria= '"+ Categoria +"'    ";    
        
        
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }        
 
 /// Consulta por Tipo y Ubicacion---------------------------------------------------------------------------------------------------------------------------------------------------------------
  
    public List obtenerRegistrosTipoyUbicacion(String Tipo,String Ubicacion){
        
        System.out.println("Me llega esto como tipo dentro del metodo:"  + Tipo );
        System.out.println("Me llega esto como tipo deltro del metodo :"  + Ubicacion );
          
        String query =  "SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND  Procedimiento.Tipo =   '"+Tipo+"'     AND UbicacionPersona.Ubicacion= '"+Ubicacion+"'   " ;
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
// Consulta por Tipo y Precio ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    //*********
      public List obtenerRegistrosTipoyMontos(String Tipo,int monto1, int monto2){
          
         System.out.println("Me llega esto como tipo dentro del metodo:"  + Tipo );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 ); 
        String query = "SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula   AND  Procedimiento.Tipo =  '"+Tipo+"'  AND  MontoUnitario  between  "  +  monto1 +   "  AND   "+  monto2 + "  AND  MontoServAdom  between  "  +   monto1   +    "   AND    "  +  monto2 + "      ";
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }
    
    // Consulta por Categoria y Ubicacion Vet---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      
      public List obtenerRegistrosCategoyUbicacion (String Categoria,String Ubicacion){
         System.out.println("Me llega esto como categoria:"  + Categoria );
        System.out.println("Me llega esto como ubicacion:"  + Ubicacion);      
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula AND Categoria.NombreCategoria= '"+Categoria+"'  AND UbicacionPersona.Ubicacion = '"+Ubicacion+"'   ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }  
 ////Consulta por categoria y montos ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      
      public List obtenerRegistrosConsultaCategoriayMontos(String Categoria, int monto1, int monto2){
        System.out.println("Me llega esto como categoria  dentro del metodo:"  + Categoria );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 );   
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula AND Categoria.NombreCategoria='"+Categoria +"' AND  MontoUnitario  between  "+ monto1+"  AND   "+monto2+"  AND  MontoServAdom  between  "+monto1+"   AND    "+monto2+"    ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }  
      
 /// Consulta por Ubicacion y Montos      -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   public List obtenerRegistrosUbicacionyMontos(String Ubicacion,int monto1, int monto2){
       System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como monto1 :"  + monto1 ); 
         System.out.println("Me llega esto como monto2 :"  + monto2 );   
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Ubicacion ='"+Ubicacion+"' AND  MontoUnitario  between  "+ monto1+"  AND   "+ monto2+"  AND  MontoServAdom  between  "+monto1+"   AND "+monto2+"      ";    
        List<Map> registros = new Database().ejecutar(query);
        List<BusquedaAvanzada> search = new ArrayList();
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    } 
   
   
   
     public List obtenerUBICACATEGOTYPE(String Ubicacion,String Categoria, String Tipo){
       System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Tipo"  + Tipo);   
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Ubicacion ='"+Ubicacion+"' AND  Procedimiento.Tipo =  '" +  Tipo + "'     AND Categoria.NombreCategoria= '"+ Categoria +"'    "; 
        List<BusquedaAvanzada> search = new ArrayList();
        List<Map> registros = new Database().ejecutar(query);
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    } 
     
   public List obtenerUBICACATEGOMONTOSS(String Ubicacion,String Categoria, int monto1, int monto2){
       System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);   
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Ubicacion ='"+Ubicacion+"' AND Categoria.NombreCategoria= '"+ Categoria +"'   AND  MontoUnitario  between  "+ monto1+"  AND   "+ monto2+"  AND  MontoServAdom  between  "+monto1+"   AND "+monto2+"      "; 
        List<BusquedaAvanzada> search = new ArrayList();
        List<Map> registros = new Database().ejecutar(query);
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }   
     
public List obtenerUBICAMONTOSTYPE(String Tipo,String Ubicacion, int monto1, int monto2){
       System.out.println("Me llega esto como Ubicacion  dentro del metodo:"  + Ubicacion );
        System.out.println("Me llega esto como Categoria :"  + Tipo ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);  
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Ubicacion ='"+Ubicacion+"' AND  Procedimiento.Tipo =  '" +  Tipo + "'  AND  MontoUnitario  between  "+ monto1+"  AND   "+ monto2+"  AND  MontoServAdom  between  "+monto1+"   AND "+monto2+"      ";    
        List<BusquedaAvanzada> search = new ArrayList();
        List<Map> registros = new Database().ejecutar(query);
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }  


 public List obtenerTYPECATEGOMONTOSS(String Tipo,String Categoria, int monto1, int monto2){
       System.out.println("Me llega esto como Tipo  dentro del metodo:"  + Tipo);
        System.out.println("Me llega esto como Categoria :"  + Categoria ); 
         System.out.println("Me llega esto como Monto1"  + monto1);   
         System.out.println("Me llega esto como Monto2"  + monto2);   
          
        String query = " SELECT Procedimiento.IDProcedimiento,Tipo,MontoUnitario,MontoServAdom,DescripcionProcedimiento,Categoria.NombreCategoria,Veterinario.IDVet,HorarioAtencion,Ubicacion FROM Procedimiento,Veterinario, VeterinarioEjecutaProcedimiento,UbicacionPersona,Categoria WHERE Categoria.CodigoCategoria = Procedimiento.CodigoCategoria AND Procedimiento.IDProcedimiento =VeterinarioEjecutaProcedimiento.IDProcedimiento AND Veterinario.IDVet = VeterinarioEjecutaProcedimiento.IDVet AND UbicacionPersona.Cedula = Veterinario.Cedula  AND Procedimiento.Tipo ='"+Tipo+"' AND Categoria.NombreCategoria= '"+ Categoria +"'   AND  MontoUnitario  between  "+ monto1+"  AND   "+ monto2+"  AND  MontoServAdom  between  "+monto1+"   AND "+monto2+"      "; 
        List<BusquedaAvanzada> search = new ArrayList();
        List<Map> registros = new Database().ejecutar(query);
        for (Map registro : registros){
            BusquedaAvanzada    busqueda = new BusquedaAvanzada (
                    (String)registro.get("IDProcedimiento"),
                    (String)registro.get("Tipo"), 
                    (int)registro.get("MontoUnitario"), 
                    (int)registro.get("MontoServAdom"),
                    (String)registro.get("DescripcionProcedimiento"), 
                    (String)registro.get("NombreCategoria"), 
                     (String)registro.get("IDVet"),
                    (String)registro.get("HorarioAtencion"),
                    (String)registro.get("Ubicacion")  );  
            search.add(busqueda);
          
        }        
         return search  ;     
    }   
     
     

  
}
