package org.example.abstractFactory.v1;

public class Client {


    public Client(GUIFactory factory) {
        Component component = factory.create();
        component.paint();
    }

}
