package day06_ifElseStatement;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //kullanıcıan bir karekter girmesini isteyin
        //girilen karakterin buyuk harf olup olmadığını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char krk=scan.next().charAt(0);
         if (65<=krk && krk<=90) {
             System.out.println("büyük harf girdiniz.");
             //System.out.println(krk=='A' && krk=='Z');
         }else {
             System.out.println("büyük harf degildir.");
         }

    }





}
