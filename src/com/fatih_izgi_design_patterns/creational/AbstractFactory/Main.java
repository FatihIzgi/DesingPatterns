package com.fatih_izgi_design_patterns.creational.AbstractFactory;

public class Main{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        IAbstractFactory audiFactory = new AudiFactory();
        IAbstractFactory bmwFactory = new BMWFactory();

        ICar audiCar = audiFactory.createCar("Beyaz", 500000);
        ICar bmwCar  = bmwFactory.createCar("Siyah", 420000);

        IMotorCycle audiMotorCycle = audiFactory.createMotorCycle("Yarış Motoru", 125000);
        IMotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("Cadde Motoru", 24000);

    }
}