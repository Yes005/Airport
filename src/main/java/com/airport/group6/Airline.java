package com.airport.group6;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Airline {

    @Getter @Setter
    private String name;
    List<Aircraft> aircraftList;

    Airline(List<Aircraft> availableAircraft){
        aircraftList = availableAircraft;
    }

    void getAircraft(){
        for(Aircraft aircraft:aircraftList){
            System.out.print("Model: " + aircraft.getModel());
            System.out.print("Passenger capacity: " + aircraft.getPassengerCapacity());
        }
    }

    public static void main(String[] args){


    }


}
