package day08_stringManipulation;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length());

        //metnin ortasindaki karakteri bulmak icin

        System.out.println(str.charAt(str.length()/2)); // n
// son karakteri yazdirin.

        System.out.println(str.charAt(str.length()-1));//p

        //bir karakteri degilde verilen string'in icerdigi bir metin parcasini elde etmek istersek
        // ornegin: "ogren" kelimesini yazdiralim.

        System.out.println(str.substring(5,9));//ogre
//substring (baslangic,bitis)methodunda
        //baslangic olarak yazilan index dahil(inclusive)
        // bitis olarak yazılan index haric(exclusive)
        System.out.println(str.substring(5,10));//ogre

// str 'den "Java" kelimesini yazdiralim.

        System.out.println(str.substring(0,4));

// str'den kap yazdiralim.

        System.out.println(str.substring(16,19));
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        //substring kullanarak sadece Jharfini yazdirin.

        System.out.println(str.substring(0));// java ogren, isi kap
        System.out.println(str.substring(0,1)); //J

        //SUBSTRİNG KULLANARAK 9.İNDEXTEKİ HARFİ BUYUK OLARAK YAZDİRİN.

        System.out.println(str.substring(9,10).toUpperCase());//n
        System.out.println(str.toUpperCase().charAt(9));//n

        //charAt()kullanmak yerine substring kullanmak daha avantajlı olabilir.
        //cunkü substring kullaninca ifade hala string oldugundan
        //method kullanmaya devam edebiliriz.

        System.out.println(str.substring(5,5));//hiçlik yazdirir yani konsolda bos bir satir yazdirir.
        System.out.println("======");

        //System.out.println(str.substring(4,3)); // 4 den basla 3 e kadar git demek hatali olur

        //System.out.println(str.substring(25,28));//sinirlarin dısına ciktiniz.

        System.out.println(str.substring(str.length())); // bos bir satir verdi yani hiclik yazdirdi.
        //System.out.println(str.charAt(str.length())); StringIndexOutOfBoundsException
      //  System.out.println(str.substring(str.length()+1)); StringIndexOutOfBoundsException
        System.out.println("=====");





    }





}
