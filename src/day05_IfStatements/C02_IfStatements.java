package day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*basit if cumleleri kodun geri kalanından bagımsızdır
        sadece 1 sarta odaklanır.
         o sart true ise ıf body calısır
         sart false ise if body calısmaz(kod calısır)

        birden fazla  bagımszı ıf cumlesi kullanılmıssa
        her cumle birbirinden bagımsız olacagından
        bazı degerler icin tum ıf bodyleri calısırken
        bazı degerler ıcın hıc bır ıf bodysı calısmayabilir.
        */




        //kullanıcıdan bir sayi alıp pozitif ise pozitif sayi,
        //100 ile 999 arasinda ise(sinirlar dahil.)
        // "pozitif 3 basamakli sayi"
        //3 ile bolunebiliyorsa "3'un katı"
        //birler basamagi 7 ise "Mukemmel"
        //seceneklerinden uygun olanını yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir  tamsayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("Sayi pozitif");
        }

        if (100 <= sayi && sayi <= 999){
            System.out.println("Pozitif 3 basamakli sayi");}

        if (sayi%3==0) {
            System.out.println("3'un katı");
        }


        if (sayi % 10 == 7 || sayi%10==-7) {
            System.out.println("Mukemmel");
        }



    }











}
