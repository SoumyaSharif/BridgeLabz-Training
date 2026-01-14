package com.texteditor;
public class Action {
    String type;   // insert / delete
    String text;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
