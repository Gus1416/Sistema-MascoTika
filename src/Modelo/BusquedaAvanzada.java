package Modelo;

/**
 * Clase que contiene los atributos y métodos de Búsqueda Avanzada
 * @author Sebastian
 */
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


    /**
     * Constructor parametrizado
     * @param IDProcedimiento Identificador dle procedimiento
     * @param Tipo Tipo de procedimiento
     * @param MontoUnitario Costo del servicio unitario
     * @param MontoServAdom Costo del servicio a domicilio
     * @param DescripcionProced Descripción del procedimiento
     * @param Categoria Categoría del servicio 
     * @param IDVet Identificador del veterinario
     * @param Horario del veterinario
     * @param Ubicacion Ubicación del veterinario
     */
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
    
    
    
    
   /* public String getIDProcedimiento() {
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
    }*/

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
     * @return the DescripcionProced
     */
    public String getDescripcionProced() {
        return DescripcionProced;
    }

    /**
     * @param DescripcionProced the DescripcionProced to set
     */
    public void setDescripcionProced(String DescripcionProced) {
        this.DescripcionProced = DescripcionProced;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
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
     * @return the Horario
     */
    public String getHorario() {
        return Horario;
    }

    /**
     * @param Horario the Horario to set
     */
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    /**
     * @return the Ubicacion
     */
    public String getUbicacion() {
        return Ubicacion;
    }

    /**
     * @param Ubicacion the Ubicacion to set
     */
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
        
}
