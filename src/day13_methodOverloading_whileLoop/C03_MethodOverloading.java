package day13_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3);// 2 double sayinin toplami :11.7
       toplama('a','b'); //

       // ilk olarak %100 uyumlu parametreler arar.
       // %100 uyumlu yoksa calisabilecek method var mi kontrol eder.
       //calisacak method birden fazla olursa minumun casting yaparak kullanabilecegini tercih eder.

       toplama(8.4,6);

    }

    public static void toplama(int sayi2, double sayi1) {
        System.out.println("int ve double toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(double sayi1, double sayi2) {
        System.out.println("2 double toplami : " + (sayi1 + sayi2));
    }

}
