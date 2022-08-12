package com.fatih_izgi_design_patterns.structural.Decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Package implements ICar {
    private String name;
    protected ICar car;
    protected double price;

    private List<Package> componentList = new ArrayList<>();

    public Package(String name, ICar car, double price) {
        this.name = name;
        this.car = car;
        this.price = price;
        componentList.add(this);
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + price;
    }

    @Override
    public List<Package> getComponents() {
        List<Package> currentComponentList = car.getComponents();
        currentComponentList.add(this);
        return currentComponentList;
    }

    @Override
    public String toString() {
        return name;
    }

    //Getter&Setter Methods;
}