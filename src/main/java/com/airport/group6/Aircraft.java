package com.airport.group6;

import lombok.Getter;
import lombok.Setter;

public class Aircraft {

    @Getter @Setter
    String model;
    //agrego el nombre de la aerolinea aca jo
    @Getter @Setter
    String airlineName;

    @Getter @Setter
    int passengerCapacity;

}
