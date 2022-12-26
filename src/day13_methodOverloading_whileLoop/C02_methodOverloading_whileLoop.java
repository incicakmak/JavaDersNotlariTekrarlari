package day13_methodOverloading_whileLoop;

public class C02_methodOverloading_whileLoop {
    public static void main(String[] args) {

        String str = "java cok guzel";

        str.substring(5);//cok guzel
        str.substring(3, 5);//a

        // eger sectigimiz isimde birden fazla method varsa buna overloading denir.
        //ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre uyumu karar verir.

        toplama(5, 6);//11
        toplama(5, 3, 1);//9



        /* java ayni class icerisinde ayni isim ve ayni data turunden parametre sayisi ile
        2 method olusturmasina izin vermez.

        1- ismini degistirebilirz, ancak bu drumda overloading olmaz.
        overloading yni isimde ama farkli isleme sahip methodlar olusturmak demektir.

       2- parametre sayisini degistirebiliriz.

       3-ayni sayisa parametre yazip, parametrelerin data turunu degistirebilirz.
       veya farkli data turundeki parametrelerin yerini degistirebiliriz.

         */

        toplama(6,6);// 2 int toplami 12
        toplama(4.5,5);// double ve int toplami  9.5;
        toplama(4.5,6.7);// 2 double sayinin toplami 11.2

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("2 tamsayinin toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 tamsayinin toplami : " + (sayi1 + sayi2 + sayi3));
    }

    public static void toplama(double sayi1, int sayi2) {
        System.out.println("double ve int toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(int sayi2, double sayi1) {
        System.out.println("int ve double toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(double sayi1, double sayi2) {
        System.out.println("2 double toplami : " + (sayi1 + sayi2));
    }




}