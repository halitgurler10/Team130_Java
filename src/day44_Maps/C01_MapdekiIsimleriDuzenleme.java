package day44_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapdekiIsimleriDuzenleme {

    public static void main(String[] args) {

        // 4- Ogrenci Map'indeki tum isimleri ilk harf buyuk sonraki harfler kucuk,
        // tum soyisimleri ile tamamen buyuk harf yapin

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

        // update isteniyor

        // tum key'leri alalim
        Set<Integer> keySeti = ogrenciMap.keySet();

        // bir for-each loop ile keySet'indeki tum key'lerre ait value'leri gozden gecirelim

        for (Integer eachKey: keySeti
             ) {

            // value'yu String olarak kaydedelim
            String eachValue = ogrenciMap.get(eachKey);

            // split ile value'yu array'e cevirelim
            String [] eachvalueArr = eachValue.split("-");  //Esra , Han, 11, M , SOZ
            //tum isimleri ilk harf buyuk sonraki harfler kucuk,
            // tum soyisimleri ile tamamen buyuk harf yapin

            eachvalueArr[0] = eachvalueArr[0].substring(0,1).toLowerCase()+
                              eachvalueArr[0].substring(1).toLowerCase();



            // array'de update yapalim


            // array'i yaniden String value formatina sokalim

            // key ile yeni updated value'yu kullanarak map' update edelim


        }


    }
}
