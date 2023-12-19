package day10_StringManipulation;

public class C04_substring {

    public static void main(String[] args) {

        String str = "Java Candir";

        // String de iki farkli yontemle substring elde edebiliriz.
        // 1 : tek parametre yazarsak

        System.out.println(str.substring(3));   //  a Candir     yazar
        System.out.println(str.substring(0));   // Java Candir
        System.out.println(str.substring(9));   //  ir


        // son 3 karakteri yazdirin
        System.out.println(str.substring(8));  // dir

        // dinamik olmasi icin length 'i kullanarak yazalim
        System.out.println(str.substring(str.length() - 3));  // dir


        //System.out.println(str.substring(20));  // StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length()));  // bos bir satir verir
        System.out.println("--");

        //System.out.println(str.substring(str.length() + 1));
        // StringIndexOutOfBoundsException




        // 2 parametre yazarsak
        // ilk parametreye esit olan index'den baslar.
        // iki parametreye esit olan index'e kadar yazdirir
        // (ilk index dahil ikinci index dahil degil


        // "Java Candir" ;

        System.out.println(str.substring(1, 6));  //  ava C
        System.out.println(str.substring(0, 7));  // Java Ca


        System.out.println(str.substring(1, 2));   //  a



        //  7. index'deki elemani yazdirin

        System.out.println(str.charAt(7));  //  n
        System.out.println(str.substring(7, 8));   //  n

        // str.charAt(7).         char oldugu icin yeni method kullanilamiyor
        // str.substring(7,8).    String oldugu icin method kullanabiliriz


        System.out.println(str.substring(2, 2));  //hiclik
        System.out.println("=====");  // =====


        //System.out.println(str.substring(6, 4));  // burda hata verir. cunku ilk index buyuk olamaz



        // substring : parametre olarak girilen index'den String'in sonuna kadar olan bolumu bize dondurur.
        System.out.println(str.substring(2));  // va Candir
        System.out.println(str.substring(10));  // r


        // eger sondan istenen kadar karakteri elde etmek istersek  "length()-istenenkaraktersayisi"  kullanilir.
        System.out.println(str.substring(str.length() - 4));  // ndir
        System.out.println(str.substring(str.length() - 1));   // r


        // str.substring (baslangicIndex , bitisIndex);   parametre olarak girilen iki index'den baslangic index'i dahil,
        // bitis index'i haric bolumunu bize dondurur.

        System.out.println(str.substring(1, 3));  // av
        System.out.println(str.substring(5, 10)); // Candi


    }
}
