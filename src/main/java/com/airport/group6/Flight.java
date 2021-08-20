package com.airport.group6;

import lombok.Getter;
import lombok.Setter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;


public class Flight {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String countryOrigin;

    @Getter @Setter
    private String cityOrigin;

    @Getter @Setter
    private String destination;

    @Getter @Setter
    private String date;

    @Getter @Setter
    private String arrivalTime;


    Airline airline;

    public void readExcel(){
        try {
            String ruteExcel = "Data.xlsx";
            FileInputStream inputStream = new FileInputStream(ruteExcel);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator iterator = sheet.iterator();

            DataFormatter formatter = new DataFormatter();
            while (iterator.hasNext()){
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = (Cell) cellIterator.next();
                    String contentCell = formatter.formatCellValue(cell);
                    System.out.println("Cell: " + contentCell);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void createExcel() throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Sheet1");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("¡Example!");
        OutputStream out = new FileOutputStream("src/main/resources/ExampleExcel.xls");
        workbook.write(out);

        System.out.print("Create Excel successfully");
    }

    public void sendEmail() throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port","587");
        props.setProperty("mail.smtp.user", "aeroportgroup06@gmail.com");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(true);

        BodyPart bodyPart = new MimeBodyPart();
        bodyPart.setText("Message");

        BodyPart attached = new MimeBodyPart();
        attached.setDataHandler(new DataHandler(new FileDataSource("Data.xlsx")));
        attached.setFileName("Data.xlsx");

        MimeMultipart multipart = new MimeMultipart();

        multipart.addBodyPart(bodyPart);
        multipart.addBodyPart(attached);

        MimeMessage message = new MimeMessage(session);

        // Se rellena el From
        message.setFrom(new InternetAddress("aeroportgroup06@gmail.com"));

        // Se rellenan los destinatarios
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("yeshuab3@gmail.com"));

        // Se rellena el subject
        message.setSubject("Hola");

        // Se mete el texto y la foto adjunta.
        message.setContent(multipart);

        Transport t = session.getTransport("smtp");
        t.connect("aeroportgroup06@gmail.com","123qweQWE");
        t.sendMessage(message,message.getAllRecipients());
        t.close();

        System.out.print("Send message");

    }

    public static void main(String[] args) throws IOException, MessagingException {
        Flight flight = new Flight();
        flight.sendEmail();
    }
}
