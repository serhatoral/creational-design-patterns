# Builder Design Pattern

Üzerinde çok fazla instance variable bulunduran nesneleri oluşturmak karmaşıktır.
Böyle karmaşık nesneleri yaratmak basit bir kurucu(constructor) çağrısından ziyade bir süreç içinde olur.
Bu türden nesneleri oluşturmak için gerekli süreç **Builder** kalıbı olarak modellenebilir.

* Bu kalıpta, yaratmak(create) yerine inşa söz konusudur. Bu sebeble **builder** kelimesi ile süreçsellik vurgusu yapılmıştır.
* Bir nesnenin karmaşık olduğunun en temel göstergesi, çok parametre alan kurucularıdır.
**Telescoping constructor anti-pattern** (uzun kurucu anti-patternı)
* Kurucuya geçilen parametrelerinde oluşturulması gerektiği düşünüldüğünde, bu sürecin soyutlanması gerektiği açıktır.
* Builder kalıbı inşa etme sürecini ifade ettiğinden, nesne inşa eden metotların isimlerinde **build** kelimesiyle sıklıkla karşılaşılır.

En basit haliyle builder, nesnenin varsayılan kurucusunu çağırıp sonrasında set methodlarıyla nesneyi bina eder ve oluşan nesneyi istemciye geri döndürür.
Bu oldukça temel bir kullanımdır. Builder yapısının daha gelişmiş örnekleri computer1,
computer2 ve computer3'te yapılmıştır.