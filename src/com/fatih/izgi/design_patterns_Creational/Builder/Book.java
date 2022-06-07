package com.fatih.izgi.design_patterns_Creational.Builder;

class Book{
    private int id;
    private int pageNumber;
    private int edition;

    private String name;
    private String authorName;

    private double price;
    private double rate;

    private boolean defaultBookMarker;
    private boolean eBookVersion;

    @Override
    public String toString() {
        return "Book\n{" + "id=" + id + ", pageNumber=" + pageNumber + ", edition=" + edition +
                "\nname=" + name + ", authorName=" + authorName + ", "
                + "\nprice=" + price + ", rate=" + rate +
                "\ndefaultBookMarker=" + defaultBookMarker + ", eBookVersion=" + eBookVersion + '}';
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDefaultBookMarker(boolean defaultBookMarker) {
        this.defaultBookMarker = defaultBookMarker;
    }

    public void seteBookVersion(boolean eBookVersion) {
        this.eBookVersion = eBookVersion;
    }


}
