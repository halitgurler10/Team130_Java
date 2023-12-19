package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alin
        // hem 3 hemde 5 ile bolunebiliyorsa "super sayi" yazdirin.  // en secici sik en basa yazilmali
        // 3 ile bolunebiliyorsa 3 un kati
        // 5 ile bolunebiliyirsa 5 in kati



        /*
        Eger sartlar birbiri ile ilgili ise en once en secici olani yazmaliyiz.

        - Eger ifade else ile bitmezse
        if else statements tum degerleri kapsamiyor demektir.
        yani bazi degerleri girdimizde kod calisir ama hic bir sonuc uretmez.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if ( sayi % 3 == 0 &&  sayi % 5 == 0) {
            System.out.println("super sayi");

        }else if (sayi % 3 == 0){
            System.out.println("3 un kati");

        } else if (sayi % 5 == 0){
            System.out.println("5 in kati");

        }
        }

    }

