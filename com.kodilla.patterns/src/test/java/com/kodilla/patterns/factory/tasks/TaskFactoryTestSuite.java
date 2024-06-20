package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTaskCreation() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);

        // Then
        assertNotNull(shoppingTask);
        assertEquals("SHOPPING", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTaskCreation() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);

        // Then
        assertNotNull(paintingTask);
        assertEquals("PAINTING", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTaskCreation() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);

        // Then
        assertNotNull(drivingTask);
        assertEquals("DRIVING", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
    }
}