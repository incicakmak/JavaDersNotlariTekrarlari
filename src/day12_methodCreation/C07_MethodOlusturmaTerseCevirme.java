package day12_methodCreation;

public class C07_MethodOlusturmaTerseCevirme {
    public static void main(String[] args) {

        // verilen bir stringi'i terse cevirip
        // o halini bize donduren bir method olusuturun.
metniTerseCevir("Java candir");

    }

public  static String metniTerseCevir(String str){

        String tersStr="";

    for (int i = str.length()-1; i >=0 ; i--) {

        tersStr +=str.charAt(i);

    }
        return tersStr;
}






}
