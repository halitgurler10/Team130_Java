package day39_Exceptions;

import java.util.Scanner;

public class C01_AritmetikException {

    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alin,
        // birinci sayiyi ikinci sayiya bölüp
        // sonucun  tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunecek tam sayiyi giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bölecek tam sayiyi girin");

        int sayi2 = scanner.nextInt();

        if (sayi2 == 0) {
            System.out.println("bölecek sayi 0 olamaz");
        } else {


            System.out.println("Ilk sayi / ikinci sayi = " + sayi1 / sayi2);
        }
    }
}
