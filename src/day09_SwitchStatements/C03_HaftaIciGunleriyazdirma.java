package day09_SwitchStatements;

import java.util.Scanner;

public class C03_HaftaIciGunleriyazdirma {

    public static void main(String[] args) {

        // Kullanicidan gun ismi isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen gun ismini giriniz");
        String gunIsmi = scanner.next().toLowerCase();

        switch (gunIsmi){

            case "pazartesi":          // ayni seyleri bu sekilde gruplandirarak yazabiliriz
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }
    }
}
