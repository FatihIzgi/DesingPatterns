package com.fatih_izgi_design_patterns.creational.Singleton;

public class ThreadedLazySingleton {

    private static ThreadedLazySingleton singleton;

    private ThreadedLazySingleton(){

    }

    public static ThreadedLazySingleton getInstance(){
        synchronized(ThreadedLazySingleton.class){
            if(singleton==null){
                singleton = new ThreadedLazySingleton();
            }
        }
        return singleton;
    }
}
