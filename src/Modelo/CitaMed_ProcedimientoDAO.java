
package Modelo;


public class CitaMed_ProcedimientoDAO {
    
    public CitaMed_Procedimiento insertar (String IDProcedimiento, String IDCitaMed){
        String q = "INSERT INTO CitaMedicaContieneProcedimientos VALUES ('"
                +IDProcedimiento+"','"
                +IDCitaMed+"')";
        if (new Database().actualizar(q) > 0){
            return new CitaMed_Procedimiento(IDCitaMed, IDProcedimiento);
        }
        return null;
    }
}
