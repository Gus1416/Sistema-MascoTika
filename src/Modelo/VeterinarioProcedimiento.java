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
public class VeterinarioProcedimiento {
    
    private String IDVet;
    private String IDProcedimiento;

    public VeterinarioProcedimiento() {
    }

    public VeterinarioProcedimiento(String IDVet, String IDProcedimiento) {
        this.IDVet = IDVet;
        this.IDProcedimiento = IDProcedimiento;
    }

    /**
     * @return the IDVet
     */
    public String getIDVet() {
        return IDVet;
    }

    /**
     * @param IDVet the IDVet to set
     */
    public void setIDVet(String IDVet) {
        this.IDVet = IDVet;
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
    
    
    
}
