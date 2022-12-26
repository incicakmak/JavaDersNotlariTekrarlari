package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // eger sart i'nin hicbir degeri icin true olmuyorsa
        //loop calisir ama loop body'si calismayabilir.
        // input olarak verilen sayidan bire kadar tum sayıları yazdirin

        int input=-23;

        if (input>1 ) {

            for (int i =input; i>=1 ;i--){
                System.out.println(i+" ");

            }
        }else {
            for (int i = input; i <= 1; i++) {
                System.out.println(i + " ");
            }
        }

        //eger sart i'nin tum degerleri icin dogru oluyorsa
        //teknik olarak sonsuz loop olusur deriz.
        //bilgisayariniz sonsuza kadar calismaz,ramdolar veya int2in sinirinaulasır.
        //ama teknik olarak sonsuz loop denir.
    }


}
