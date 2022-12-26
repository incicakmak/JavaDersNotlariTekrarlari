package day11_forLoops;

public class C09_NestedForLoop {
    public static void main(String[] args) {
   // input olarak verilen kenar uzunluklarına göre
        // asagidaki sekli cizdirin.

        int kisaKenar=5;
        int uzunKenar=8;

/*
     * * * * * * * *   // bir satiri nasil yazacagimizi inner loop ile belirliyoruz.
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
     * * * * * * * *
satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirler
 */
for (int i=1; i<=kisaKenar; i++){
    for (int j = 1; j <=uzunKenar ; j++) {
        System.out.print("* ");
    }
    System.out.println(" "); // satir ile alt satira gecmesi icin.
}

    }





}
