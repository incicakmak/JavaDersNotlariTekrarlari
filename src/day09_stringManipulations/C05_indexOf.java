package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java ile kodlama cok kolay";

        //str "cok" iceriyor mu

        System.out.println(str.contains("cok"));// true

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin.

        // System.out.println(str.endsWith("cok"));// false verir

        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("a",5));//5.indexten sona ilk a nin indexini bulacak ama index her
        // zaman bastan basar, 13


        /* 2. o'nun index'ini yazdirin.
        once ilk o nun index ini buluruz.
        sonra o index den sonrasinda 2.o yu aratacagiz
        Java ilr kodlama cok kolay

*/

        int ilkOindexi=str.indexOf("o");//10




    }





}
