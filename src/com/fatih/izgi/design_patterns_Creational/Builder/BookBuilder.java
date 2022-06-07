package com.fatih.izgi.design_patterns_Creational.Builder;

class BookBuilder{
    private int id;
    private int pageNumber;
    private int edition;

    private String name;
    private String authorName;

    private double price;
    private double rate;

    private boolean defaultBookMarker;
    private boolean eBookVersion;

    public static BookBuilder startBuild(int id, int pageNumber, String name){

        BookBuilder bookBuilder = new BookBuilder();

        bookBuilder.id = id;
        bookBuilder.pageNumber = pageNumber;
        bookBuilder.name = name;

        return bookBuilder;
    }

    public static BookBuilder buildBookWithEBookVersion(int id, int pageNumber, String name, boolean eBookVersion){
        BookBuilder bookBuilder = new BookBuilder();

        bookBuilder.id = id;
        bookBuilder.pageNumber = pageNumber;
        bookBuilder.name = name;

        bookBuilder.eBookVersion = eBookVersion;

        return bookBuilder;
    }

    public BookBuilder setDefaultBookMarker(boolean defaultBookMarker) {
        this.defaultBookMarker = defaultBookMarker;
        return this;
    }

    public Book build(){
        Book book = new Book();

        book.setId(id);
        book.setPageNumber(pageNumber);
        book.setEdition(edition);

        book.setName(name);
        book.setAuthorName(authorName);

        book.setPageNumber(pageNumber);
        book.setPrice(price);

        book.setDefaultBookMarker(defaultBookMarker);
        book.seteBookVersion(eBookVersion);

        return book;
    }

}