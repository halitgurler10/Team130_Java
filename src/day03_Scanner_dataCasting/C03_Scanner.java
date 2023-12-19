package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // soru : 7 interviev  .  Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin . (swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ilk tamsayiyi giriniz");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        // diyelim ki ilk sayi  = 10  ikinci sayi = 20 girdi kullanici
        // ilk sayi'nin degerini 20 ikinci sayinin degerini 10 yapin

        int temp = 0;
        temp = ikinciSayi;

        ikinciSayi = ilkSayi;

        ilkSayi = temp;

        System.out.println("Girdiginiz variablalerin degerini degistirdim");
        System.out.println("Ilk sayinin yeni degeri : " + ilkSayi);
        System.out.println("Ikinci sayinin yeni degeri : " + ikinciSayi);



    }
}
