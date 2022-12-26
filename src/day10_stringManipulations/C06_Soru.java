package day10_stringManipulations;

public class C06_Soru {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
         - ilk harf kucuk harf olmali
         - son karakter rakam olmali
         - sifre bosluk icermemeli
         - uzunlugu en az 10 karakter olmali

        */

        String sifre="abc1453";

        /* bu soruda sartlari bagimsiz if cumlesi ile yapmak
        veya if-else ile yapmak mumkundur.

        -eger if else ile yaparsak ilk hatada hatayi yazdirir.
        geriye kalanlara nakmaz.
        avantaji ise eger hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir.

        -bagimsiz if cumlelerinde tum hatalari bir kerede söyleyebilirz.
        ancak bagimsiz if cumlelerinkodun geriye kalani ile ilgilendrmediginden
        basarili sifre olusturuldugunu bizim icin ayri bir mekanizma ile kontrol etmemiz gerekir.
         */

        /* sonucta basarili sifre olusturuldu demek icin  bir kontrol mekanizmasi olusturmamiz gerekir.
        Ya her adimda artiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz.
        veya basta verdigimiz deger olumsuz bir durum oldugunda artirilir.
        en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur diyeiliriz.

         */
         int flag=0;

        //- ilk harf kucuk harf olmali
         if (!(sifre.charAt(0)>'a' && sifre.charAt(0)< 'z')) {
             // ilk harf kucuk degilse hatayi yazdir.
             // sifre.CharAt(0)<'a'   || sifre.CharAt(0)>'z'
             System.out.println("ilk harf kucuk harf olmali");
             flag++;    //bir ceza puanialdi
         }



        //- son karakter rakam olmali
          //      - sifre bosluk icermemeli
       // - uzunlugu en az 10 karakter olmali






    }



}
