package day02_dataTurleri_Scanner;

public class C03_IsimVermeKurallari {

    public static void main(String[] args) {

        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;

        // veriable isimleri buyuk kucuk harf duyarlidir  sensitiv

        System.out.println(NOT); // 23
        System.out.println(not); //54

        //int 3abc = 45; harf rakam kullanilir
        //  bosluk yildiz ozel karakterler kullanilmaz.
        // variable isimleri harf ile baslamalidir rakam ile baslamaz
        // variabledeki isimleri java daki tanimli anahtar kelimeker kullanilmaz.  for int  long


        // camelCase

        int karneNotu = 65;
        String isminIlkHarfi = "A";

        String ISMINILKHARFI = "k";
        /*
        eger variable ismi birden fazla kelimeden olusuyorsa ilk harf kucuk,
        sonraki kelimeler ise ilk harf buyuk, diger harfler kucuk yazilir.
        buna camelcase denir.
        farkli sekilde yazinca da java kabul eder . ama ortak kurallara uymak gerekir .
         */

        int benimAdimCemil = 33;   // ctrl + alt +  L  yazim yanlisini gosterir


    }
}
