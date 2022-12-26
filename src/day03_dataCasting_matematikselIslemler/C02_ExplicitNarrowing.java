package day03_dataCasting_matematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        //eger genis kapasiteli bir data turunden dar kapasıteli bir data turune castıng yapmak ıstersek
        // java bunu otomatık olarak gerçeklestiremez,sizden sorumluluk almanızı bekler
        //explicit narrowing diyoruz bu isleme


        double dbl=23.5;
        int sayi=(int)dbl;

        System.out.println(sayi); //23
        byte byt=(byte)sayi;

        System.out.println(byt);
      sayi =130;
      byt=(byte)130;// int daha kapsamlı oldugu icin otomatık atamaa yapmaz bızden müdahale ister.
        System.out.println("int 130 un byte hali :" +byt);
        // -126
        sayi =256;
        byt=(byte)sayi;// int daha kapsamlı oldugu icin otomatık atamaa yapmaz bızden müdahale ister.
        System.out.println("int 256 un byte hali :" +byt);
        // -1
    }






}
