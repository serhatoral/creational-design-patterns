package org.example.abstractFactory.v1;

public class Table implements Component{
    @Override
    public void paint() {
        System.out.println("Tablo çiz");
    }
}
