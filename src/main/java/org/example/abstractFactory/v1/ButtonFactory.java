package org.example.abstractFactory.v1;

public class ButtonFactory implements GUIFactory{
    @Override
    public Component create() {
        return new Button();
    }
}
