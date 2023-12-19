package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C09_Swapsoru {
    public static void main(String[] args) {

        //Soru :  Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tane Tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Degistirilen degerler : " );
        System.out.println("ilk sayinin yeni degeri : " +sayi2);
        System.out.println("ikinci sayinin yeni degeri : " +sayi1);




    }

}
