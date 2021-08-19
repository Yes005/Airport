package com.airport.group6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FlightSchedule {

    Date currentTime;

    public void getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        this.currentTime = new Date();
        System.out.println("Hora actual: " + dateFormat.format(this.currentTime));
    }

    public void addFlight(){
        //logic to add flight
    }

    public void getFlight(){
        //logic to get flight
    }

    public static void main(String[] args){
        //Scanner leer = new Scanner(System.in);
        //System.out.print("Presopma una letras");
        //String m = leer.nextLine();

        //Flight flightItems = new Flight();
        List<Flight> flightCatalogue = new ArrayList<>();

        menuFlight menu = new menuFlight(flightCatalogue);
        menu.addNewFlight();
        menu.ViewMenuFlight();
    }




}
