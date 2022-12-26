package day12_methodCreation;

public class C04_MethodOlusturmaFaktoriyel {
    public static void main(String[] args) {

        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin.
        // kucukse bir method olusuturup, faktoriyel degerini yazdirin.
// sayi istenen aralikta degilse,uyari yazdirin.
        int input = 23;

        if (input > 0 && input < 15) {

            faktoriyelYazdir(input);
        }else {
            System.out.println("girilensayi 15 den kucuk pozitif tamsayi olmalidir.");
        }
        }
        public static void faktoriyelYazdir ( int sayi){

            int faktoriyelSonucu = 1;

            for (int i = sayi; i >= 1; i--) {
                faktoriyelSonucu *= i; // her loop'da gelen sayiyi onceki deger ile carpalim

            }
            System.out.println("girilen " + sayi + "icin faktoriyel: " + faktoriyelSonucu);


        }


    }