package com.airport.group6;

import lombok.Getter;
import lombok.Setter;

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
}
