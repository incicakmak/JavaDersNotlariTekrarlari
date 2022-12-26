package day14_doWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan istedigi kadar sayi alin ve toplayin.
        // kullanici deger olarak 0'a basarsa islemi bitirin.


        int girilensayi=1;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        while (girilensayi!=0){

            System.out.println("lutfen toplamak icin bir tamsayi giriniz.");
            girilensayi= scan.nextInt();

            toplam+=girilensayi;

        }
        System.out.println("girilen sayilarin toplami: "+toplam);
/*
while loop'un 2 tane negatif yonu vardır.
1- loop'dan once olusturdugumuz ve loop' kullanacagimiz variable'lara
 yanlıs bir dedeger verirsek,loop body'si hic calismayabilir.
 loop condition
 2iloop bodysi hic calismayabilir.
bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir.
ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz.
ancak
 */





    }




}
