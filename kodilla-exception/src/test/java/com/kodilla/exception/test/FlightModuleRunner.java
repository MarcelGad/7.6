package com.kodilla.exception.test;

import com.kodilla.exception.io.Flight;
import com.kodilla.exception.io.RouteNotFoundException;

public class FlightModuleRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Tokyo");
        FlightSearch flightSearch = new FlightSearch();

        try {
            boolean isFlightAvailable = flightSearch.findFlight(flight);
            if (isFlightAvailable) {
                System.out.println("Flight to " + flight.getArrivalAirport() + " is available.");
            } else {
                System.out.println("Flight to " + flight.getArrivalAirport() + " is not available.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}