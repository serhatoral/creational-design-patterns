package org.example.abstractFactory.v2;


public interface GUIFactory {

    public Component createButton();
    public Component createList();

    public Component createTable();
}
