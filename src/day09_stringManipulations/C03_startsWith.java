package day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {



        String str="Java mutluluktur.";

        System.out.println(str.startsWith("Java"));// TRUE //bununla baslar mı diye soruyor contains içerir mi demek

        System.out.println(str.startsWith("j"));// false

        System.out.println(str.startsWith("Java mutluluktur."));// true


        System.out.println(str.startsWith(""));


        System.out.println(str.contains("mutlu"));// true
        System.out.println(str.startsWith("mutlu"));//false

        System.out.println(str.startsWith("mutlu",5));//5.indek ve sonrası mutlu ile baslar mi diye soruyor.

        System.out.println(str.startsWith("va",2));// true

    }



}
