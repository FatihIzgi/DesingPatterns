package com.fatih.izgi.design_patterns_Creational.Prototype;

interface Factory{
    Soldier createAvailableSoldier();
    Soldier createNotAvailableSoldier();
    Soldier createMorePowerfulSoldier(int power);
    Soldier createMoreHealthySoldier(int health);
}
