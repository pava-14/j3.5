package ru.netology.domain;

public class Book extends Product {
    private String author;


    public Book(String author) {
        this.author = author;
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || author.equalsIgnoreCase(search);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
