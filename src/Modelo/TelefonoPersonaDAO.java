
package Modelo;


public class TelefonoPersonaDAO {
    
    public TelefonoPersona insertar(int Cedula, int Telefono){
        String q = "INSERT INTO Telefonos VALUES("
                + Cedula +", "
                + Telefono + ")";
        if (new Database().actualizar(q) > 0){
            return new TelefonoPersona(Cedula, Telefono);
        }
        return null;
    }
    
    public int actualizar(int Cedula, int Telefono){
        String q = "UPDATE Telefonos SET Telefono = "
                + Telefono
                + " WHERE Cedula = "+ Cedula; 
        return new Database().actualizar(q);
    }
    
}
