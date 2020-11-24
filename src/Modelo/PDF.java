

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




public class PDF {
    
    public static void main (String [] args ){
        float fntSize, lineSpacing;
  
          
     
        try{
             Document document = new Document(PageSize.A4);

            document.addAuthor("Veterinaria MascoTika");
            document.addTitle("Factura Veterinarias MascoTika") ;
            System.out.println("Documento creado");
            
            PdfWriter.getInstance(document, new FileOutputStream("FACTURAVETMASKO.pdf"));
            System.out.println("Escritura..........");
            document.open();
             System.out.println("document open ");
            Paragraph para = new Paragraph("Monto Cancelado:        ");
            Paragraph parag = new Paragraph("Servicio Realizado:    ");
            Paragraph paragr = new Paragraph("Veterinario:                ");
            Paragraph paragra = new Paragraph("Procedimiento:       ");
            document.add(para);
            document.add(parag);
            document.add(paragr);
            document.add(paragra);
            System.out.println("Parrafos agregados al doc ");
            document.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
   
          System.out.println("Documento creado");
                
    }
    

}
