package day12_methodCreation;

public class C01_Method {
    public static void main(String[] args) {

        String str="Java'da yolu yariladik.";


        str.isEmpty(); //blooen sonuc dondu ama kulanmadik

        //method'un dondurudugu sonucukullanmak isterseniz ya yazdirirsiniz

        str.isBlank();//false

        //yada donen sonucu ileride kullanacaksak atama yapabiliri.
        String buyukHarfliHali=str.toUpperCase();


        //method'lar bazen cok basit islemleri, bazende kompleks islemleri yapabilir.
        // biz o islemleri nasilyapabiliriz diye düsünmek yerine hazir method'u kullanmayi tercih ederiz.
        //bizden sonra kodu inceleyecek kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca
        // ayrica kodu her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz.
    }



}
