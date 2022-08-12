package com.fatih_izgi_design_patterns.creational.AbstractFactory;

interface IAbstractFactory{
    ICar createCar(String color, double price);
    IMotorCycle createMotorCycle(String type, double price);
}