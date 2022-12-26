package day05_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir ucgenin bir kenar uzunlugunu alın,
        //ucgen eskenar ucgen ise "eskenar ucgen" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ucgenin uc kenar uzunlugunu giriniz.");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {
            System.out.println("eskenar ucgen");
        } else {
            System.out.println("eskenar ucgen degildir");
        }
    }






}
