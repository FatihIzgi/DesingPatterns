package com.fatih_izgi_design_patterns.creational.Singleton;

public class DoubleCheckedLockingSingleton {

    private static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton(){

    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(singleton==null){
            synchronized(DoubleCheckedLockingSingleton.class){
                if(singleton==null){
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
