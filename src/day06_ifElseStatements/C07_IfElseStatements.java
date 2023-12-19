package day06_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        //soru1: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //       Ucgen eskenar ise "eskenar ucgen" yazdirin.
        //       degilse "eskenar degil" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 >0) {
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }

    }

}
