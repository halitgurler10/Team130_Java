package day07_ifElseStatements;

import java.util.Scanner;

public class C02_IfElse_Statements {

    public static void main(String[] args) {

        //  soru 5: Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        // 1. Yontem

        char girilenHarf = scanner.next().charAt(0);

        if (Character.isLowerCase(girilenHarf)) {

            System.out.println(Character.toUpperCase(girilenHarf));

        } else {
            System.out.println(girilenHarf);
        }

        // 2. yontem


        if (girilenHarf >= 'a' && girilenHarf <= 'z') {
            System.out.println((char) (girilenHarf - 32));

        } else {
            System.out.println(girilenHarf);
        }
    }
}
