package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanıcıdan 4 basamaklı pozitif bir tamsayi alın
        // sayinin rakamları toplamını bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz.");

        int girilenSayi=scan.nextInt(); //2457
        // soru icin lazım olacak variableları hazırlayalım.
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //sirasiyle her bir basamagi elde
        //edip rakamlar toplamına ekleyelim.

        birlerBasamagi=girilenSayi%10; //7
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //0+7=7
        girilenSayi=girilenSayi/10; //245

        birlerBasamagi=girilenSayi%10; //5
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //7+5=12

        girilenSayi=girilenSayi/10; //24
        birlerBasamagi=girilenSayi%10; //4
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //12+4=16

        girilenSayi=girilenSayi/10; //2
        birlerBasamagi=girilenSayi%10; //2
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //16+2=18

        girilenSayi=girilenSayi/10; //0
        System.out.println("girdiginiz 4 basamaklı sayının rakamları toplamı:" + rakamlarToplami);




    }




}
