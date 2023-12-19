package day09_SwitchStatements;

import java.util.Scanner;

public class C02_SwitchStatements {

    public static void main(String[] args) {

        // Soru: 4 : Kullanicidan ISTQB kisaltmasindaki harflerden
        // anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin .
        // I : International  S: Software
        // T: Testing   Q: Qualifications   B: Board


        /*
        NOTTT: Switch de yazdirmadan sonra mutlaka Break demeliyiz yoksa tum satirlari yazdirir.
        En sonda ise "default "  diyerek bitirmeliyiz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz harfi giriniz");
        char harf= scanner.next().toUpperCase().charAt(0);


        switch (harf){

            case 'I':
                System.out.println("International");
                break;

            case 'S':
                System.out.println("Software");
                break;

            case 'T':
                System.out.println("Testing");
                break;

            case 'Q':
                System.out.println("Qualifications");
                break;

            case 'B':
                System.out.println("Board");
                break;

            default:
                System.out.println("Kisaltmada olan harflerden  birini yazmalisiniz");


        }
    }
}
