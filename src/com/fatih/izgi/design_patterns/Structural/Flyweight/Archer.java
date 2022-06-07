package com.fatih.izgi.design_patterns.Structural.Flyweight;

import java.util.Random;

class Archer implements Soldier{ //Okçu

    public static int objectCounter = 0;

    private int health;
    private int agility;
    private int power;

    private String name;
    private String weapon;

    public Archer(){
        name = "Okçu";
        weapon = "Ok";

        objectCounter++;
    }

    @Override
    public void assignRandomValues(){
        Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+90;
        power = random.nextInt(100)+85;
    }

    //Okçular için verilen hasar hesaplaması;
    @Override
    public double calculateSoldierDamage() {
        return ((health*2)+(agility*3)+(power*2))/12.0;
    }
}