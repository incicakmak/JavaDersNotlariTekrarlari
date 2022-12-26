package day06_ifElseStatement;

import java.util.Scanner;

public class C12_NesrtedIfElse {
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

//urun miktarı ana degisken olsun.
        if (urunAdedi>=10){
           if (kartVarmi=='e' || kartVarmi=='E') System.out.println("%20 indirimlitoplam fiyat:"+ urunAdedi*listeFiyati*0.80);
           else if (kartVarmi=='h'|| kartVarmi=='H') System.out.println("%15 indirimli toplam fiyat:" +urunAdedi*listeFiyati*0.85);
               else System.out.println("hatalı kart bilgisi");


           } else if (urunAdedi<10 && urunAdedi>0) {
            if (kartVarmi=='e' || kartVarmi=='E') System.out.println("%20 indirimlitoplam fiyat:"+ urunAdedi*listeFiyati*0.85);
            else if (kartVarmi=='h'|| kartVarmi=='H') System.out.println("%15 indirimli toplam fiyat:" +urunAdedi*listeFiyati*0.90);
            else System.out.println("hatalı kart bilgisi");


        }else System.out.println("hatalı ürün miktarı girisi");



    }





}
