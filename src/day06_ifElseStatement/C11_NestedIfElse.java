package day06_ifElseStatement;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {
        //kullanıcıdan  aldıgı urun adedi ve liste fiyatını sorun
        //kullanıcıya musteri kartı olup olmadıgını sorun
        //musterı kartı varsa ve 10 urunden fazlaysa %20 indirimli 10 urunden azsa %15 indirimli
        //musteri karti yoksa 10 urunden fazlaysa %15 indirimli 10 urunden azsa %10 indirimli

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ürün adedi giriniz.");
        int urunAdedi = scan.nextInt();

        System.out.println("urunun liste fiyatını giriniz.");
        double listeFiyati = scan.nextDouble();

        System.out.println("musteri kartınız var mı? \n E:Evet H:Hayır");
        char kartVarmi = scan.next().charAt(0);

        //kart ana degisken olsun.

        if (kartVarmi == 'E' || kartVarmi == 'e') {
            if (urunAdedi <= 0) System.out.println("geceriz ürün miktari");
            else if (urunAdedi > 10)
                System.out.println("%20 toplam indirimli toplam fiyat:" + urunAdedi * listeFiyati * 0.80);
            else System.out.println("%15 toplm indirimli toplam fiyat" + urunAdedi * listeFiyati * 0.85);
        } else if (kartVarmi == 'h' || kartVarmi == 'H') {
            if (urunAdedi <= 0) System.out.println("gecersiz urun miktarı");
            else if (urunAdedi > 10) System.out.println("%15 toplam indirimli fiyat:" + urunAdedi * listeFiyati * 0.85);
            else System.out.println("%10 toplam indirimli fiyat:" + urunAdedi * listeFiyati * 0.90);


        } else System.out.println("kart bilgisi hatalı");


    }
}




