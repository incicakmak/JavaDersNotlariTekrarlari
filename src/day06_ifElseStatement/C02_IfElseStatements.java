package day06_ifElseStatement;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        //kullanıcıdan bir ucgenin uc kenar uzunlugunu alın,
        //ucgen ikiz kenar ise "ikiz kenar " yazdırın degilse "ikizkenar degil "yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ücgenin kenar uzunluklarını giriniz.");
        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3) ||
            (kenar3==kenar2 && kenar2!=kenar1) ||
                (kenar1==kenar3  && kenar2!=kenar3)) {
            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("ikizkenar degıl");
        }
        }
        }







