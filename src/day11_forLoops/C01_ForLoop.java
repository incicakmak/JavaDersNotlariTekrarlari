package day11_forLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //kullanicidan bir char alip
        //o karakterden sonra gelen 10 karakteri yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz.");
        char girilenKarakter=scan.next().charAt(0);

        for (int i=1; i<11 ; i++){
            System.out.println((char)(girilenKarakter+i)+ " ");
        }


    }





}
