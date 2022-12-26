package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen sayidan baslayarak
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // tüm sayilari
        // kac adet sayi oldugunu
        // ve bu sayilarin toplaminin kac oldugunu yzdiri.

        int inputBas=34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;

        for ( int i=inputBas; i <= inputBit; i+=7) {
            System.out.print(i + " ");
            sayac++;
            toplam += i;
        }

        System.out.println("");
        System.out.println("toplam"+ sayac+" adet sayi var \nBu sayilarin toplami : "+ toplam);

    }





}
