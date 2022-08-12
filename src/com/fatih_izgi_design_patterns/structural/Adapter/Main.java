package com.fatih_izgi_design_patterns.structural.Adapter;

public class Main {
    public static void main(String[] args) {

        CarWithSpeedInKm carWithSpeedInKm = new CarWithSpeedInKm("TR 12 34",150);
        CarWithSpeedInMph carWithSpeedInMph = new CarWithSpeedInMph("US 56 78",93.195);

        carWithSpeedInKm.showPaymentInfo();
        System.out.println("--");
        carWithSpeedInMph.showPaymentInfo();
    }
}
