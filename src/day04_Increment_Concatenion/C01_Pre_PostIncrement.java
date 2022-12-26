package day04_Increment_Concatenion;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;

        // sayiyiy 3 artır.

        sayi=sayi+3;
        sayi +=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); //29

        //sayinin degerini 2 azaltın

        sayi=sayi-2;
        sayi-=2;

        sayi--;
        sayi--;

        System.out.println(sayi);//23

        sayi =10;

        //sayinin degerini 1 azaltın ve yazdırın.

        sayi--;
        System.out.println(sayi); //9

        // bu islemde ekranda gördugumuz 9, sayının degeri 9


sayi=10;
 //sayiyi önce bir azaltın sonra 1 azaltın

        System.out.println(sayi); //10
sayi--;

// ekranda gorülen 10 ama sayının son degeri 9 43.satırda 9 a dustugundan dolayı

sayi=10;
        System.out.println(sayi++); //10
// java aynı satirda iki islem oldugunda sıralama yapar.
        // eger ++ variable dan sonra ise artırma islemini yapar
        // bu duurmda önce yazdırma sonra  artırma ıslemini yapar.
        System.out.println(sayi);//11

        sayi=10;
        System.out.println(++sayi);//11
// ++ variabledan önce ise artırma islemini önce yapar.
        // bu durumda java önce artırma sonra yazdırma islemini yapar.


        System.out.println(sayi);//11
    }






}
