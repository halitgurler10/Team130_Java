package day39_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alin,
        // birinci sayiyi ikinci sayiya bölüp
        // sonucun  tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        /*
        iyi bir Coder
        yazdigi kodun neresinde ne tur sorunlar olusabilecegini öngörüp
        sorun olusabilecek durumlar icin
        Javaya yapmasi gerekenleri tembihler.

        Eger öngörülen risk birden fazla ise
        bu riski tasiyan kodlar ayri ayri TRY- CATCH bloklari ile
        kontrol altina alinabilir

        AMA bu durumda ikisi ayri ayri oldugundan senkronize calismayabilir .

         */

        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lutfen bolunecek tam sayiyi giriniz");

            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bölecek tam sayiyi girin");

            sayi2 = scanner.nextInt();

        } catch (InputMismatchException e) {
            // eger Try blogunu calistirirken olur da InputMismatchException olusursa
            // hatayi e objesine kaydet ve Cathch {}  icinde sana soylediklerini yap

            System.out.println("Tamsayi dedik TAMSAYI.....");
        }





        try {
            System.out.println("Ilk sayi / ikinci sayi = " + sayi1 / sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Bölecek sayi 0 olamaz");


            // her problemli satir icin ayri trycatch olustururuz
        }


    }
}
