package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir.";

        // eger tum a'lari degil de sadece ilk a'yi degistirmek istersek

        System.out.println(str.replaceFirst("a","A"));

        //ilk harf veya rakami * yap.

        System.out.println(str.replaceFirst("\\w", "*"));// ister direk string verebiliriz istersekte regex kullanabiliriz.

    }






}
