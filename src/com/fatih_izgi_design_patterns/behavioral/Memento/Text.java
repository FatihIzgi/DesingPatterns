package com.fatih_izgi_design_patterns.behavioral.Memento;

class Text{

    private TextMemento memento;
    private String text;

    public Text() {
        this.text = "";
        memento = new TextMemento(text);
    }

    public String getText() {
        return text;
    }

    public void add(String extraText){
        text += extraText;
        memento.updateCurrentText(extraText);
    }

    public void undo(){
        text = memento.getPreviousText();
        memento.updateCurrentText(text);
    }

    public void setText(String text) {
        this.text = text;
        memento.updateCurrentText(text);
    }

    public TextMemento getMemento() {
        return memento;
    }

}
