package day14_doWhileLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir pozitif sayi isteyin,
        // sayinin tam kare olup olmadigini bulunuz.
        //tamkare ise true degilse false yazdiriniz.
        //ornek: input :16 ,outpıt: 4

        int input=169;
        int karekok=1;
        boolean sonuc=false;

        while (karekok*karekok<=input){

            if (karekok*karekok==input){
                System.out.println("girilen sayinin karekoku : "+ karekok);
                sonuc=true;
            break;
        }else {
            karekok++;
        }}
            System.out.println(sonuc);


        // do while loop ile yapalım.

        input=144;
        karekok=1;
        sonuc=false;

        do {

            if (karekok*karekok==input){
                System.out.println("girilen sayinin karekoku : "+ karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }


        }while (karekok*karekok<=input);
        System.out.println(sonuc);


    }
}
