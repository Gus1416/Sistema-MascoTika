
package Modelo;


public class RedesSocialesVet {
    
    private String IDVet;
    private String RedesSociales;

    public RedesSocialesVet() {
    }

    public RedesSocialesVet(String IDVet, String RedesSociales) {
        this.IDVet = IDVet;
        this.RedesSociales = RedesSociales;
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
     * @return the RedesSociales
     */
    public String getRedesSociales() {
        return RedesSociales;
    }

    /**
     * @param RedesSociales the RedesSociales to set
     */
    public void setRedesSociales(String RedesSociales) {
        this.RedesSociales = RedesSociales;
    }    
}
