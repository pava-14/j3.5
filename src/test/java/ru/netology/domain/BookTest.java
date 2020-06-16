package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book1 = new Book(1, "Java", 100, "Dane");
    private Book book3 = new Book(3, "Life", 100, "Smith");

    @Test
    void shouldSuccessMatchesName() {
        boolean expected = true;
        boolean actual = book1.matches("Java");

        assertEquals(actual, expected);
    }

    @Test
    void shouldSuccessMatchesAuthor() {
        boolean expected = true;
        boolean actual = book3.matches("Smith");

        assertEquals(actual, expected);
    }

    @Test
    void shouldUnsuccessMatchesName() {
        boolean expected = false;
        boolean actual = book1.matches("Pascal");

        assertEquals(actual, expected);
    }

    @Test
    void shouldUnsuccessMatchesAuthor() {
        boolean expected = false;
        boolean actual = book3.matches("John");

        assertEquals(actual, expected);
    }
}