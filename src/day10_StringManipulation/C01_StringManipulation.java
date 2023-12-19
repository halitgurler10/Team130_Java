package day10_StringManipulation;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String str = "Java Candir";

        // str 'i buyuk harflerle yazdirin

        System.out.println(str.toUpperCase());  //JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir


        // String method lari kullanildiginda orjinal metin degismez.
        // Degisikligi kalici olarak yapmak istersek ATAMA yapmaliyiz

        System.out.println(str);  // Java Candir

        str = str.toUpperCase();

        System.out.println(str);    // JAVA CANDIR



        // str 'i kucuk harfe cevirin.
        // ancak I harfi kucuk harfe cevrildiginde ingilizce i olur.

        System.out.println(str.toLowerCase());  // java candir


        //eger metinde ingilizce de olmayan I'yi
        // Turkce kucuk I ya cevirmek istersek
        // istersek toLowerCase (Locale....) kullanilabilir.

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));  // java candır.






    }
}
