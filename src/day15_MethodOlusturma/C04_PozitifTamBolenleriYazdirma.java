package day15_MethodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdirma {

    public static void main(String[] args) {

        // Soru :  Kullanicidan main method icinde bir tamsayi alin.
        //         Girilen sayinin pozitif tam bolenleri sayisini bulup
        //         bize method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();


        pozitifBolenleriYazdir(sayi);

        pozitifBolenleriYazdir(640);

        //pozitifBolenleriYazdir("sanane"); // string girdigimiz icin kabul etmez

        //pozitifBolenleriYazdir(true);  // boolean girdigimiz icn kabul etmez

        pozitifBolenleriYazdir('z');  // ascii tablosun abaktigi icin kabul eder

        /*

        Method call'da kullanilan argument ile
        method parametreleri uyumlu OLMALIDIR.

        eger argument ile parametreler uyumlu olmazsa CTE olusur
        kod calismaz

         */




    }

    public static void pozitifBolenleriYazdir(int sayi){

        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");
    }

}
