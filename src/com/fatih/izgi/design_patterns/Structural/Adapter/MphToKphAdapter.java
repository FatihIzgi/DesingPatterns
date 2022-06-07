package com.fatih.izgi.design_patterns.Structural.Adapter;

class MphToKphAdapter implements Radar{

    private CarWithSpeedInMph carWithSpeedInMph;
    private static double KPH_MPH_RATE = 0.6213;

    public MphToKphAdapter(CarWithSpeedInMph carWithSpeedInMph) {
        this.carWithSpeedInMph = carWithSpeedInMph;
    }

    @Override
    public double getKphSpeed() {
        return (carWithSpeedInMph.getMphSpeed()/KPH_MPH_RATE);
    }

    @Override
    public void showPaymentInfo() {

    }
}