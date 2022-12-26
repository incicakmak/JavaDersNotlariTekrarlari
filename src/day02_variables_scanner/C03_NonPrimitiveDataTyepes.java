package day02_variables_scanner;

public class C03_NonPrimitiveDataTyepes {
    public static void main(String[] args) {
        String str="Java candır.";
        int sayi=10;
        //primitive data turlerinin hazır methodları yoktur.
        // ancak non primitive data türleri önceden hazırlanmıs
        //bizim kullanabilecegimiz methotları vardır.

        System.out.println(sayi);//10
        System.out.println(str.toLowerCase()); //java candır
        System.out.println(str);//Java candır
        System.out.println(str.toUpperCase());// JAVA CANDIR
        System.out.println(str);//Java candır
        System.out.println(str.isEmpty());// false
    }


}
