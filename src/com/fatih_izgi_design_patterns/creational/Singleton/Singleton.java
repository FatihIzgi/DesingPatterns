package com.fatih_izgi_design_patterns.creational.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
