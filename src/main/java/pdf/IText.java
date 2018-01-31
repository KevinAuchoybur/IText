package pdf;

import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class IText {
	
	public static void main(String[] args){
		
		
		
		Document document = new Document(PageSize.A4);
		document.addTitle("IText");
		document.addAuthor("KA");
		System.out.println("Doc created");
		
		try {
			
			PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
			System.out.println("Writer instance created");
			document.open();
			System.out.println("Doc open");
			Paragraph para = new Paragraph("Hello World");
			document.add(para);
			System.out.println("para add");
			
		} catch (Exception e) {
			System.out.println(e);
			document.close();
			System.out.println("Doc close");
		}
		
	}
	
	

}
