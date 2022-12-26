package day06_ifElseStatement;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {

        //    Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //    Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir//
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nK:Kadin , E: Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen tam sayi olarak yasınızı giriniz.");
        int yas = scan.nextInt();
        if ((cinsiyet == 'k' || cinsiyet == 'K') && yas >= 60 && yas<80) {
            System.out.println("Emekli olabilir.");
        } else if ((cinsiyet == 'k' || cinsiyet == 'K') && yas >= 18) {
            System.out.println("Emekli olmak için:" + (60 - yas) + " yıl daha calismalisin");
        } else if ((cinsiyet == 'e' || cinsiyet == 'E') && yas >= 65 && yas<80) {
            System.out.println("Emekli olabilir.");
        } else if ((cinsiyet == 'e' || cinsiyet == 'E') && yas >= 18) {
            System.out.println("Emekli olmak icin :" + (65 - yas) + " yil daha çalısmalısın.");
        } else {
            System.out.println("Gecersiz bilgi");
        }
    }
}












