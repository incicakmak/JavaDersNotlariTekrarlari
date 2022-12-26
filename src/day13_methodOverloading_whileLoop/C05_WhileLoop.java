package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamk uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // "bu kadar sayi yeter" diyip toplami yazdirin.

        // bu soruyu illada for llop ile yapalim dersek adim sayisini tahmin edip biraz abartabiliriz.

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;


        for (int i = 1; i < 1000 ; i++) {
            System.out.println("toplamak uzere tam sayi giriniz.");
            sayi=scan.nextInt();
            toplam+=sayi;

            if (toplam>= 500){
                System.out.println("bu kadar sayi yeter, Toplamlari :"+ toplam+ " oldu.");
            }

        }

// ayni soruyu while loop ile yapalim.

        toplam=0;
        sayi=0;

        while (toplam<500){

            System.out.println("toplamak uzere tam sayi giriniz.");
            sayi=scan.nextInt();
            toplam+=sayi;
    }
        System.out.println("bu kadar sayi yeter, Toplamlari :"+ toplam+ " oldu.");


}}
