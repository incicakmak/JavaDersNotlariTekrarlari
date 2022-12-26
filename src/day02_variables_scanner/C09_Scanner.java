package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {

    public static void main(String[] args) {

        // kullanıcıdan iki sayı alıp ikisinin degerlerini degistirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi1 i giriniz.");
int sayi1= scan.nextInt();
        System.out.println("Lütfen sayi2 i giriniz.");
int sayi2= scan.nextInt();
int temp;
// sayi2 yi temp e ata
temp=sayi2;
//2.adım sayi1 degerinin sayi2 ye ata
sayi2=sayi1;
        //temp deki degeri sayi 1 e ata
        sayi1=temp;
        System.out.println("sayıların degerini yer degiştirdim." +
                "\nsayi1 in yeni degeri: " + sayi1 +
                 "\nsayi2 nin yeni degeri:" + sayi2    );


    }










}
