package com.fatih.izgi.design_patterns.Structural.Adapter;

class CarWithSpeedInMph implements MileRadar{

    private String licensePlate;
    private double speed;


    public CarWithSpeedInMph(String licensePlate, double speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    @Override
    public double getMphSpeed() {
        return speed;
    }

    @Override
    public void showPaymentInfo() {

        MphToKphAdapter adapter = new MphToKphAdapter(this);

        if(adapter.getKphSpeed()>CarWithSpeedInKm.MAX_KPH_SPEED){

            PaymentCalculator paymentCalculator = new PaymentCalculator();
            double payment = paymentCalculator.calculatePaymentForSpeed(adapter);

            System.out.println(licensePlate+" plakalı aracın hız aşımı yaptığı tespit edilmiştir.");
            System.out.println("Hız aşımı sebebi ile ödenmesi gereken ceza "+payment+" TL'dir.");

        }
        else{
            System.out.println(licensePlate+" plakalı araca ait herhangi bir hız aşımı cezası bulunmamaktadır.");
        }
    }
}