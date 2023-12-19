package day39_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_CokluTryCatch {

    public static void main(String[] args) {

        {


            // kullanicidan 2 tamsayi alin,
            // birinci sayiyi ikinci sayiya bölüp
            // sonucun  tamsayi kismini yazdirin


        /*
         Birden fazla risk varsa cozum olarak
         1 - Riskler ayri ayri Try-Catch icine alinabilir
         2-  Ic ice Try Catch kullanilabilir
         3 -  tek try birden fazla cath blogu olabilir
        4 -   tek try tum riskleri kapsayan bir catch blogu olabilir  (exception)
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

            } catch (Exception e) {    // Exception her turlu exception'i yakalar

                System.out.println("Girilen degerler kabul edilemez");



            }
        }
    }
}
