package day02_dataTurleri_Scanner;

public class C01_DataTurleri_Scanner {

        public static void main(String[] args) {

        int sayi =23;  // hafizada 32 bit

        byte sayi2 =23; // 8 bit

        short sayi3 = 23;  // 16 bit

        long sayi4 =23;  //64 bit

        char ch1 ='4';
        char ch2 = ' ';  // buradaki boslukta bir karakterdir.
        //char ch3 ='4 '; char data turu sadece 1 karakter kabul eder

                //metinsel ifadeler ise

        String str1 = "Java Candir";
        String telefonNo ="5555548458";
       // int tel = "45454545454";  tel numarasi matematiksel islemlerde kullanilmadigi icin ve int degerlerinden buyuk oldugu icin
        //string olarak kullanilir


        System.out.println("str1");  // str1
        System.out.println(str1); // Java Candir


        int x = 23;
        int y = 13;

        // iki sayinin toplamini yazdirin

        System.out.println("Verilen iki sayinin toplami : " + (x+y)); //36
        // verilen iki sayinin toplami : 36


        x =15;

        System.out.println("x : " + x);  //  x : 15

        x = 3 * x + 1;

        System.out.println("x 'in yeni degeri :" + x); // x in yeni degeri : 46


        float fl1 = 20f;
        float fl2 = 6f;

        System.out.println(fl1 /fl2); // 3.3333333

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println(dbl1 / dbl2);  // 3.333333333333335

        double dbl3 = 20;
        double dbl4 = 5;

        System.out.println(dbl3 / dbl4);  // 4.0













    }
}
