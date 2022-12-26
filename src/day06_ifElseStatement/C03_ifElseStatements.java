package day06_ifElseStatement;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin,
        //girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın
        //yoksa girilen harfi yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz." );
char girilenHarf= scan.next().charAt(0);

if (girilenHarf >='a' && girilenHarf<='z') {
//kucuk harf ise buyuk harf olarak yazdıralım
    System.out.println((char) (girilenHarf-32));
  // bu şekildede yazılabilir.  System.out.println(Character.toUpperCase(girilenHarf));
}else {
    //kucuk harf degılse gırılen harfi yazdıralım
    System.out.println(girilenHarf);
}




    }




}
