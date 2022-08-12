package com.fatih_izgi_design_patterns.creational.Builder;

public class Main{
    public static void main(String[] args){

        //Default özelliklere sahip kitap;
        Book book1 = BookBuilder.startBuild(1, 432,"Kuzuların Sessizliği").build();

        //Default özellikler + ebook özelliğine sahip kitap;
        Book book2 = BookBuilder.buildBookWithEBookVersion(2, 172, "Otomatik Portokal", true).build();

        //Default özellikler + book marker özelliğines sahip kitap;
        Book book3 = BookBuilder.startBuild(3, 140, "Psycho").setDefaultBookMarker(true).build();

        //Kitap özelliklerini görüntüleme;
        System.out.println(book1.toString()+"\n");
        System.out.println(book2.toString()+"\n");
        System.out.println(book3.toString());
    }
}