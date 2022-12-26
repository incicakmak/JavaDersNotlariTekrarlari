package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen baslangic ve bitis degeri olarak pozitif sayilar giriniz.");
int baslangicSayisi= scan.nextInt();
int bitisSayisi=scan.nextInt();
int toplam=0;
if (bitisSayisi<baslangicSayisi) {
    System.out.println("baslangic degeri bitis degerinden kucuk olmali");
}else {

    for (int i=baslangicSayisi; i<bitisSayisi; i++){
        toplam +=i;  // tum sayilari sirasiyle toplama ekledik.
        System.out.println(baslangicSayisi+"ile " +bitisSayisi+ "arasindaki sayilarin toplami: "+ toplam);
    }
}


    }






}
