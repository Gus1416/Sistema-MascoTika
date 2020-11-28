/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


public class BusquedaAvanzada {
    
    private String IDProcedimiento;
    private String Tipo;
    private int MontoUnitario;
    private int MontoServAdom;
    private String DescripcionProced;
    private String Categoria;
    private String IDVet;
    private int Cedula;
    private String Horario;
    private String Ubicacion;
/*
    public BusquedaAvanzada(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProced, String Categoria, String IDVet, int Cedula, String Horario, String Ubicacion) {
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.MontoServAdom = MontoServAdom;
        this.DescripcionProced = DescripcionProced;
        this.Categoria = Categoria;
        this.IDVet = IDVet;
        this.Cedula = Cedula;
        this.Horario = Horario;
        this.Ubicacion = Ubicacion;
    }*/

    public BusquedaAvanzada(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProced, String Categoria, String IDVet, String Horario, String Ubicacion) {
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.MontoServAdom = MontoServAdom;
        this.DescripcionProced = DescripcionProced;
        this.Categoria = Categoria;
        this.IDVet = IDVet;
        this.Horario = Horario;
        this.Ubicacion = Ubicacion;
    }
    
    
    
    
    public String getIDProcedimiento() {
        return IDProcedimiento;
    }

    public void setIDProcedimiento(String IDProcedimiento) {
        this.IDProcedimiento = IDProcedimiento;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getMontoUnitario() {
        return MontoUnitario;
    }

    public void setMontoUnitario(int MontoUnitario) {
        this.MontoUnitario = MontoUnitario;
    }

    public int getMontoServAdom() {
        return MontoServAdom;
    }

    public void setMontoServAdom(int MontoServAdom) {
        this.MontoServAdom = MontoServAdom;
    }

    public String getDescripcionProced() {
        return DescripcionProced;
    }

    public void setDescripcionProced(String DescripcionProced) {
        this.DescripcionProced = DescripcionProced;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getIDVet() {
        return IDVet;
    }

    public void setIDVet(String IDVet) {
        this.IDVet = IDVet;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
        
}
