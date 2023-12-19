package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // soru 6: Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lutfen cemberin yari capini giriniz");
        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi : " + (2*3.14*yaricap) );
        System.out.println("Dairenin alani :" +(3.14*yaricap*yaricap));




    }
}
