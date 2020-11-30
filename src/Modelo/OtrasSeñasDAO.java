
package Modelo;
import Modelo.*;


public class OtrasSeñasDAO {
    
        public OtrasSeñasPersona insertar(int Cedula, String OtrasSeñas){
        String q = "INSERT INTO OtrasSeñasPersona VALUES("
                + Cedula +", '"
                + OtrasSeñas + "')";
        if (new Database().actualizar(q) > 0){
            return new OtrasSeñasPersona(Cedula, OtrasSeñas);
        }
        return null;
    }
    
public int actualizar(int Cedula, String OtrasSeñas){
        String q = "UPDATE OtrasSeñasPersona SET OtrasSeñas = '"
                + OtrasSeñas +"' "
                + "WHERE Cedula = "+ Cedula; 
        return new Database().actualizar(q);
    }
    
}
