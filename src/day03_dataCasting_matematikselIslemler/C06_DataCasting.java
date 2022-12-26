package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        //soru5- kullanıcıdan bir double ,bir tamsayı alın
        //double sayıyı ikinci sayıya bölün
        // ve bolum isleminin tamsayı kısmına yazdırın
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir double sayi giriniz.");
        double sayiDbl = scan.nextDouble();

        System.out.println("lütfen bir tamsayı giriniz");
    int sayiInt=scan.nextInt();
        System.out.println((int) (sayiDbl/sayiInt));// sonucu double olarak yazdırır.



    }






}
