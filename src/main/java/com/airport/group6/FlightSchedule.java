package com.airport.group6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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




}
