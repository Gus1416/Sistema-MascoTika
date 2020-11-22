/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gustavo
 */
public class ConsultPaci {
    
    private String IDCitaMed;
    private String Fecha;
    private String Estado;
    private int CedulaCliente;
    private String Tipo;

    public ConsultPaci() {
    }
    
    

    public ConsultPaci(String IDCitaMed, String Fecha, String Estado, int CedulaCliente, String Tipo) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.CedulaCliente = CedulaCliente;
        this.Tipo = Tipo;
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

    /**
     * @return the CedulaCliente
     */
    public int getCedulaCliente() {
        return CedulaCliente;
    }

    /**
     * @param CedulaCliente the CedulaCliente to set
     */
    public void setCedulaCliente(int CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
    
    
    
}
