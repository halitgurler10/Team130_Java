package day39_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CokluTryCatch {

    public static void main(String[] args) {


        // kullanicidan 2 tamsayi alin,
        // birinci sayiyi ikinci sayiya bölüp
        // sonucun  tamsayi kismini yazdirin


        /*
         Birden fazla risk varsa cozum olarak
         1 - Riskler ayri ayri Try-Catch icine alinabilir
         2-  Ic ice Try Catch kullanilabilir
         3 -  tek try birden fazla catc  h blogu olabilir
         */

        Scanner scanner = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lutfen bolunecek tam sayiyi giriniz");

            sayi1 = scanner.nextInt();  // a girersek imputexeption olusur

            System.out.println("Lutfen bölecek tam sayiyi girin");


            sayi2 = scanner.nextInt();

            System.out.println("Ilk sayi / ikinci sayi = " + sayi1 / sayi2);

        } catch (InputMismatchException e) {    // exception kontrol altina alindi
            // eger Try blogunu calistirirken olur da InputMismatchException olusursa
            // hatayi e objesine kaydet ve Cathch {}  icinde sana soylediklerini yap

            System.out.println("Tamsayi dedik TAMSAYI.....");


        } catch (ArithmeticException e) {
            // eger Try blogunu calistirirken olur da InputMismatchException olusursa
            // hatayi e objesine kaydet ve Cathch {}  icinde sana soylediklerini yap

            System.out.println("Bolecek sayi 0 olamaz");


        } catch (Exception e) {  // ongöremedigimiz baska bir exception olusursa

            System.out.println("Girilen degerler uygun degil");

        }
    }
}
