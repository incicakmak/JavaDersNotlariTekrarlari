package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {


        //bu metindeki sayilardan kurtulun.
        String str= "Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6", ""));// Java Guz,zel-dir

        str="Ja1va 56G7uz,z9el-d0ir8";
        /* replace methodu zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar.

        eger genellemeyi butun sayilari, butun space2leri, butun ozel karakterleri gibi genisletmek
        istersek replace() yerine raplaceAll() kullaniriz.

        Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlanmistir.

        \\d: butun digit'ler
         */
        str=str.replaceAll("\\d","");


        System.out.println(str.replaceAll("\\d", ""));

    //ozel karakterlerden de kurtulun.
        //space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        //once space yerine metinde olmaya bir deger atayalım

        str=str.replace(" ","5");

        str=str.replaceAll("\\W","");//  sedece bunu bu sekılde olunca space de gidiyor
        str=str.replace("5", " ");

        System.out.println(str);


        // buradaki harf sayisini bulun.

        String input3="Ali Can, Merve Star,Mark Tom";

        input3=input3.replaceAll("\\W", "");
        System.out.println(input3.length());




    }



}
