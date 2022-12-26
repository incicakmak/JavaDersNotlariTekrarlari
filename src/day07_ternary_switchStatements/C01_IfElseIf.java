package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        //kullanıcıdan bir tamsayi alin
        //sayi rakam ise "girilen sayi rakam"
        //sayi iki basamakli ise "girilen sayi iki basamakli
        //sayi 2 basamaktan büyükse "buyuk sayı" yazdirin


        /* eger if else cumleleri else ile bitmiyorsa
        tum durumları kapsamaz
        bu tur soruları cozerken
        sartlarin tamamini dikkatli yazmak gerekir.
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayı giriniz." );
        int girilensayi=scan.nextInt();

        if (0<=girilensayi && girilensayi<=9 ) System.out.println("girilen sayi rakam");
        else if (girilensayi>=10 && girilensayi<=99) System.out.println("girilen sayi iki basamaklı");
            else if (girilensayi>=100)System.out.println("buyuk sayi");



    }




}
