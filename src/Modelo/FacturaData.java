

package Modelo;


public class FacturaData {
    
   private  String Cliente;
   private  String Procedimiento;
   private  String Categoria;
   private  String Veterinario;
   private  int Paciente;
   private  int MontoUnitario;
   private  int MontoADomicilio;

    public FacturaData() {
    }

   
    public FacturaData(String Procedimiento, String Categoria, String Veterinario, int Paciente, int MontoUnitario, int MontoADomicilio) {
        this.Procedimiento = Procedimiento;
        this.Categoria = Categoria;
        this.Veterinario = Veterinario;
        this.Paciente = Paciente;
        this.MontoUnitario = MontoUnitario;
        this.MontoADomicilio = MontoADomicilio;
    }

    

   
   
   
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getVeterinario() {
        return Veterinario;
    }

    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    public int getPaciente() {
        return Paciente;
    }

    public void setPaciente(int Paciente) {
        this.Paciente = Paciente;
    }

    public int getMontoUnitario() {
        return MontoUnitario;
    }

    public void setMontoUnitario(int MontoUnitario) {
        this.MontoUnitario = MontoUnitario;
    }

    public int getMontoADomicilio() {
        return MontoADomicilio;
    }

    public void setMontoADomicilio(int MontoADomicilio) {
        this.MontoADomicilio = MontoADomicilio;
    }
   
   
   
   
}
