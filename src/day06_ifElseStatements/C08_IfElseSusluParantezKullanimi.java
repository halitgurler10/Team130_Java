package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin,
        // eger sayi1 sayi2'den buyukse, sayi1'i 1 azaltip, sayi2'yi 1 arttirin.
        // sayi1 sayi2'den buyuk degilse , sayi1'i 3 ile carpin, sayi2'yi 2 ile carpin.
        // sayi1 ve sayi2'nin son degerlerini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2 ){
            sayi1--;
            sayi2++;

        }else {
            sayi1 *=3;
            sayi2 *=2;

            System.out.println( "Sayi1 : " +sayi1+ ", Sayi2 : " + sayi2);
        }
    }
}
