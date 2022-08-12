package com.fatih_izgi_design_patterns.behavioral.Memento;

public class Main {
    public static void main(String[] args) {

        Text text = new Text();
        System.out.println("Güncel Text    : "+text.getText());

        text.add("Daha çok konuşabilmek isterdim");
        System.out.println("Ekleme Yapıldı : "+text.getText());

        text.add(" ama yemeğe");
        System.out.println("Ekleme Yapıldı : "+text.getText());

        text.undo();
        System.out.println("Geri Alındı    : "+text.getText());

        text.add(" bir arkadaşım davetli.");
        System.out.println("Ekleme Yapıldı : "+text.getText());

        text.setText("Kuzuların çığlıkları dindiğinde bana haber verirsin değil mi?");
        System.out.println("Güncellendi    : "+text.getText());


    }
}
