package com.fatih_izgi_design_patterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

class SoldierFactory{
    private static final Map<String,Soldier> soldiers = new HashMap();

    public static Soldier createSoldier(String soldierType){
        Soldier soldier = null;

        if(soldiers.get(soldierType)==null){
            if(soldierType.equals("Süvari")){
                soldier = new Cavalry();
            }
            else if(soldierType.equals("Okçu")){
                soldier = new Archer();
            }
            soldiers.put(soldierType,soldier);
        }
        else{
            soldier = soldiers.get(soldierType);
        }

        return soldier;
    }
}
