package org.example.singleton;

    /*
    Döküman vb. görev gören büyük nesnelerin üretilmesi maliyetli olabilir. Static alanlar ise sınıflarla birlikte programda ilk başta yüklenmektedir.
    Bu gibi durumlarda nesne üretiminin ilk başta değil, yaratılmasına ihtiyac duyulduğu ana kadar geciktirlmesi uygun olabilir.
    Bunun içinde geç yüklemeli (lazy loading) singleton nesne oluşturulabilir.
 */

public class LazySingleton {

    private static LazySingleton singleton;
    private static int count;
    private String name;

    private LazySingleton() {
        count++;
        name = "Singleton" + count;
    }

    public static LazySingleton getInstance(){
        if(singleton == null)
            singleton = new LazySingleton();
        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }
}
