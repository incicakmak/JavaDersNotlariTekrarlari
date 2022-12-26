package day11_forLoops;

public class C07_ForLoopTerseCevirme {
    public static void main(String[] args) {

        // kullanicidan bir string isteyin
        //string'i tersine cevirip yazdirin.

        String str="Java ogrenmek icin cok calismak lazim";

String terstenStr="";

for (int i=str.length()-1 ; i>=0 ; i--) {
    terstenStr += str.substring(i, i + 1);
}
        System.out.println("girilen cumlenin tersten yazilisi: "+ terstenStr);
    }


}







