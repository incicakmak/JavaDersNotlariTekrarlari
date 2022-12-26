package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {


        //verilen iki sayiyi carpip sonucu yazdiran bir method olusturun.

        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir.
        //method call icerisinde yazilan variable veya degerlere argument denir

        carpYazdir(5, 8);
        carpYazdir(7.4, 8.6);

        //carpYazdir("ali,","veli");argument ve parametreler uyumlu degilse CTE olur.
    }
    public static void carpYazdir(double sayi1,double sayi2){

        //carpYazdir(4,5); yazılamazzzz

        System.out.println(sayi1 * sayi2);



    }


}
