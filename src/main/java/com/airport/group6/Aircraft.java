package com.airport.group6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Aircraft {

    @Getter @Setter
    String model;
    //agrego el nombre de la aerolinea aca jo
    @Getter @Setter
    String airlineName;

    @Getter @Setter
    int passengerCapacity;


    public static void main(String[] args){
        Aircraft aircraft = new Aircraft();
        List<Aircraft> aircraftList = new ArrayList<>();

        aircraft.setModel("model1");
        aircraft.setPassengerCapacity(100);
        aircraftList.add(aircraft);
        aircraft = new Aircraft();

        aircraft.setModel("model2");
        aircraft.setPassengerCapacity(150);
        aircraftList.add(aircraft);
        aircraft = new Aircraft();

        aircraft.setModel("model3");
        aircraft.setPassengerCapacity(300);
        aircraftList.add(aircraft);

        for(Aircraft singleAircraft:aircraftList){
            System.out.println("Model: " + singleAircraft.getModel());
            System.out.println("Passenger capacity: " + singleAircraft.getPassengerCapacity());
        }




    }
}
