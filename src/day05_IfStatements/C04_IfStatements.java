package day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın
        //sayi 3 ile bolunebiliyorsa "uc ile bolunen sayi"
        // 5 ile bolunebiliyorsa "bes ile bolunebilen sayi" yazdırın.

/* if cumlelerinde sart parantezinden sonra body kullanmazsak
ilk;e kadar olan kismi body olarak kabul eder.
yani sadece 1 satir kodu body olarakkabul eder.

eger if body si icin yazılacak kod bir satırdan fazla ise mutlaka {} kullanılmalıdır.
 */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz.");
        int sayi=scan.nextInt();
        if (sayi%3==0) System.out.println("3 ile bolunen sayi");


        if (sayi%5==0) System.out.println("5 ile bolunen sayı");





    }




}
