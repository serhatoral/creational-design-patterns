package org.example.singleton;

/*
        Lazy load singletonun problemi çok kanallı (multi-thread) ortamlarda probleme yol açmasıdır.
        null kontrolünü aynı anda birden fazla kanalın yapmasıyla birlikte(birden fazla null görünür), birden fazla
         singleton nesnesi oluşur.

        Bu durumda thread safety sağlamak için getInstance() metodunun aynı anda sadece bir tek kanal tarafından
        çağrılabileceğinden emin olmak gerekir. Bunun için dışlayıcı kilit(mutex lock) kullanılmalıdır. Bu Java'da
        "synchronized" kullanılarak tüm metodun ya da belirlenen kapsamın(scope) aynı anda sadece bir kanal tarafından
        çalıştırılmasıyla sağlanır.

     */

public class ThreadSafeLazySingleton {



    /*
     volatile anahtarı, threadin synchronized bloğundan çıkmadan singleton değişkenini not null yapmayı sağlar.
     Eğer bu kullanılmazsa thread önce kendi local hafızasında not null yapar, ardından ana hafızada not null yapar.
     Birinci thread bloktan çıktıktan sonra bu değer güncellenebilir. Bu durumda aradaki süre zarfında  ikinci thread
     bloğa girerek singleton değerini null görebilir ve 2 nesne oluşabilir.

     Bunu engellemek için volatile anahtarı kullanılmalıdır.
     */

    private static volatile ThreadSafeLazySingleton singleton; //volatile anahtarı synchronized bloğunun

    private static int count;
    private String name;

    private ThreadSafeLazySingleton(){
        name = "ThreadSafeLazySingleton" + count;
        count++;
    }

    /*
      synchronized belirli bir kısma uygulanıyor. Static alanın içinde olduğumuzdan ortada nesne olmadığı için
      bulunduğumuz sııfın mutex lockını alıyoruz; "synchronized (ThreadSafeLazySingleton.class){}".
      Java'da bu şekilde çalışmaktadır.
     */
    public static ThreadSafeLazySingleton getInstance(){
        synchronized (ThreadSafeLazySingleton.class){  // threadler tek tek girerler
            if(singleton == null)
                singleton = new ThreadSafeLazySingleton();
        }
        return  singleton;
    }


    public static ThreadSafeLazySingleton getInstanceWithDoubleCheckedLocking(){

        /*
        Normalde yukarıdaki getInstance metodunda tüm threadler sırayla singleton nesnesi için null kontrolü yapmakta
        ve bunu birbirini bekleyerek sırayla yapmaktadır. Bu durum maliyeti arttırmaktadır. İlk gelen threadler için
        synchronized bloğunun çalışması sağlanıp daha sonra gelen threadlerin bu bloğa girip null kontrolü yapmasını
        engellemek performans artışını sağlar.

        Buna Double Check Locking Pattern denilmektedir. Güzel bir optimizasyon :)
         */

        if(singleton == null){
            synchronized (ThreadSafeLazySingleton.class){  // threadler tek tek girerler
                if(singleton == null)
                    singleton = new ThreadSafeLazySingleton();
            }
        }

        return  singleton;
    }

    public void printName(){
        System.out.println(name);
    }

}
