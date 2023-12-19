package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner_dataCasting {
    public static void main(String[] args) {

        // soru 5: Kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formatta yazdirin
        // girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyadinizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isimIlkHarf + " "+soyisim+", "+ yas);



    }
}
