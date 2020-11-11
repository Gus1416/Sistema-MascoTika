

package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Modelo.Procedimiento;
import Modelo.ProcedimientoDAO;
import Vista.GestionProcedimientosVet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorVet implements ActionListener{
    
    ProcedimientoDAO proced = new ProcedimientoDAO();
    Procedimiento p =new Procedimiento();
    GestionProcedimientosVet gpv=new GestionProcedimientosVet();
    DefaultTableModel modelo= new DefaultTableModel();
    
    public ControladorVet(GestionProcedimientosVet v) {
        this.gpv = v;
        this.gpv.btnListar.addActionListener(this);     
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==gpv.btnListar){
                listar(gpv.tablaprocedvet);
            }

    }
    
    
    
    
    //////////////// GETTTTT
    
    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Procedimiento> lista = proced.listar();
        Object[] objeto = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIDProcedimiento();
            objeto[1] = lista.get(i).getTipo();
            objeto[2] = lista.get(i).getMontoUnitario();
            objeto[3] = lista.get(i).getMontoServAdom();
            objeto[4] = lista.get(i).getDescripcionProcedimiento();
            modelo.addRow(objeto);
        }
        gpv.tablaprocedvet.setModel(modelo);
        gpv.tablaprocedvet.setRowHeight(35);
        gpv.tablaprocedvet.setRowMargin(10);

    }


    

}
