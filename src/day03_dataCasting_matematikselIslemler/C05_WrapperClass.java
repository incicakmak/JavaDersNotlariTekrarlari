package day03_dataCasting_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="java candır";

        //int primitive oldugundan hazır methotları yoktur.
        // string ise non primitive oldugu icin hazır metodlara sahiptir.
        // int,char, boolean gibi primitive variable turlerinde hazır metod kullanmak icin
        // java ınteger, character, boolean gibi wrapper classlar olusturulmustur.

        // bunlar primitive lerile aynı degerleri alabilirler
        // ama ekstradan methodlarıda vardır.
        /* islemlerinizi yaparken bazen string olarak tanımlanmıs
        ancak matematiksel icerik barındıran variable lar ile karsılasabiliriz.
        bu durumda bu tur string  variable ları sayıya cevirmek icin ihtiyacımız olabilir

       eger sayıya cevirmek istedigimiz metinlerde harf veya baska karakter varsa java hata verir.
         */

        Integer sayi2=20;

        String str2="123";
       String str3="354";

        System.out.println(str2+str3); //123354 seklinde yazar

int str2Int=Integer.parseInt(str2); //123
int str3Int=Integer.parseInt(str3);//354
        System.out.println(str2Int+str3Int); //477

        System.out.println(Integer.MAX_VALUE);// 2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Short.MAX_VALUE);//32767
char krk1='$';
        System.out.println(Character.isDigit(krk1)); //false
        System.out.println(Character.isLetter(krk1)); //false
        System.out.println(Character.isAlphabetic(krk1));// false


        short sayi3=4;
int sayi5=sayi3;

// wrapper classlarda casting olmaz.
        short sayi6=45;
//Integer sayi7=(Integer)sayi6;  bu sekilde casting yapamayız.cevirme olmuyor.


    }




}
