package day05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        /* kullanıcıdan bir harf alın,harf ile baslayan bir ay varsa
        Not: buyuk harf,kucuk harf hassasiyeti olmasın
        kullanici o veya O yazdiginda output Ocak olsun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yazdırmak istrdiginiz ayin ilk harfinin giriniz.");
        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O') System.out.println("Ocak");
        if (ilkHarf=='s' || ilkHarf=='S') System.out.println("Subat");
        if (ilkHarf=='m' || ilkHarf=='M') System.out.println("Mart veya Mayis");
        if (ilkHarf=='n' || ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='h' || ilkHarf=='H') System.out.println("Haziran");
        if (ilkHarf=='t' || ilkHarf=='T') System.out.println("Temmuz");
        if (ilkHarf=='a' || ilkHarf=='A') System.out.println("Agustos veya Aralık");
        if (ilkHarf=='e' || ilkHarf=='E') System.out.println("Eylul veya Ekım");
        if (ilkHarf=='k' || ilkHarf=='K') System.out.println("Kasım");








    }




}
