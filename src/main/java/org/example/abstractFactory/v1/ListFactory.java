package org.example.abstractFactory.v1;

public class ListFactory implements GUIFactory{


    @Override
    public Component create() {
        return new List();
    }
}
