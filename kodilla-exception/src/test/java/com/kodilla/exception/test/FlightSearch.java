package com.kodilla.exception.test;

import com.kodilla.exception.io.Flight;
import com.kodilla.exception.io.RouteNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private final Map<String, Boolean> airports;

    public FlightSearch() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Roma", true);
        airports.put("London", false);
        airports.put("Madrid", true);
        airports.put("Barcelona", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        if (!airports.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Flight to " + arrivalAirport + " not found!");
        }
        return airports.get(arrivalAirport);
    }
}