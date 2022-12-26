package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        //verilen input'a gore carpim tablosu olusturun.
        // Javada ic ice yapilara nested denir.
        //burada farki olan
        int input=4;

        /*
        1  2  3    4
        2  4  6    8
        3  6  9   12
        4  8  12  16
         */

        // 1  2  3  4
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i+" ");
        }
        //2  4  6  8
        System.out.println("");
        for (int i = 1; i <=4; i++) {
            System.out.print(2*i +" ");

        }
        System.out.println("");

        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i +" ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }
        System.out.println("");
//nested for loop ile yapalim.

        for (int i = 1; i <=4 ; i++) { //outer loop denir ve i'nin carpilacagi sayiyi kontrol edecek.
            for (int j = 1; j <=4 ; j++) { //inner loop denir ve onceki ornekteki i degiskenini kontrol eder.

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }

        //outer loop'un her i deger artisi icin
// inner loop bastan sona calisir.






    }



}
