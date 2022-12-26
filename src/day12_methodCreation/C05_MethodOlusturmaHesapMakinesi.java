package day12_methodCreation;

import java.util.Scanner;

public class C05_MethodOlusturmaHesapMakinesi {
    public static void main(String[] args) {

        //kullanicidan 2 sayi alın ve istedigi islemi alin(+,-,*,/)
        // bir method olusturup sayilara istenen islemi uygulayip
        //sonucu bize dondurun
        //kullanici islemi yanlis secmisse 0 dondursun.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz.");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("lutfen bir islem seciniz + ,-, / ,*");
        char islem = scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayi1, sayi2, islem));
/*
        double sonuc=hesapMakinesi(5,6.5,'*');//sonuc diye kaydedip sonra yazdirabiliriz.
        System.out.println(sonuc);
*/
    }

    public static double hesapMakinesi(double sayi1, double sayi2, char islem) {

        switch (islem) {

            case '+':
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            case '/':
                return sayi1 / sayi2;
            case '*':
                return sayi1 * sayi2;
            default:
                return 0;


        }
    }
}




























