package day03_dataCasting_matematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /* char data türünün ekstra bir özelliği vardır.
        eger matematiksel bir islemde chr data türünden bir deger kullanırsanız
        java o char ın ascii degerini göz önünde bulundurarak
        matematiksel islemi gerceklestirir.

        */

        System.out.println('a'+'b');//97+98=195

        System.out.println('a'-32);//97-32

     //'a'-32 nin char olarak sonucunu yazdirin.
        System.out.println((char) ('a'-32)); //65 yani A yazdırırr.

        //kullanıcıdan bir char alıp
        //ascii tabledan kullanıcının girdigi char ın sonraki
        //3 karakteri yazdırın.
        //örnek input : a output :b,c,d
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir char giriniz.");
        char girilenKarakter=scan.next().charAt(0);

        System.out.println((char) (girilenKarakter+1) +"," +
                           (char)(girilenKarakter+2)+"," +
                            (char)(girilenKarakter+3));








    }






}
