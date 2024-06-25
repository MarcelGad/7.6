package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Book 1", "Author 1", LocalDate.of(2000, 1, 1)));
        library.getBooks().add(new Book("Book 2", "Author 2", LocalDate.of(2001, 2, 2)));
        library.getBooks().add(new Book("Book 3", "Author 3", LocalDate.of(2002, 3, 3)));
        //When
        int originalSize = library.getBooks().size();

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        //Then
        assertEquals(3, originalSize);
        assertEquals(originalSize, clonedLibrary.getBooks().size());
    }
}