
package Modelo;


public class CitaMed_Procedimiento {
    
    private String IDCitaMed;
    private String IDProcedimiento;

    public CitaMed_Procedimiento() {
    }

    public CitaMed_Procedimiento(String IDProcedimiento, String IDCitaMed) {
        this.IDCitaMed = IDCitaMed;
        this.IDProcedimiento = IDProcedimiento;
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
