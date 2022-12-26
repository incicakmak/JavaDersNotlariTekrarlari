package day14_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // verilen  baslangic ve bitis karakterleri dahil.
        // oradaki tum kararkterleri yazdirin.

        char baslangic='k';
        char bitis='t';

        do {
            System.out.println(baslangic);
        baslangic=(char) (baslangic+1);

        }while (baslangic<=bitis);


    }





}
