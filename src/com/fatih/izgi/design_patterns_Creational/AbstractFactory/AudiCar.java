package com.fatih.izgi.design_patterns_Creational.AbstractFactory;

public class AudiCar implements ICar {
    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
