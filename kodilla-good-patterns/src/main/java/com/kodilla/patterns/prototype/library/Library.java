package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library implements Cloneable {
    final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public Library clone() throws CloneNotSupportedException{
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : this.books) {
            clonedLibrary.books.add(book.clone());
        }
        return clonedLibrary;

    }
}