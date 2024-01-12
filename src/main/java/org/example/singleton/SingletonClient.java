package org.example.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton s = Singleton.getInstance();
            s.printName();
        }

        Singleton s1 = Singleton.getInstance();
        System.out.println("\n s1 Hashcode: " + s1.hashCode());

        Singleton s2 = Singleton.getInstance();
        System.out.println("\n s2 Hashcode: " + s2.hashCode());

        if(s1==s2)
            System.out.println("\nAynı obje");
        else
            System.out.println("\nFarklı obje");

    }
}


/*
    Döküman vb. görev gören büyük nesnelerin üretilmesi maliyetli olabilir. Static alanlar ise sınıflarla birlikte programda ilk başta yüklenmektedir.
    Bu gibi durumlarda nesne üretiminin ilk başta değil, yaratılmasına ihtiyac duyulduğu ana kadar geciktirlmesi uygun olabilir.
    Bunun içinde geç yüklemeli (lazy loading) singleton nesne oluşturulabilir.
 */