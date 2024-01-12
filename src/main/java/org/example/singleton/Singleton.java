package org.example.singleton;

/*
     Bir sınıfı singleton yapmanın en basit yolu; kurucu metodu private yaparak kendi içinde static değişkenle oluşturmaktır.
     Bu sayede sınıfın dışarıdan obje oluşturulması engellenmektedir. İlk başta sınıf yüklenirken, sınıf değişkeni olarak
     obje üretilir. (sınıf ve nesne(class and object) kavramları farklıdır. Burada static değerler sınıf değişkenidir ve
     metaspace adlı bellekte tutulur.)

     Burada basit bir şekilde singleton sınıf oluşturulmuştur.
    */
public class Singleton {

    private static Singleton singleton = new Singleton();
    private static int count;
    private String name;

    private Singleton() {
        count++;
        name = "Singleton" + count;
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }

}
