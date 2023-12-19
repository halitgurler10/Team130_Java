package day39_Exceptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {

    public static void main(String[] args) {

        // Kullanicidan bir cümle ve bir sayi isteyin
        // Kullanicinin verdigi sayiyi index olarak kabul edip
        // cumlede o index'deki karakteri yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cümle giriniz");

        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir  tam sayi giriniz");

        int index = scanner.nextInt();


        try {
            System.out.println(cumle.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {

            //System.out.println(e.getCause()); // null

            //System.out.println(e.getMessage()); //String index out of range: 9

            e.printStackTrace(); // exception olustugunda yazdirilan tum satirlari yazdiri
                                 // ama exception kontrol altina alindigi icin
                                 // kod NORMAl olarak biter

            System.out.println("Girilen index cümlenin sinirlari disinda");

        }
    }
}
