
package Modelo;


public class CategoriaServicio {
    
    private int CodigoCategoria;
    private String NombreCategoria;
    private String Estado;
    private String DescripcionCategoria;
    private String TipoCategoria;

   
    
    
    public CategoriaServicio() {
    }

    public CategoriaServicio(int CodigoCategoria, String NombreCategoria, String Estado, String DescripcionCategoria, String TipoCategoria) {
        this.CodigoCategoria = CodigoCategoria;
        this.NombreCategoria = NombreCategoria;
        this.Estado = Estado;
        this.DescripcionCategoria = DescripcionCategoria;
        this.TipoCategoria = TipoCategoria;
    }

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
     * @return the NombreCategoria
     */
    public String getNombreCategoria() {
        return NombreCategoria;
    }

    /**
     * @param NombreCategoria the NombreCategoria to set
     */
    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
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
     * @return the DescripcionCategoria
     */
    public String getDescripcionCategoria() {
        return DescripcionCategoria;
    }

    /**
     * @param DescripcionCategoria the DescripcionCategoria to set
     */
    public void setDescripcionCategoria(String DescripcionCategoria) {
        this.DescripcionCategoria = DescripcionCategoria;
    }

    /**
     * @return the TipoCategoria
     */
    public String getTipoCategoria() {
        return TipoCategoria;
    }

    /**
     * @param TipoCategoria the TipoCategoria to set
     */
    public void setTipoCategoria(String TipoCategoria) {
        this.TipoCategoria = TipoCategoria;
    }
    
}
