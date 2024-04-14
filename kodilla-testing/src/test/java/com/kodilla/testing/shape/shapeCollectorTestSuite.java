package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class shapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for ShapeCollector class")
    class ShapeCollectorTests {
        private ShapeCollector shapeCollector;

        @BeforeEach
        void setUp() {
            shapeCollector = new ShapeCollector();
        }

        @DisplayName("Test adding figure to collection")
        @Test
        void testAddFigure() {
            // Given
            Shape square = new Square(5);

            // When
            shapeCollector.addFigure(square);

            // Then
            assertEquals(1, shapeCollector.getShapes().size());
        }

        @DisplayName("Test removing figure from collection")
        @Test
        void testRemoveFigure() {
            // Given
            Shape square = new Square(5);
            shapeCollector.addFigure(square);

            // When
            boolean result = shapeCollector.removeFigure(square);

            // Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapes().size());
        }

        @DisplayName("Test getting figure from collection by index")
        @Test
        void testGetFigure() {
            // Given
            Shape triangle = new Triangle(4, 3);
            shapeCollector.addFigure(triangle);

            // When
            Shape retrievedShape = shapeCollector.getFigure(0);

            // Then
            assertNotNull(retrievedShape);
            assertEquals("Triangle", retrievedShape.getShapeName());
        }

        @DisplayName("Test showing all figures from collection")
        @Test
        void testShowFigures() {
            // Given
            Shape circle = new Circle(6);
            shapeCollector.addFigure(circle);
            Shape square = new Square(4);
            shapeCollector.addFigure(square);
            Shape triangle = new Triangle(3, 4);
            shapeCollector.addFigure(triangle);

            // When
            String result = shapeCollector.showFigures();

            // Then
            assertEquals("Circle, Square, Triangle, ", result);
        }
    }
}