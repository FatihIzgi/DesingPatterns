package com.fatih.izgi.design_patterns.Structural.Proxy;

class HumanResourcesEmployee extends Employee{

    public HumanResourcesEmployee(String name, String department, String position) {
        super(name, department, position);
    }

    @Override
    public void manageAnotherEmployee(String request) {
        super.manageAnotherEmployee(request);
    }
}