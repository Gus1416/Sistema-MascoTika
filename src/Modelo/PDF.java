

package Modelo;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
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
    
  
     
    
    public void Facturar(String Nombre, String Apellido, String Procedimiento,String Categoria, String Veterinario, String Descripcion, int Paciente, int MontoUnitario, int MontoADomicilio){
    float fntSize, lineSpacing;
  
   
      
        
        
     
        try{
             Document document = new Document(PageSize.A6);

            document.addAuthor("Veterinaria MascoTika");
            document.addTitle("Factura Veterinarias MascoTika") ;
            System.out.println("Documento creado");
            
            PdfWriter.getInstance(document, new FileOutputStream("FACTURAVETMASKO.pdf"));
            System.out.println("Escritura..........");
            document.open();
             System.out.println("document open ");
           
             
          Font f1= new Font(Font.FontFamily.TIMES_ROMAN,10);
            Font f3= new Font(Font.FontFamily.TIMES_ROMAN,17);
            Paragraph veterinaria = new Paragraph(" Factura Veterinaria MascoTika" ,f3);
             veterinaria.setSpacingAfter(20);
            Paragraph espace = new Paragraph("");
            Paragraph espac = new Paragraph("");
            Paragraph espa = new Paragraph("");
            Paragraph client = new Paragraph("Cliente:  " + Nombre + " " + Apellido , f1);
            Paragraph tiposervicio = new Paragraph("Tipo de Servicio: " + Procedimiento, f1);
            Paragraph categoria = new Paragraph("Servicio Realizado:  " + Categoria , f1);
            Paragraph descripcion = new Paragraph("Descripcion:  " + Descripcion , f1);
            Paragraph idvet = new Paragraph("ID Veterinario:  " + Veterinario, f1);
            Paragraph idpaciente = new Paragraph("ID Paciente:  " + Paciente, f1);
            Paragraph unitario = new Paragraph("Monto Unitario:  " + MontoUnitario, f1);
            Paragraph adomicilio = new Paragraph("Monto A Domicilio " + MontoADomicilio, f1);
            

            //Multipart emailContent = new MimeMultipart();
            document.add(veterinaria);
            document.add(espace);
            document.add(espac);
            document.add(espa);
            
            document.add(client);
            document.add(tiposervicio);
            document.add(categoria);
             document.add(descripcion);
            document.add(idvet);
            document.add(idpaciente);
            document.add(unitario);
            document.add(adomicilio);

            Image img = Image.getInstance("mascotika.png");
             img.scaleAbsolute(200f, 100f);                                                                        // SIze de la imagen 
           img.setAbsolutePosition(50f, 80f);                                                           //Posicion de la imagen
            document.add(img);
            System.out.println("Parrafos agregados al doc ");
            document.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
   
          System.out.println("Documento creado");
                
    }
    

}
