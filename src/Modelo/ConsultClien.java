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
public class ConsultClien {
    
    private int Cedula;
    private String Nombre;
    private String Apellido;
    private String IDCitaMed;
    private String Fecha;
    private String Estado;
    private String Tipo;
    private String Email;

    public ConsultClien() {
    }

    public ConsultClien(int Cedula, String Nombre, String Apellido, String IDCitaMed, String Fecha, String Estado, String Tipo, String Email) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Tipo = Tipo;
        this.Email = Email;
    }

    public ConsultClien(int Cedula, String Nombre, String Apellido, String Email) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
    }

    public ConsultClien(String IDCitaMed, String Fecha, String Estado) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
        
    }

    
    
    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

