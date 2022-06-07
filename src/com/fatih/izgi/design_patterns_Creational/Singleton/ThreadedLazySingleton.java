package com.fatih.izgi.design_patterns_Creational.Singleton;

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
