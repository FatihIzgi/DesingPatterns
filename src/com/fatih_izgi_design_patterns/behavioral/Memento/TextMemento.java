package com.fatih_izgi_design_patterns.behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

class TextMemento{

    private String text;
    private List<String> textList;
    private int listIndex = 0;

    public TextMemento(String text) {
        textList = new ArrayList<String>();
        updateCurrentText(text);
    }

    public String getCurrentText(){
        return text;
    }

    public void updateCurrentText(String text) {
        this.text = text;
        textList.add(text);
        listIndex++;
    }

    public String getPreviousText(){
        if(textList.size()!=0){
            String previousText = textList.get(textList.size()-2);
            textList.remove(textList.size()-1);
            return previousText;
        }
        else{
            return "";
        }
    }
}
