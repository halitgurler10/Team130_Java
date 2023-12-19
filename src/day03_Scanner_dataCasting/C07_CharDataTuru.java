package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTuru {
    public static void main(String[] args) {

        // char ozel bir data turudur
        // '4' 'h' 'K' '&' icine tek bir karakter alir
        // char data turundeki variable'lar ve degerler
        // matematiksel islemlerde kullanilirsa
        // ASCII table'daki decimal karsiliklari ile isleme girerler


        System.out.println('a' + 'b'); // 97+98=195  char olarak toplamlari

        System.out.println('0'+ '1'); // 48+49=97

        int sayi = 'c';
        System.out.println(sayi); // 99


        char chr = 101;
        System.out.println(chr);  //e

        // kullanicidan bir karakter isteyin
        // kullanicinin girdigi karakterden sonraki 3 karakteri yazdirin .
        // ornek input : l   output : m , n , o


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen herhangi bir karakter giriniz");

        char girilenChar = scanner.next().charAt(0);  // ilk karakter dedigi icin index 0 yaziliyor

        System.out.println("girilen karakter : " + girilenChar);
        System.out.println("girilen karakterden 1 sonraki karakter : " + (char)(girilenChar+1));  //parantez icinde char yazilmazsa matematiksel islem yapar
        System.out.println("girilen karakterden 2 sonraki karakter : " + (char)(girilenChar+2));
        System.out.println("girilen karakterden 1 sonraki karakter : " + (char)(girilenChar+3));


    }
}
