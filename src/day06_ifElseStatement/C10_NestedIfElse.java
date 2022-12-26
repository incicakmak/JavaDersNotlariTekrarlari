package day06_ifElseStatement;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {

        //    Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //    Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir//
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        // degisken sayımız bırden fazla ise
        //degiskenlerden birini öncelige alarak
        //ona göre bir ıf else yapısı kurulur.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nK:Kadin , E: Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen tam sayi olarak yasınızı giriniz.");
        int yas = scan.nextInt();


        if (cinsiyet == 'k' || cinsiyet == 'K') { //kadın olanlar icin bolum
            if (yas < 18 || yas >= 60) System.out.println("gecersiz yas");
            else if (yas > 60) System.out.println("emekli olabilirsin.");
            else System.out.println("emekli olmak icin" + (60 - yas) + "yil daha calismalisin.");

        } else if (cinsiyet == 'e' || cinsiyet == 'E') { //ERKEK olanlar icin bolum
            if (yas < 18 || yas >= 65) System.out.println("gecersiz yas");
            else if (yas > 65) System.out.println("emekli olabilirsin.");
            else System.out.println("emekli olmak icin" + (65 - yas) + "yil daha calismalisin.");
        } else System.out.println("hatalı cinsiyet bilgisi");


         }


        }




