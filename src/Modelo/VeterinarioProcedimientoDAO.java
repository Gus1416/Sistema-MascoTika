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
public class VeterinarioProcedimientoDAO {
    
    public VeterinarioProcedimiento insertar(String IDVet, String IDProcedimiento){
        String q = "INSERT INTO VeterinarioEjecutaProcedimiento VALUES('"
                + IDVet +"', '"
                + IDProcedimiento + "')";
        if (new Database().actualizar(q) > 0){
            return new VeterinarioProcedimiento(IDVet, IDProcedimiento);
        }
        return null;
    }
    
}
