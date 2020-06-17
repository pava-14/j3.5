package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book1 = new Book(1, "Java", 100, "Dane");
    private Book book3 = new Book(3, "Life", 100, "Smith");

    @Test
    void shouldSuccessMatchesName() {
        assertTrue(book1.matches("Java"));
    }

    @Test
    void shouldSuccessMatchesAuthor() {
        assertTrue(book3.matches("Smith"));
    }

    @Test
    void shouldUnsuccessMatchesName() {
        assertFalse(book1.matches("Pascal"));
    }

    @Test
    void shouldUnsuccessMatchesAuthor() {
        assertFalse(book3.matches("John"));
    }
}