package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir doble ve bir int alıp bunların toplamını ve carpımını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayi giriniz.");
        double sayiDbl= scan.nextDouble();
        System.out.println("lütfen bir tamsayı girin.");
        int sayiInt= scan.nextInt();
        System.out.println("sayıların toplamı :" + (sayiDbl+sayiInt));
        System.out.println("sayiların carpımı:" + sayiInt*sayiDbl);




    }






}
