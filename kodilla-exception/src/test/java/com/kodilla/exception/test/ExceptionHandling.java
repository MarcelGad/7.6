package com.kodilla.exception.test;

public class ExceptionHandling {
        public void handleException() {
            SecondChallenge secondChallenge = new SecondChallenge();
            double[] xValues = {1.5, 1.0, 0.5, 2.0, 2.5};
            double[] yValues = {1.5, 1.0, 0.5};

            for (double x : xValues) {
                for (double y : yValues) {
                    try {
                        String result = secondChallenge.probablyIWillThrowException(x, y);
                        System.out.println("Dla x = " + x + " i y = " + y + ": " + result);
                    } catch (Exception e) {
                        System.out.println("Wyjątek złapany dla x = " + x + " i y = " + y + ": " + e.getMessage());
                    }
                    finally {
                        System.out.println("End program");
                    }
                }
            }
        }
    }