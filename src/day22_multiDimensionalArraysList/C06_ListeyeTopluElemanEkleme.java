package day22_multiDimensionalArraysList;

import java.util.ArrayList;
import java.util.List;

public class C06_ListeyeTopluElemanEkleme {

    public static void main(String[] args) {

        //eger yeni olusturdugumuz bir List'e toplu olarak olarak elemen eklemek istersek
        // Array olusturup loop ile list'e ekleyebiliriz.

        int [] arr ={3,2,5,4,7,8,6,2,1,9,8,6,2,5,4};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);  //[3, 2, 5, 4, 7, 8, 6, 2, 1, 9, 8, 6, 2, 5, 4]

    }
}
