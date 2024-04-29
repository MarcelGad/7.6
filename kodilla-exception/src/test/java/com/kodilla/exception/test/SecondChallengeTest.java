package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondChallengeTest {
    @Test
    void probablyIWillThrowExceptionTest() throws Exception {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When
        String result = secondChallenge.probablyIWillThrowException(1.0, 1.0);

        // Then
        assertEquals("Done!", result);
    }
}