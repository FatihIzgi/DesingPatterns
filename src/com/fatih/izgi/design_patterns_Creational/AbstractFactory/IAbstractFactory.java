package com.fatih.izgi.design_patterns_Creational.AbstractFactory;

interface IAbstractFactory{
    ICar createCar(String color, double price);
    IMotorCycle createMotorCycle(String type, double price);
}