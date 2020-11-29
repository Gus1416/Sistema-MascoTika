

package Modelo;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;




public class PDF {

    public PDF() {
    }
    
  
     
    
    public void Facturar(String Nombre, String Apellido, String Procedimiento,String Categoria, String Veterinario, int Paciente, int MontoUnitario, int MontoADomicilio){
    float fntSize, lineSpacing;
  
   
      
        
        
     
        try{
             Document document = new Document(PageSize.A5);

            document.addAuthor("Veterinaria MascoTika");
            document.addTitle("Factura Veterinarias MascoTika") ;
            System.out.println("Documento creado");
            
            PdfWriter.getInstance(document, new FileOutputStream("FACTURAVETMASKO.pdf"));
            System.out.println("Escritura..........");
            document.open();
             System.out.println("document open ");
           
             
          Paragraph veterinaria = new Paragraph(" Factura Veterinaria MascoTika" );  
          Paragraph client = new Paragraph("Cliente:  " +Nombre+  " " +Apellido);
          Paragraph tiposervicio = new Paragraph("Tipo de Servicio " +Procedimiento );
          Paragraph categoria = new Paragraph("Servicio Realizado:  "+ Categoria);
          Paragraph idvet = new Paragraph("ID Veterinario:  " +  Veterinario );
          Paragraph idpaciente = new Paragraph("ID Paciente:  " +  Paciente );
          Paragraph unitario = new Paragraph("Monto Unitario:  " + MontoUnitario    );
          Paragraph adomicilio = new Paragraph("Monto A Domicilio " +  MontoADomicilio );
            
            //Multipart emailContent = new MimeMultipart();
            document.add(veterinaria);
            document.add(client);   
            document.add(tiposervicio);
            document.add(categoria);
            document.add(idvet);
            document.add(idpaciente);
            document.add(unitario);
            document.add(adomicilio);
       
            System.out.println("Parrafos agregados al doc ");
            document.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
   
          System.out.println("Documento creado");
                
    }
    

}
