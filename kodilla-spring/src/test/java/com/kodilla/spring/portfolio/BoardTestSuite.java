package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = com.kodilla.spring.portfolio.BoardConfig.class)
public class BoardTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testTaskAdd() {
        // Given
        com.kodilla.spring.portfolio.Board board = context.getBean(com.kodilla.spring.portfolio.Board.class);

        // When
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Task done");

        // Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Task done", board.getDoneList().getTasks().get(0));
    }
}