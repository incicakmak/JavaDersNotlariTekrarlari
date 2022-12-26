package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        // diktörtgenin iki kenar uzunlugunu isteyip alanını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki kenar uzunlugunu giriniz.");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdörtgenin alanı : " + kenar2*kenar1);


    }



}
