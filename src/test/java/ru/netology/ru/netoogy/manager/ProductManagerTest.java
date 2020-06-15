package ru.netology.ru.netoogy.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class ProductManagerTest {
    @Mock
    private ProductRepository repository;
    @InjectMocks
    private ProductManager manager;
    private Book book1 = new Book(1, "Java", 100, "Dane");
    private Smartphone smartphone1 = new Smartphone(2, "Z1", 10_000, "Sony");
    private Book book2 = new Book(1, "Java", 100, "Burd");
    private Smartphone smartphone2 = new Smartphone(2, "Note", 10_000, "Sony");
    private Book book3 = new Book(1, "Life", 100, "Smith");
    private Smartphone smartphone3 = new Smartphone(2, "S9", 10_000, "Samsung");

    @BeforeEach
    public void setUp() {
        doNothing().when(repository).save(book1);
        doNothing().when(repository).save(book2);
        doNothing().when(repository).save(smartphone1);
        doNothing().when(repository).save(smartphone2);
        doNothing().when(repository).save(book3);
        doNothing().when(repository).save(smartphone3);

        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(book3);
        manager.add(smartphone3);
    }

    @Test
    void shouldSearchIfExistsName() {
        Product[] returned = new Product[]{book1, book2};
        doReturn(returned).when(repository).findAll();

        Product[] actual = manager.searchBy("Java");
        Product[] expected = new Product[]{book1, book2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchIfNotExistsName() {
        Product[] returned = new Product[0];
        doReturn(returned).when(repository).findAll();

        Product[] actual = manager.searchBy("Pascal");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);
    }

}