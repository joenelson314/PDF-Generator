package com.example.pdfgenerator.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class PDFGeneratorService {
    public void export(HttpServletResponse response) throws IOException {

        Document doc = new Document(PageSize.A4);
        PdfWriter.getInstance(doc, response.getOutputStream());

        doc.open();
        Font fontContent = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontContent.setSize(24);

        Paragraph para = new Paragraph("Custom elements", fontContent);
        para.setAlignment(Paragraph.ALIGN_CENTER);




        doc.add(para);
        //doc.add(*Custom Elements*);

doc.close();

    }
}
