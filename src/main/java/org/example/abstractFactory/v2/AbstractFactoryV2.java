package org.example.abstractFactory.v2;



public class AbstractFactoryV2 {

    public static void main(String[] args) {
        new Client(new GUIFactoryImpl());
    }
}
