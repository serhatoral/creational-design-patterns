package org.example.singleton;

public class LazySingletonClient {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Singleton s = Singleton.getInstance();
            s.printName();
        }
    }

}
