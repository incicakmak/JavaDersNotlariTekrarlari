package day14_doWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //kullanicidan istedigi kadar sayi alin ve toplayin.
        // kullanici deger olarak 0'a basarsa islemi bitirin.


        int girilensayi=1;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("lutfen toplamak icin tamsayi giriniz." );
        girilensayi=scan.nextInt();
        toplam+=girilensayi;

        }while (girilensayi!=0);
        System.out.println("girilen sayilarin toplami : " + toplam);

/*while loop'da  ilk sart saglanmazsa loop body hic CALIZMAZ.
Do- While Loop'da once body calistigi icin sart yanlis olsa bile
loop body'si en az bir kere calismis olur.
 */


    }



}
