package com.fatih.izgi.design_patterns.Structural.Proxy;

class MobileDeveloperEmployee extends Employee{


    public MobileDeveloperEmployee(String name, String department, String position) {
        super(name, department, position);
    }

    @Override
    public void manageAnotherEmployee(String request) {
        super.manageAnotherEmployee(request);
    }
}