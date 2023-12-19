package day20_Arrays;

import day19_Arrays.C02_ArrayinElemanlariniArttirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaArrayolusturtma {

    public static void main(String[] args) {

        //Soru: Kullanicidan Array'in boyutunu ve tamsayi  elementlerini alip
        // Array'i olusturan ve bize donduren bir metod olusturun


       // System.out.println("ilk array : " + Arrays.toString(arrayOlustur()));  // bu direk yazdiriyor


        int [] benimArray = arrayOlustur();
        System.out.println("Benim Array : " +Arrays.toString(benimArray));  // bu kaydedip yazdiriyor



        // benim arrayimdaki tum sayilari 4 arttirin

        benimArray= C02_ArrayinElemanlariniArttirma.elemanlariArtir(benimArray, 4);



    }

    public static int[] arrayOlustur(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen array'a kac eleman koyacaginizi giriniz");

        int elemanSayisi = scanner.nextInt();

        int [] arr = new int[elemanSayisi];


        for (int i = 0; i <arr.length ; i++) {

            System.out.println("Array'a eklemek icin bir tamsayi giriniz");
            arr[i]=scanner.nextInt();


        }
        return arr;
    }
}
