
package Modelo;


public class Procedimiento {
    
    private String NombreProcedimiento;
    private String IDProcedimiento;
    private String Tipo;
    private int MontoUnitario;
    private int MontoServAdom;
    private String DescripcionProcedimiento;
    private int CodigoCategoria;
    private int IDPaciente;
    private String Nombre;

    public Procedimiento(String NombreProcedimiento, String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente, String Nombre) {
        this.NombreProcedimiento = NombreProcedimiento;
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.MontoServAdom = MontoServAdom;
        this.DescripcionProcedimiento = DescripcionProcedimiento;
        this.CodigoCategoria = CodigoCategoria;
        this.IDPaciente = IDPaciente;
        this.Nombre = Nombre;
    }

    public Procedimiento() {
    }
    
    public Procedimiento(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente) {
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.DescripcionProcedimiento = DescripcionProcedimiento;
        this.MontoServAdom = MontoServAdom;
        this.CodigoCategoria=CodigoCategoria;
        this.IDPaciente=IDPaciente;
    }

    
    
    public Procedimiento(String NombreProcedimiento, String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento) {
        this.NombreProcedimiento = NombreProcedimiento;
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.MontoServAdom = MontoServAdom;
        this.DescripcionProcedimiento = DescripcionProcedimiento;
    }
    
    
    
    public Procedimiento(String Tipo) {
        this.Tipo = Tipo;  
    }

    Procedimiento(String IDProcedimiento, String Tipo, int MontoUnitario, int MontoServAdom, String DescripcionProcedimiento, int categoriacode, int idpaciente, String Nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the CodigoCategoria
     */
    public int getCodigoCategoria() {
        return CodigoCategoria;
    }

    /**
     * @param CodigoCategoria the CodigoCategoria to set
     */
    public void setCodigoCategoria(int CodigoCategoria) {
        this.CodigoCategoria = CodigoCategoria;
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
    
    

  
    
    
}
