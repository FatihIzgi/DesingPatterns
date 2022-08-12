package com.fatih_izgi_design_patterns.creational.Prototype;

interface Factory{
    Soldier createAvailableSoldier();
    Soldier createNotAvailableSoldier();
    Soldier createMorePowerfulSoldier(int power);
    Soldier createMoreHealthySoldier(int health);
}
