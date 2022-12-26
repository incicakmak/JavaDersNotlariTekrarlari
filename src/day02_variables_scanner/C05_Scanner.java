package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini alın
        // ve girilen ismi buyuk harfle yazdırın
        // kullanıcıdan deger almak 3 islem yapmamız gerekir.
        //1.adımda scanner objesı olusturmak.

        Scanner scan = new Scanner(System.in);

        //2.adım kullanıcıya ne istediginizi söyleyin.
        System.out.println("isminizi yazin");

        //3.adım kullanıcının girecegi degeri kaydedebileceginiz bir variable olusturun.
        // scan objesi ile ilgili metthodu kullanarak kullanıcının girdigi
        // degeri olusturdugunuz variable a atayın
        String girilenIsim=scan.nextLine();

        // artık kullanıcının girdigi deger girilen isim variable ında kayıtlı
        System.out.println(girilenIsim.toUpperCase());





    }


}
