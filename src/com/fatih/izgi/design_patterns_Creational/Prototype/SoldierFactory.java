package com.fatih.izgi.design_patterns_Creational.Prototype;

class SoldierFactory implements Factory{
    private static Soldier availableSoldier = new Soldier(100,45,20,50,60,5,"Kılıç",true);

    private static Soldier notAvailableSoldier = new Soldier(100,45,20,50,60,5,"Kılıç",false);

    @Override
    public Soldier createAvailableSoldier() {
        return availableSoldier;
    }

    @Override
    public Soldier createNotAvailableSoldier() {
        return notAvailableSoldier;
    }



    @Override
    public Soldier createMorePowerfulSoldier(int power) {

        Soldier soldier = availableSoldier.clone();
        soldier.setPower(power);
        return soldier;
    }

    @Override
    public Soldier createMoreHealthySoldier(int health) {
        Soldier soldier = availableSoldier.clone();
        soldier.setHealth(health);
        return soldier;
    }
}

