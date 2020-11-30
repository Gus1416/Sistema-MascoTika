/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gustavo
 */
public class RedesSocialesVetDAO {
    
    public RedesSocialesVet insertar(String IDVet, String RedesSociales){
        String q = "INSERT INTO RedesSocialesVeterinario VALUES('"
                + IDVet +"', '"
                + RedesSociales + "')";
        if (new Database().actualizar(q) > 0){
            return new RedesSocialesVet(IDVet, RedesSociales);
        }
        return null;
    }
    
    public int actualizar(String IDVet, String RedesSociales){
        String q = "UPDATE RedesSocialesVeterinario SET RedesSociales = '"
                + RedesSociales +"' "
                + "WHERE Cedula = '"+ IDVet +"'"; 
        return new Database().actualizar(q);
    }
}
