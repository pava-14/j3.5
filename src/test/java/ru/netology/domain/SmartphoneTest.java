package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone1 = new Smartphone(2, "Z1", 10_000, "Sony");
    private Smartphone smartphone2 = new Smartphone(2, "Note", 10_000, "Sony");

    @Test
    void shouldSuccessMatchesName() {
        boolean expected = true;
        boolean actual = smartphone1.matches("Z1");

        assertEquals(actual, expected);
    }

    @Test
    void shouldSuccessMatchesManufacturer() {
        boolean expected = true;
        boolean actual = smartphone1.matches("Sony");

        assertEquals(actual, expected);
    }

    @Test
    void shouldUnsuccessMatchesName() {
        boolean expected = false;
        boolean actual = smartphone2.matches("Z1");

        assertEquals(actual, expected);
    }

    @Test
    void shouldUnSuccessMatchesManufacturer() {
        boolean expected = false;
        boolean actual = smartphone2.matches("Nokia");

        assertEquals(actual, expected);
    }
}