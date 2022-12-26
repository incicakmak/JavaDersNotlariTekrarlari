package day03_dataCasting_matematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        // % modulus : javada bölme islemi sonucunda kalanı verir.
        System.out.println(15%4);//3
        System.out.println(45%4); //1

        //kullanıcının girdigi deger çift sayı mı
        //girilen sayi %2 isleminin sonucu 0 ise cift sayidir

        //kullanıcının girdigi sayı 7 nin katı mı
        // girilen sayı %7 isleminin sonucu o ise 7 nin katıdır

        // kullanıcının girdigi sayının birler basamagı
        //kullanıcı 3426 girdi

        int girilenSayi=3426;
        int birlerBasamagi=3426%10; //6
        System.out.println("birler basamagı :" + birlerBasamagi);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); //342

birlerBasamagi=girilenSayi%10; //6
        System.out.println("birler basamagı:" +birlerBasamagi);



    }




}
