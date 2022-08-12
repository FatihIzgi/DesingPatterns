package com.fatih_izgi_design_patterns.structural.Adapter;

public class CarWithSpeedInKm implements Radar{
    private String licensePlate;
    private double speed;

    public static double MAX_KPH_SPEED = 120;

    public CarWithSpeedInKm(String licensePlate, double speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    @Override
    public double getKphSpeed() {
        return speed;
    }

    @Override
    public void showPaymentInfo() {
        if(speed>MAX_KPH_SPEED){

            PaymentCalculator paymentCalculator = new PaymentCalculator();
            double payment = paymentCalculator.calculatePaymentForSpeed(this);

            System.out.println(licensePlate+" plakalı aracın hız aşımı yaptığı tespit edilmiştir.");
            System.out.println("Hız aşımı sebebi ile ödenmesi gereken ceza "+payment+" TL'dir.");

        }
        else{
            System.out.println(licensePlate+" plakalı araca ait herhangi bir hız aşımı cezası bulunmamaktadır.");
        }
    }
}
