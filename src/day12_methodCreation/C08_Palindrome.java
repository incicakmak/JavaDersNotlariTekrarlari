package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // verilen bir string'in palindrom olup olmadigini yazdirin.
        //palindrome : duz okunusu ile ters okunusu birbirinin aynisi

        String str="Bu methodlar ne guzelmis.";

        String tersStr=C07_MethodOlusturmaTerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrom");
        }else {
            System.out.println("verilen metin palindrom degil.");

        }

    }



}
