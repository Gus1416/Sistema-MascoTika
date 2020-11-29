
package Modelo;
//import java.sql.*;


public class CitaMedica {
    
    private String IDCitaMed;
    private String Fecha;
    private String Estado;
    private int Cedulacliente;
    private String NombreVet;
    private String CategoriaProcedimiento;
    private String NombreProcedimiento;

    public CitaMedica(String IDCitaMed, String Fecha, String Estado, String CategoriaProcedimiento, String NombreProcedimiento) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.CategoriaProcedimiento = CategoriaProcedimiento;
        this.NombreProcedimiento = NombreProcedimiento;
    }

    public CitaMedica(String IDCitaMed, String Fecha, String Estado, String NombreVet, String CategoriaProcedimiento, String NombreProcedimiento) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.NombreVet = NombreVet;
        this.CategoriaProcedimiento = CategoriaProcedimiento;
        this.NombreProcedimiento = NombreProcedimiento;
    }

    public CitaMedica(String IDCitaMed, String Fecha, String Estado, int Cedulacliente, String NombreVet, String CategoriaProcedimiento) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Cedulacliente = Cedulacliente;
        this.NombreVet = NombreVet;
        this.CategoriaProcedimiento = CategoriaProcedimiento;
    }
 

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

    /**
     * @return the NombreVet
     */
    public String getNombreVet() {
        return NombreVet;
    }

    /**
     * @param NombreVet the NombreVet to set
     */
    public void setNombreVet(String NombreVet) {
        this.NombreVet = NombreVet;
    }

    /**
     * @return the CategoriaProcedimiento
     */
    public String getCategoriaProcedimiento() {
        return CategoriaProcedimiento;
    }

    /**
     * @param CategoriaProcedimiento the CategoriaProcedimiento to set
     */
    public void setCategoriaProcedimiento(String CategoriaProcedimiento) {
        this.CategoriaProcedimiento = CategoriaProcedimiento;
    }

    /**
     * @return the NombreProcedimiento
     */
    public String getNombreProcedimiento() {
        return NombreProcedimiento;
    }

    /**
     * @param NombreProcedimiento the NombreProcedimiento to set
     */
    public void setNombreProcedimiento(String NombreProcedimiento) {
        this.NombreProcedimiento = NombreProcedimiento;
    }

  
    
    
    
}
