package day10_stringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {


        String str1="";
    String str2="    ";
    String str3;
    String str4=null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());// true
        System.out.println(str2.isEmpty());// false


        System.out.println(str1.isBlank());// true
        System.out.println(str2.isBlank());//true

        //null bir deger degil isaretcidir.(null pointer)
        //null pointer: non primitive bir objenin olusturuldugunu
        //ancak bilincli olarak deger atanmadıgını isaretler.
        // str4'un degeri null'dır cumlesi yanlıs
        // str4 null olarak ısaretlenmıstır cumlesı dogru.

       // System.out.println(str3.length()); yazarsak str3 un degeri atanmadıgı icin hata verir.

       // System.out.println(str3.concat("ali can")); yazarsak deger atnmadıgı icin hata verir
       // System.out.println(str3.substring(3,4)); hata verir.

        // java variable'i olusturup deger atanmamasina izin verir.
        // bir variable'i deger atanmadan olusturabilirsiniz ancak kullanamazsiniz.
        // deger atanmayan bir varianle'i kullanmaya kalkarsaniz java CTE verir.


        //null pointer ise bu variable'a bir deger atanmadigi
        // ve bunun bilincli bir tercih oldugunu Java'ya soyler
        //dolayısıyla java kodların calısmaya devam etmesine izin verir.
        //ancak deger atanmadıgı icin methodlarla kullanmaya calisirsaniz
        //null pointerexception verir.


        str4=null;

        // System.out.println(str4.length()); // NullPointException
       // System.out.println(str4.substring(3,4));// NullPointerException

        System.out.println(str4);//null
        System.out.println(str4+"ali can");//nullAli can
        //System.out.println(str4.concat("ali can"));// null pointer exception


    }










}
