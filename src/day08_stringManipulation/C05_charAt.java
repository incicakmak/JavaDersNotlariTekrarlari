package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str="Java guzeldır";//13

        //Javada indeks 0'dan baslar.
        //J==>0.index,  r==>12
        //charAt(index) ile istedigimiz index'teki char'a ulasabiliriz.

        //ilk a'yi yaziralim.
        System.out.println(str.charAt(1));

        //sondan 2.harfi yazdiralim.
        System.out.println(str.charAt(13-2));// karakter sayisi -2 indexdeki eleman

        //sondan 4.karakteri buyuk harf olarak yazdirin.
        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt method'u bize char at dondurdugu icin toUpperCase calısmaz.
        //STRİNG METHOD'LARİNİ charAt() ile kullanmak isterseniz
        //charAt()'den once kullanmalisiniz.

        // System.out.println(str.charAt(13)); sinirlarin dısında hatasi verir.
        // StringIndexOutOfBoundsException
        // eger  index olarak karakter sayisi veya daha buyuk bir deger girersek
        //o indeks'i bulamayacagi icin hata verir.




    }




}
