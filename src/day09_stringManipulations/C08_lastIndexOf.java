package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calisman lazim cok.";

        //ilk a nın indexini yazdiralim

        System.out.println(str.indexOf("a"));//1

        // son a nin indexini yazdiralim

        System.out.println(str.lastIndexOf("a",15));



        System.out.println(str.lastIndexOf("a"));//39
        // aramaya sondan basliyor ama indexini 0 dan balayarak yani bastan yazdiriyor.

        // verilen str' da cok kelimesinin kullanımını kontrol edip
        //-kullanılmamıs
        //-bir kere kullanılmıs
        //-birden fazla kullanilmis
        // sonuclarından uygun olani yazdirin.
        // Javayi iyi ogrenmek icin cok calımam lazim cok.

        int ilkCokIndexi=str.indexOf("cok");
        int sonCokIndexi=str.lastIndexOf("cok");


        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanılmamis." );
        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("cok kelimesi bir kere kullanilmis.");
        } else{
            System.out.println("cok kelimesi birden fazla kullanilmis.");
        }



    }




}
