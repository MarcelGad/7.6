package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";
    public final Task createTask(final String createTask) {
        switch (createTask) {
            case SHOPPING:
                return new ShoppingTask("SHOPPING","TEA",1);
            case PAINTING:
                return new PaintingTask("PAINTING","RED","ROOM");
            case DRIVING:
                return new DrivingTask("DRIVING","NEW YORK","CAR");
            default:
                return null;
        }
    }
}