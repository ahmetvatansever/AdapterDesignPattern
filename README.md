# Adapter Design Pattern #


Uyumlu olmayan iki arayüzün birlikte çalışabilmesini sağlayan tasarım desenidir. <br>
Daha önceden yazılmış hatta çok fazla yerde kullanılmış olan interfacelerin kullanıldığı yerlerde değişiklik yapmak gerekmez. <br>
Adaptör tasarım deseni, kodunuzla doğrudan uyumlu olmayan mevcut bir sınıf veya üçüncü parti kütüphane arasında bir nevi tercüman olarak hizmet eden bir ara katman oluşturmanızı sağlar.

Adaptör mevcut nesnelerden biriyle uyumlu bir arayüzü (interface) alır. <br>
Mevcut nesne bu arayüzü kullanarak adaptörün metodlarını güvenli bir şekilde çağırabilir. <br>
Bir istek geldiğinde adaptör isteği ikinci bir nesneye onun beklediği bir formatta aktarır. <br>


![adapter](https://github.com/ahmetvatansever/AdapterDesignPattern/assets/24367205/01673a1b-ad07-4be8-8165-fc699cc1ff3b)
