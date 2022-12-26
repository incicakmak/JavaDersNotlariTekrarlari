package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin ve sayının karesini yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen sayının karesi : " + girilenSayi*girilenSayi);




    }


}

