package com.fatih.izgi.design_patterns.Structural.Flyweight;

import java.util.Random;

class Cavalry implements Soldier { //Süvari

    public static int objectCounter = 0;

    private int health;
    private int agility;
    private int power;

    private String name;
    private String weapon = "Kılıç";

    public Cavalry() {
        name = "Süvari";
        weapon = "Kılıç";

        objectCounter++;
    }

    //Süvariler için verilen hasar hesaplaması;
    @Override
    public double calculateSoldierDamage() {
        return ((health*1)+(agility*2)+(power*3))/11.0;
    }

    @Override
    public void assignRandomValues(){
        Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+85;
        power = random.nextInt(100)+90;
    }
}