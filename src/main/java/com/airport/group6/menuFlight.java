package com.airport.group6;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class menuFlight {
    List<Flight> flightList;
    Scanner leer = new Scanner(System.in);

    menuFlight(List<Flight> availableFlight){
        flightList = availableFlight;
    }

    //Ver vuelos en curso
    void ViewMenuFlight(){
        System.out.println("-----------FLIGHT---------------");
        for(Flight singleFlight:flightList){
            System.out.print("Flight Code: " + singleFlight.getId());
            System.out.print("Country of origin: " + singleFlight.getCountryOrigin());
            System.out.print("Destination: " + singleFlight.getDestination());
            System.out.print("Date: " + singleFlight.getDate());
            System.out.print("Arrival Time: " + singleFlight.getArrivalTime());
            System.out.print("Plane Model: " );

        }

    }

    //Agregar un vuelo nuevo
    void addNewFlight(){
        Flight flightItems = new Flight();
        Aircraft aircraftItems = new Aircraft();
        Airport airportItems = new Airport();

        List<Flight> flightCatalogue = new ArrayList<>();
        List<Aircraft> aircraftsCatalogue = new ArrayList<>();
        List<Airport> airportacatalogue = new ArrayList<>();

        System.out.print("Enter the flight code: ");
        flightItems.setId(Integer.parseInt(leer.nextLine()));
        System.out.print("Enter the country of origin: ");
        flightItems.setCountryOrigin(leer.nextLine());
        System.out.print("Enter the Destination: ");
        flightItems.setDestination(leer.nextLine());
        System.out.print("Enter the flight date: ");
        flightItems.setDate(leer.nextLine());
        System.out.print("Enter the Arrival Time: ");
        flightItems.setArrivalTime(leer.nextLine());
        flightCatalogue.add(flightItems);
        flightItems = new Flight();
        /*//aircratf
        System.out.print("Enter the plane model: ");
        aircraftItems.setModel(leer.nextLine());
        System.out.print("Enter the Airline Name: ");
        aircraftItems.setAirlineName(leer.nextLine());
        aircraftsCatalogue.add(aircraftItems);
        aircraftItems = new Aircraft();
        //airport
        System.out.print("Enter the airport code: ");
        airportItems.setId(Integer.parseInt(leer.nextLine()));
        System.out.print("Enter the Airport Name: ");
        airportItems.setName(leer.nextLine());
        System.out.print("Enter the Airport Name: ");
        airportItems.setName(leer.nextLine());
        System.out.print("Enter the Airport Country: ");
        airportItems.setCountry(leer.nextLine());
        System.out.print("Enter the Airport City: ");
        airportItems.setCity(leer.nextLine());


        airportacatalogue.add(airportItems);
        //
        //
        airportItems = new Airport();*/

        ViewMenuFlight();
    }
}

