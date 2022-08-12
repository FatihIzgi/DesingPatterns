package com.fatih_izgi_design_patterns.creational.AbstractFactory;

class AudiFactory implements IAbstractFactory{

    @Override
    public ICar createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public IMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}