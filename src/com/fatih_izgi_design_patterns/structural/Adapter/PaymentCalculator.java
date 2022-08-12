package com.fatih_izgi_design_patterns.structural.Adapter;

class PaymentCalculator{

    private static double KPH_PAYMENT_RATE = 26.85;

    public double calculatePaymentForSpeed(Radar radar){
        double difference =  radar.getKphSpeed() - CarWithSpeedInKm.MAX_KPH_SPEED;
        return difference * KPH_PAYMENT_RATE;

    }
}