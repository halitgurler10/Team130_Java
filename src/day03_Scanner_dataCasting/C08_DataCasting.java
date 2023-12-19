package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1/sayi2);  //6.66666..... // 6


        double sayi3 = 3;
        System.out.println(sayi1/sayi3);  //6.666666666666667  iki int ile islem yapiyorsan


        // soru :.
        // kullanicidan 2 tam sayi alip
        // 1. sayiyi 2. sayiya bolun
        // sonucu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 Tamsayi giriniz");

        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        double sonuc = (double) sayi1/sayi2;  // sayinin birini double yapip devam ediyoruz.
        System.out.println("Verilen sayilarin bolumu : " + sonuc);  //5.714285714285714
    }
}
