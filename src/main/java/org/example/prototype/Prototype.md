# Prototype Design Pattern

> [!IMPORTANT]  
> Buradaki notlar ve örnek kodlar Akın Kaldıroğlu'nun Design Pattern eğitiminden alınmıştır.
> Videoda anlatılanların ve slayta bulunan notların özeti çıkarılarak bir araya getirilmiştir.


* **Prototip bir nesneyi kullanarak yaratılacak nesneleri belirlemek ve yeni nesneleri, prototipi kopyalayarak oluşturulmasıdır.**

Bazen bir sınıftan oluşturulan nesnelerin, farklı birkaç durumdan birine sahip olması istenir.
Zaman zaman bu farklı durumlar birbirlerinden elde edilebilir. Yani nesnelerin alabileceği durumlar arasında büyük farklar yopktur. Bir kaç field/durum değişkeninin değerinin değişmesiyle farklı durumlar elde edilebilir.

Örneğin bir banka hesabını temsil eden **Account** nesnemiz olsun;

* Normal kullanıma ve işlemlere sahip olan bir hesabımız olabilir.
* Eksi bakiyeye düşmüş bir negatif hesabımız olabilir. Bu durumda örneğin para transfer işlemi kapalı olabilir.
* Eksi limite ulaşarak dondurulmuş bir hesabımız olabilir. Sadece para yatırma işlemi açık olabilir.
* Kapalı bir hesap olabilir. Tüm işlemler kapalıdır.

Yukarıda sıralandığı gibi **Account** nesnesi, sahip olduğu mantıksal değişkenlerin (Örn: bakiye <0 ise ) farklı kombinasyonlarıyla farklı duruma gelmektedir.
Account nesnesinin sahip olduğu constructor mantıksal tipteki durum bilgisini de içermektedir. (Örn: hesap transfere açık mı, bakiye değeri, para yatırma açık mı vb). Bundan dolayı da Account nesnesinin kurucularını ayırt etmek ve çağırmak karmaşıktır, hataya açıktır ve zordur.

> [!WARNING]   
> Aşağıdaki gibi tek constructor kullanımı çok hoş bir kullanım değildir, karmaşıklığa ve hataya neden olur.
>  ```
>  Account normalAccount = new Account("1",1000,1000, new Customer("Ali"), true, true, true);
>
>  Account negativeAccount = new Account("2",-500,1000, new Customer("Büşra"), true, true, false);
>
> Account frozenAccount = new Account("3",-1000,1000, new Customer("Buse"), false, false, false);
 >  ```


> [!TIP]  
> 
> Bu durumu nasıl iğleştirebilir?
> 
> 
> Bunun için **Prototype Design Pattern** kullanılabilir. Bazen bu türden karmaşık nesneleri sıfırdan yaratmak yerine, hali hazırda elde var olan nesnelerden kopyalayarak (clone) elde etmek yoluna gidilebilir. Durumu kopyalanarak çoğaltılan nesne prototip ya da örnek nesnedir.
>


Account nesnesini de yaratmak için sürekli constructor çağrısı yapmak yerine var olan bir Account nesnesini prototip ya da örnek olarak elde tutulup, diğer Account nesnelerinin bu prototipten kopyalanarak üretilmesi sağlanabilir.
Oluşturulan nesnelerin farklı olacak durumları set metotları ile değiştirilir. Bu sayede bütün bilgiyi sıfırdan geçmeden değişmesi gereken kısımları değiştirilir.

> [!NOTE]  
> 
> Javada bir nesnenin klonlanması için sınıfın **Cloneable** interface'i implement etmesi ve **clon** metodunu override etmesi gerekmektedir.
>

> [!WARNING]  
> Prototype kalıbı nesnelerin nasıl üretileceğini çözer. Nesnelerin nerede oluşturulacağı ile ilgilenmez dolayısıyla nesne yaratmayı soyutlamaz. Bunun için Factory metotlardan ya da Joshua Block'ın önerdiği static factory metotlardan yararlanılabilir.
