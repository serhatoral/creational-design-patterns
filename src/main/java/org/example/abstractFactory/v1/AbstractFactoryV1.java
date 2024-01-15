package org.example.abstractFactory.v1;



/*
Burada abstract factory'nin temel bir uygulanışı yapılmıştır. Burada asıl sorunlardan biri ortak methodun
nesnelere göre farklı parametre almasıdır. Bu duruma uygun yapı v2 paketinde yapılmıştır.
 */
public class AbstractFactoryV1 {

    public static void main(String[] args) {
            new Client(new ListFactory());
    }
}
