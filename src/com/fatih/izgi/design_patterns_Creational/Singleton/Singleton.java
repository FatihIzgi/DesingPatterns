package com.fatih.izgi.design_patterns_Creational.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
