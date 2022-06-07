package com.fatih.izgi.design_patterns_Creational.Singleton;

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
