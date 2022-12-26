package day06_ifElseStatement;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        //soru2- kullanıcının kilo (kg9 ve boy (cm) isteyip
        // vucut kıtle endeksi hesaplayın (kilo*10000/(boy*boy)
        //vke 30 veya daha buyıkse..

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz." );
        double kilo = scan.nextDouble();

        System.out.println("lütfen boyunuzu cm olarak boyunuzu giriniz.");
        double boy = scan.nextDouble();

        double vke = kilo * 10000 / (boy * boy);


        System.out.println("vucut kitle endeksiniz:" + vke);

        if (vke >= 30) System.out.println("obrzsiniz,gec kalmadan zayıflayınız.");
        else if (vke >= 25) System.out.println("kilolusunuz,rejime baslayınız.");
        else if (vke >= 20) System.out.println("kilonuz normal,boyle devam edin");
        else System.out.println("zayıfsınız,kılo almalısınız.");


    }

}




