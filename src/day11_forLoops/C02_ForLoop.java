package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen bir string de
        //indexi tek sayi olanlari kucuk harfle
        //indexi cift sayi olanlari buyuk harfle yazdirin.
        // ornek:Java output :JaVa

        String input = "Java candir, Selenium heyacandir.";

        for (int i = 0; i < input.length(); i++) {

            System.out.print(i % 2 == 0 ? input.substring(i, i + 1).toUpperCase() : input.substring(i, i + 1).toLowerCase());


        }


    }


}
