package com.fatih_izgi_design_patterns.creational.Prototype;

public class Main {
    public static void main(String[] args){

        SoldierFactory soldierFactory = new SoldierFactory();

        //Savaşa hazır normal asker nesnesi;
        Soldier availableSoldier = soldierFactory.createAvailableSoldier();

        //Savaşa uygun olmayan asker nesnesi;
        Soldier notAvailableSoldier = soldierFactory.createNotAvailableSoldier();

        //Gücü artırılmış olan asker nesnesi;
        Soldier morePowerfulSoldier = soldierFactory.createMorePowerfulSoldier(90);

        //Sağlığı artırılmış olan asker nesnesi;
        Soldier moreHealthySoldier = soldierFactory.createMoreHealthySoldier(150);

        //Askerlerin bilgileri;
        availableSoldier.showSoldierInfo();
        System.out.println();
        notAvailableSoldier.showSoldierInfo();
        System.out.println();
        morePowerfulSoldier.showSoldierInfo();
        System.out.println();
        moreHealthySoldier.showSoldierInfo();

    }
}
