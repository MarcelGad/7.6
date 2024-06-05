package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Calculator.class, Display.class})
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Autowired
    private Display display;

    @Test
    public void testCalculations() {
        // Given
        double a = 10;
        double b = 5;

        // When
        double addResult = calculator.add(a, b);
        double subResult = calculator.sub(a, b);
        double mulResult = calculator.mul(a, b);
        double divResult = calculator.div(a, b);

        // Then
        display.displayValue(addResult);
        display.displayValue(subResult);
        display.displayValue(mulResult);
        display.displayValue(divResult);
    }
}