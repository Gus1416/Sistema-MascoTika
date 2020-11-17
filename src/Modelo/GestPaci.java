/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


public class GestPaci {
    
  private  int IDPaciente;
  private String Nombre;
 private String Raza;
   private String IDProcedimiento;
   private String Tipo;
   private String DescripcionProcedimiento;
   private int MontoUnitario;
   private int MontoServAdom;

    public GestPaci(int IDPaciente, String Nombre, String Raza, String IDProcedimiento, String Tipo, String DescripcionProcedimiento, int MontoUnitario, int MontoServAdom) {
        this.IDPaciente = IDPaciente;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.DescripcionProcedimiento = DescripcionProcedimiento;
        this.MontoUnitario = MontoUnitario;
        this.MontoServAdom = MontoServAdom;
    }

   
   
   
   
   
   
    /**
     * @return the IDPaciente
     */
    public int getIDPaciente() {
        return IDPaciente;
    }

    /**
     * @param IDPaciente the IDPaciente to set
     */
    public void setIDPaciente(int IDPaciente) {
        this.IDPaciente = IDPaciente;
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
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the IDProcedimiento
     */
    public String getIDProcedimiento() {
        return IDProcedimiento;
    }

    /**
     * @param IDProcedimiento the IDProcedimiento to set
     */
    public void setIDProcedimiento(String IDProcedimiento) {
        this.IDProcedimiento = IDProcedimiento;
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
     * @return the DescripcionProcedimiento
     */
    public String getDescripcionProcedimiento() {
        return DescripcionProcedimiento;
    }

    /**
     * @param DescripcionProcedimiento the DescripcionProcedimiento to set
     */
    public void setDescripcionProcedimiento(String DescripcionProcedimiento) {
        this.DescripcionProcedimiento = DescripcionProcedimiento;
    }

    /**
     * @return the MontoUnitario
     */
    public int getMontoUnitario() {
        return MontoUnitario;
    }

    /**
     * @param MontoUnitario the MontoUnitario to set
     */
    public void setMontoUnitario(int MontoUnitario) {
        this.MontoUnitario = MontoUnitario;
    }

    /**
     * @return the MontoServAdom
     */
    public int getMontoServAdom() {
        return MontoServAdom;
    }

    /**
     * @param MontoServAdom the MontoServAdom to set
     */
    public void setMontoServAdom(int MontoServAdom) {
        this.MontoServAdom = MontoServAdom;
    }
   
   

}
