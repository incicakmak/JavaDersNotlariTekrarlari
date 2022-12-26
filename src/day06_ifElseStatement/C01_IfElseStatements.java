package day06_ifElseStatement;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //soru1- kullanıcıdn bir ucgenin 3 kenar uzunlugunu alın
        //eskenar ucgen ise "eskenar ucgen "yazdırın degilse "eskenar degil" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil.");
        }
 // If ile baslayan bir kod else ile bitiyorsa
        //input'un tum degerlerini kapsar
        //yani her deger icin mutlaka kodumuzda bir body calısır.








    }




}
