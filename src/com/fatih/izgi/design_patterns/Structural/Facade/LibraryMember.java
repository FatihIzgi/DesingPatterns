package com.fatih.izgi.design_patterns.Structural.Facade;

import java.util.ArrayList;

class LibraryMember{
    private int id;
    private String name;
    private double debt;
    private ArrayList<Book> books = new ArrayList<>();

    public LibraryMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void rentBook(Book book){
        books.add(book);
    }
    public void returnBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}