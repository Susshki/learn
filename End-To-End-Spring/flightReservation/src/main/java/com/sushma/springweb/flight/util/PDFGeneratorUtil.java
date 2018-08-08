package com.sushma.springweb.flight.util;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sushma.springweb.flight.entities.Flight;
import com.sushma.springweb.flight.entities.Passenger;
import com.sushma.springweb.flight.entities.Reservation;

@Component
public class PDFGeneratorUtil {
	public void generatePDF(Reservation  reservation, String filePath) {
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			
			document.add(getPDFText(reservation));
			
			document.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}

	private PdfPTable getPDFText(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		
		PdfPCell cell = new PdfPCell(new Phrase("Flight Iternary"));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		Flight flight = reservation.getFlight();
		table.addCell("Flight Number");		
		table.addCell(flight.getFlightNumber());
		table.addCell("Departure City");		
		table.addCell(flight.getDepartureCity());
		table.addCell("Arrival City");
		table.addCell(flight.getArrivalCity());
		table.addCell("Departure Date");		
		table.addCell(flight.getDateOfDeparture().toString()+" "+flight.getTimeOfDeparture().toLocaleString());
		
		Passenger passenger = reservation.getPassenger();
		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Passenger Name");
		table.addCell(passenger.getFirstName() +" "+passenger.getMiddleName() +" "+passenger.getLastName());
		
		table.addCell("Phone");
		table.addCell(passenger.getPhone());
		
		table.addCell("Email");
		table.addCell(passenger.getEmail());
		
		return table;
	}
}
