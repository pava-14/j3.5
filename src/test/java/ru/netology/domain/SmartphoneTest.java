package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone1 = new Smartphone(11, "Z1", 10_000, "Sony");
    private Smartphone smartphone2 = new Smartphone(22, "Note", 10_000, "Sony");

    @Test
    void shouldSuccessMatchesName() {
        assertTrue(smartphone1.matches("Z1"));
    }

    @Test
    void shouldSuccessMatchesManufacturer() {
        assertTrue(smartphone1.matches("Sony"));
    }

    @Test
    void shouldUnsuccessMatchesName() {
        assertFalse(smartphone2.matches("Z1"));
    }

    @Test
    void shouldUnSuccessMatchesManufacturer() {
        assertFalse(smartphone2.matches("Nokia"));
    }
}