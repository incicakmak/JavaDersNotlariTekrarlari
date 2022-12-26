package day13_methodOverloading_whileLoop;

import day12_methodCreation.C03_MethodOlusturmaAsalSyi;
import day12_methodCreation.C07_MethodOlusturmaTerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin.

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(9);


        // asagida verilen cumlenin tersini yazdirin..

        String str=" bir kere yaparim, yan gelir yatarim.";
        System.out.println(C07_MethodOlusturmaTerseCevirme.metniTerseCevir(str));

        //verilen cumleyi tersine cevirin.

        String tersStr=C07_MethodOlusturmaTerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);// ekrana yazdirir.

        //asagida verilen cumlenin palindrom olup olmadiginin yazdirin.

        str="Java Candir.";

        tersStr=C07_MethodOlusturmaTerseCevirme.metniTerseCevir(str);//ridnaC avaj

        if (str.equals(tersStr)){
            System.out.println("palindrom");
        }else{
            System.out.println("palindrom degil.");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin.

        int sayi=23;

        C03_MethodOlusturmaAsalSyi.asalSayiMi(sayi);//true

        // kullanici true/ false dan birsey anlamaz, acik sekilde yazalim dersek.

        boolean sonuc=C03_MethodOlusturmaAsalSyi.asalSayiMi(sayi);//true

        if (sonuc){
            System.out.println("girilen" + sayi+ "asal.");
        }else{
            System.out.println("girilen"+sayi+ " asal sayi degil.");
        }










    }











}
