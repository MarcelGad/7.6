package com.kodilla.patterns.singleton;

import com.kodilla.com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private Logger logger;
    private static final String LOG_MESSAGE = "Test log message";

    @BeforeEach
    public void setUp() {
        logger = Logger.getInstance();
        logger.log(LOG_MESSAGE);
    }

    @AfterEach
    public void tearDown() {
        logger = null;
    }

    @Test
    public void testGetLastLog() {
        // Given & When
        String lastLog = logger.getLastLog();

        // Then
        assertEquals(LOG_MESSAGE, lastLog);
    }
}