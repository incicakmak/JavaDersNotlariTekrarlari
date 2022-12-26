package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {

    public static void main(String[] args) {
        /*
        kullanicidan 1 ile 100 arasinda bir sayi olusturun.
        kullanicidan bu sayiyi bilmesini isteyin.
        kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyeli
        kullanici tuttugumuz sayiyi bildiginde

        -3 veya daha az tahminde bildiyse "wowww"
        -4-8 tahminde bildiyse "Aferin"
        -daha fazla tahminde bildiyse "basarisiz"
        yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz.");
        int sayi= scan.nextInt();

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(100);
        int flag=0;

while (tutulanSayi!=sayi){

    if (tutulanSayi>sayi) {

        System.out.println("lutfen sayinizi buyultun.");
        System.out.println("lutfen bir sayi giriniz");
        sayi= scan.nextInt();
        flag++;

    }  if (tutulanSayi<sayi) {

        System.out.println("lutfen sayinizi kucultun.");
        System.out.println("lutfen bir sayi giriniz");
        sayi=scan.nextInt();
        flag++;

    } if (tutulanSayi==sayi)
    {

        if (flag<=3){
            System.out.println((flag+1)+". denemede bildin."+"wowww");
        } else if (flag<=8) {
            System.out.println((flag+1)+". denemede bildin "+"afferim");
        }else {
            System.out.println("basarisiz.");

        }
    }


}




    }



    }


