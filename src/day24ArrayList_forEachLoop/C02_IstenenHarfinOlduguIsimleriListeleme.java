package day24ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenHarfinOlduguIsimleriListeleme {
    public static void main(String[] args) {

        // Verilen bir String Array'da
        // istenen harfi iceren isimleri
        // bir liste olarak yazdirin .

        String[]  isimler = {"Derya", "Ismail", "Sedat", "Tugba", "Murat", "Sahil", "Mehmet"};

        String istenenHarf = "y";

        List<String> uygunIsimlerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){

                uygunIsimlerListesi.add(isimler[i]);

            }

        }
        System.out.println("Istenen harfi iceren isimler : " +uygunIsimlerListesi);

    }
}
