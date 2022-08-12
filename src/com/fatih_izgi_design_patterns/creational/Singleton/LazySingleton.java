package com.fatih_izgi_design_patterns.creational.Singleton;

public class LazySingleton {
    private static LazySingleton singleton;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
