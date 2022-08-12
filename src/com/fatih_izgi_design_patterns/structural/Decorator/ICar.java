package com.fatih_izgi_design_patterns.structural.Decorator;

import java.util.List;

public interface ICar {
    double calculatePrice();
    List<Package> getComponents();
}