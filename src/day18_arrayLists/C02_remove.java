package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {


        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));// TRUE zYİ BULUP SİLER VE GOREVİ TAMAMLADİGİ İCİN true dondurur.
        System.out.println(harfler);// [A,T]

        System.out.println(harfler.remove(0)); // 0.index'teki elementi siler ve gorevi tamamlayıp silinen elementi bize dondurur.

        System.out.println(harfler);// [T]

        List<String> yeniList=new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));
        // harfler listesindeki tum elementleri yeniListten siler
        //gorevi tamamlarsa true, yoksa false doner.

        System.out.println(yeniList);// [C,D]



    }



}
