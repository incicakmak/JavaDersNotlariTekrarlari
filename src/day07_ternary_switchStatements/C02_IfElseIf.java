package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        //kullanıcıdan bir tamsayi alin
        // sayi negatif sayi ise "negatifsayi"
        //sayi rakam ise "girilen sayi rakam"
        //sayi iki basamakli ise "girilen sayi iki basamakli
        //sayi 2 basamaktan büyükse "buyuk sayı" yazdirin



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayı giriniz." );
        int girilensayi=scan.nextInt();
if (girilensayi<0) System.out.println("negatif sayi");
         else if (0<=girilensayi && girilensayi<=9 ) System.out.println("girilen sayi rakam");
        else if (girilensayi>=10 && girilensayi<=99) System.out.println("girilen sayi iki basamaklı");
        else System.out.println("buyuk sayi");


    }





}
