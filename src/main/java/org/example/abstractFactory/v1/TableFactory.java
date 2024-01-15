package org.example.abstractFactory.v1;

public class TableFactory implements GUIFactory{
    @Override
    public Component create() {
        return new Table();
    }
}
