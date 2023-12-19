package day15_MethodOlusturma;

import java.util.Scanner;

public class C01_KendiSubstingMethodumuz {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen baslangic index'ini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis index'ini giriniz");
        int bitis = scanner.nextInt();

        if (baslangic > bitis){
            System.out.println("Baslangic index'i bitis index'inden kucuk olmalidir");

        } else if (baslangic >= metin.length() || bitis >= metin.length()) {
            System.out.println("Verilen index'ler metnin disinda");

        }else{

            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }

            }
    }
}
