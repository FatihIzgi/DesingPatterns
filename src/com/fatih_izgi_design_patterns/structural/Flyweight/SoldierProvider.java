package com.fatih_izgi_design_patterns.structural.Flyweight;

class SoldierProvider{

    private static Soldier soldier;

    public static void provideSoldier(int numberOfCavalry, int numberOfArcher){

        for(int i=0; i<numberOfCavalry; i++){

            soldier = SoldierFactory.createSoldier("Süvari");
            soldier.assignRandomValues();
            System.out.println("Temin edilen süvarinin hasar gücü : "+Math.floor(soldier.calculateSoldierDamage()));

        }

        for(int i=0; i<numberOfArcher; i++){
            soldier = SoldierFactory.createSoldier("Okçu");
            soldier.assignRandomValues();
            System.out.println("Temin edilen okçunun hasar gücü : "+Math.floor(soldier.calculateSoldierDamage()));
        }
    }

}
