package org.example.singleton;

//Burada birden fazla singleton nesnesi oluşmayacaktır.
public class ThreadSafeLazySingletonClient extends Thread{

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new ThreadSafeLazySingletonClient().start();
        }
    }

    @Override
    public void run() {
        ThreadSafeLazySingleton tsls = ThreadSafeLazySingleton.getInstance();
        tsls.printName();

    }
}
