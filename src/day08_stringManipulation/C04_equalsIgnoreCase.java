package day08_stringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {

String str1="Pazar";
String str2="PAZAR";
String str3="pazar";
String str4="PaZaR";

        System.out.println(str1==str2); //false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println(str1.equals(str2));//FALSE
        System.out.println(str1.equals(str3));//FALSE
        System.out.println(str1.equals(str4));//FALSE

        /* eger iki metin karsilastirilirken buyuk harf-kucuk harf duyarliligi(case sensetive
        onemsiz ise o zaamn
        equalsIgnoreCase() kullanılır.
         */
        System.out.println(str1.equalsIgnoreCase(str2));//TRUE
        System.out.println(str1.equalsIgnoreCase(str3));//TRUE
        System.out.println(str1.equalsIgnoreCase(str4));//TRUE

    }




}
