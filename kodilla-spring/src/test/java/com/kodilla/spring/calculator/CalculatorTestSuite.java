package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTestSuite {
    @Mock
    private Display display;

    @InjectMocks
    private Calculator calculator;

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
        verify(display, times(1)).displayValue(addResult);
        verify(display, times(1)).displayValue(subResult);
        verify(display, times(1)).displayValue(mulResult);
        verify(display, times(1)).displayValue(divResult);
    }
}