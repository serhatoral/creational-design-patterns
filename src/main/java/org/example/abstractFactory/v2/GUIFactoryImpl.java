package org.example.abstractFactory.v2;


/*
Burada aynı aileden ya da birbirleri ile ilişkili factory metodlar bir arda toplanmıştır.
Bu durumda sınıfın birlikteliği düşmezken nesneleri yaratan metodların farklı parametre alabilmeleri sağlanır.
 */
public class GUIFactoryImpl implements GUIFactory{

    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createList() {
        return new List();
    }

    @Override
    public Component createTable() {
        return new Table();
    }
}
