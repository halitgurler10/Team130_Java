package day43_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_TumSoyIsimleriYazdirma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        // 106 numarali ogrencinin soyismini yazdirin

        // Önce 106 numarali ögrencinin value'sine ulasip kaydedelim

        //String value106 = ogrenciMap.get(106);  //  Sevgi-Can-10-K-MF
        //String [] value106Arr = value106.split("-"); [Sevgi, Can, 10, K, MF]
       // System.out.println("106 soyisim : " + value106Arr[1]);  // 106 soyisim : Can



        // Tüm ogrencilerin soyisimlerini yazdirin
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  //

        for (Integer eachKey: ogrenciKeySeti
             ) {
            String valueEach = ogrenciMap.get(eachKey);  //Sevgi-Can-10-K-MF
            String [] valueEachArr = valueEach.split("-");
            System.out.println(eachKey + " nolu ogrencinin soyismi : " + valueEachArr[1]);
        }


    }

}
