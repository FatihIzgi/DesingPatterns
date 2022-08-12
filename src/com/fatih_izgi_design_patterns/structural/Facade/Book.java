package com.fatih_izgi_design_patterns.structural.Facade;

class Book{
    private String name;
    private boolean hasTimeOut;
    private int scheduledHoldingDay;
    private int actualHoldingDay;

    public static double defaultRentingPrice = 0.35;

    public Book(String name, int scheduledHoldingDay, int actualHoldingDay) {
        this.name = name;
        this.scheduledHoldingDay = scheduledHoldingDay;
        this.actualHoldingDay = actualHoldingDay;
    }

    public boolean hasTimeOut() {
        if(scheduledHoldingDay-actualHoldingDay<0){
            return true;
        }
        else {
            return false;
        }
    }

    public int getScheduledHoldingDay() {
        return scheduledHoldingDay;
    }

    public int getActualHoldingDay() {
        return actualHoldingDay;
    }

    public String getName() {
        return name;
    }
}