package day08_stringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesiyor, degil mi?";

        //sondan ucuncu karakteri yazdirin.

        System.out.println(str.charAt(str.length()-3));//y

        System.out.println(str.length());

        //rastgele bir karakterini yazdıralım.

        Random rnd= new Random(); // rnd degeri icin 0 ile1 arasinda rastgele bir deger olusrurur.
         int index= rnd.nextInt(str.length());//str.lenght()'den kucuk rastgele bir int uretir.

        System.out.println(str.charAt(index));



    }





}
