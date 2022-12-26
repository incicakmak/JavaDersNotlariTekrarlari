package day12_methodCreation;

public class C03_MethodOlusturmaAsalSyi {

    public static void main(String[] args) {

        //verilen bir sayinin asal olup olmadigini true/ false olarak donduren
        // bir method olusturun.

        //asalSayiMi method'u boolean bir sonuc dondurdugunden
        //bu method'u calistirdimizda
        //ya direk yazdirmaliyiz.

        System.out.println(asalSayiMi(55)); //false

// veya method call'un getirecegi sonucu atamak icin bir variable olusturbilirim.

        boolean asalMisonuc59=asalSayiMi(59);
        System.out.println("59 icin sonuc: "+ asalMisonuc59);//true


    }
public static boolean asalSayiMi(int input) {

     boolean asalSayiMi = true;

    for (int i = 2; i < input; i++) {

        if (input % i == 0) { //eger burasi calisirsa asal sayi degil
            asalSayiMi = false;

        }
    }
    return asalSayiMi;
}}
