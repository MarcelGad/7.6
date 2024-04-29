package com.kodilla.exception.io;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(String message) {
        super(message);
    }
}