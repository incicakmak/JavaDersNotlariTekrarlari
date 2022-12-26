package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {

    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar); //[10,5,7,9]

       // sayilar.remove(5) IndexOutBoundsException

        /*
        eger Listemiz Integerlardan olusuyorsa
        parametre olarak yazdigimiz sayinin index mi yoksa silmek istedigimiz obje mi
        oldugu belirsiz olmasın diye
        Java otomatik olarak girilen sayiyi index kabul eder.

        Eger Integer'lardan olusan bir listede
        obje olarak bir elementi silmek istersek
        once onu tanimlamalisiniz.

         */

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement));// true

        System.out.println(sayilar);// [10,7,9]

        silinecekElement=20;

        System.out.println(sayilar.remove(silinecekElement));// false



        ArrayList<Character> list = new ArrayList<Character>();



        for (char i = 'a'; i <= 'e' ; i++) {

            list.clear();

            list.add(i);

        }

        System.out.println(list);


    }


}
