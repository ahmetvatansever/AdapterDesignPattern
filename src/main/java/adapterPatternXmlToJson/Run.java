package adapterPatternXmlToJson;

public class Run {

    /*
      Uyumlu olmayan iki arayüzün birlikte çalışabilmesini sağlayan tasarım desenidir.
      Daha önceden yazılmış hatta çok fazla yerde kullanılmış olan interfacelerin kullanıldığı yerlerde değişiklik yapmak gerekmez.
      Adaptör tasarım deseni, kodunuzla doğrudan uyumlu olmayan mevcut bir sınıf veya üçüncü parti kütüphane arasında
      bir nevi tercüman olarak hizmet eden bir ara katman oluşturmanızı sağlar.
        Adaptör mevcut nesnelerden biriyle uyumlu bir arayüzü (interface) alır.
        Mevcut nesne bu arayüzü kullanarak adaptörün metodlarını güvenli bir şekilde çağırabilir.
        Bir istek geldiğinde adaptör isteği ikinci bir nesneye onun beklediği bir formatta aktarır.
    */

    public static void main(String[] args) {
        try {
            XMLDataService xmlDataService = new XMLDataService();
            JsonAdapter jsonAdapter = new JsonAdapter(xmlDataService);
            String jsondata = jsonAdapter.getJsonData();
            System.out.println("Json Data:" + jsondata);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
