package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini soy isimni yasını alıp alt alta yazdırın.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz.");

        String girilenIsim =scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz.");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lütfen yasınızı giriniz.");
int girilenYas =scan.nextInt();

        System.out.println("isminiz: " + girilenIsim +
                           "\nSoyisiminiz: " + girilenSoyisim +
                           " \nyasiniz :" + girilenYas +
                           "\nKaydınız basariyla tamamlanmıstır.");











    }








}
