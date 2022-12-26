package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);//5.6 dır fakat java bize 5 yazdırır.
        System.out.println(29/3);//9
        //java bir bölme isleminde 2 int isleme giriyorsa sonucu int olarak verir.

        int sayi1=25;
        int sayi2=6;
        System.out.println(sayi1/sayi2);//4
        //eger ondalıklı istiyorsak en az bir tanesi double olmalı


        double dbl=6;
        System.out.println(sayi1/dbl);//6.25


        //kullanıcıdan 2 tamsayı alın
        //1.tamsayıyı 2.ye bölün sonucu ondalıklı olarak yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birbirine bölmek icin iki tamsayı giriniz.");
        int ilkSayi= scan.nextInt();
        int ikinciSayi=scan.nextInt();
        System.out.println("iki sayının bölme sonucu:"+(double) ilkSayi/ikinciSayi);

    }






}
