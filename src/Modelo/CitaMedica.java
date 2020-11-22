
package Modelo;
//import java.sql.*;


public class CitaMedica {
    
    private String IDCitaMed;
    private String Fecha;
    private String Estado;
    private int Cedulacliente;
 

    public CitaMedica() {
    }

    public CitaMedica(String IDCitaMed, String Fecha, String Estado, int CedulaCliente) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Cedulacliente = CedulaCliente;
    }
    
    
    
    

    /**
     * @return the IDCitaMed
     */
    public String getIDCitaMed() {
        return IDCitaMed;
    }

    /**
     * @param IDCitaMed the IDCitaMed to set
     */
    public void setIDCitaMed(String IDCitaMed) {
        this.IDCitaMed = IDCitaMed;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getCedulacliente() {
        return Cedulacliente;
    }

    public void setCedulacliente(int Cedulacliente) {
        this.Cedulacliente = Cedulacliente;
    }

  
    
    
    
}
