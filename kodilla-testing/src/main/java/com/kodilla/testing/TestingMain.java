package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        testCalculator();
    }

    public static void testCalculator() {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 3);
        if (addResult == 8) {
            System.out.println("Test for add() passed.");
        } else {
            System.out.println("Test for add() failed.");
        }

        int subtractResult = calculator.subtract(5, 3);
        if (subtractResult == 2) {
            System.out.println("Test for subtract() passed.");
        } else {
            System.out.println("Test for subtract() failed.");
        }
    }
}