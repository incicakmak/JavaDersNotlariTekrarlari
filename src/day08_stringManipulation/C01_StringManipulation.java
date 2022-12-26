package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {


/*        Soru 4- Kullanicidan gunu ismini girmesini isteyin,
 girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
  seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
  girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gun ismini giriniz.");
        String girilenGun=scan.next();
        String kullanilacakGun=girilenGun.toLowerCase(); //kullaıcı ne girerse girsin herpsi kucuk harfe cevriliyor.


        /* string ifadeler case sensitive'dir
        kullanicinin Pazar,PAzar,...gibi 32 farklı sekilde yazma ihtimali var

kullanicinin girdigi degeri direk kalıcı olarak degıstırmek tercih edilmez
bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable'a atama yapar
ve kodlarımızda variableyi kullaniriz.

konsolda yazdiracagimiz zaman,istersek kullanicinin girdigi orjinal metni yazdiririz.
istersekte bizim cevirdigimiz hali yazabiliriz.

         */

        switch (kullanilacakGun) {
            case "pazartesi":
                System.out.println(girilenGun + ": calisma zamanı,tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + ": calisma zamanı,tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + ": calisma zamanı,tatile 3 gun var");
                break;

            case "persembe":
                System.out.println(girilenGun + ": calisma zamanı,tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + ": calisma zamanı,tatile 1 gun var");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println(girilenGun + ": simdi dinlenme zamani");
                break;
            default:
                System.out.println("yanlis gun secimi");
        }














    }






}
