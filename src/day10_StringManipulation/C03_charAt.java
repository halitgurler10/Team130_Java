package day10_StringManipulation;

public class C03_charAt {

    public static void main(String[] args) {


        String str = "Java Candir";

        // string de index 0 dan baslar, karakter ise 1 den baslar
        // ilk harfi yadirin
        System.out.println(str.charAt(0));  // J
        System.out.println(str.charAt(7));  // n


        // son harfi yazdirin
        System.out.println(str.charAt(10));                // r
        System.out.println(str.charAt(11 - 1));             //r
        System.out.println(str.charAt(str.length() - 1));  // r

        // Eger bir kod yazarken
        // verilen input daki degisimleri algilasin ve
        // yeni haline gore isteneni yapsin istiyorsak
        // dinamik kod yazmaliyiz.
        // Bunun  icin elle yazacagimiz index degerleri yerine
        // metnin length 'ini kullanabiliriz.


        System.out.println(str.length());  // 11

        // sondan 3. harfi yazdirin
        System.out.println(str.charAt(str.length() - 3));  //d


        // olmayan bir index kullanirsak

        // System.out.println(str.charAt(20));  // StringIndexOutOfBoundsException    disinda bir deger verirsek bu hatayi verir

        //System.out.println(str.charAt(str.length()));  // StringIndexOutOfBoundsException   bu sekilde hata verir


        String str5 = " Uzunkavakaltindayataruyumazoglu";  //31
        System.out.println(str5.length()-1);




    }
}
