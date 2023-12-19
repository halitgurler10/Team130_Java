package day20_Arrays;

import java.util.Arrays;

public class C04_ArrayaElementEkleme {
    public static void main(String[] args) {

        // Soru 7: Verilen bir Array'e istenen bir elemani ekleyip
        //         bize donduren bir metod yazin,
        //         eski Array'e yeni degeri atayin.

        int[] arr = {3, 6, 7, 9, 6, 8, 7};
        int eklenecekEleman = 1;

        //arr[3] = eklenecekEleman;  //ArrayIndexOutOfBoundsException

        // once 4 kisilik yeni bir array olusturacagiz


        int[] yeniArr = new int[arr.length + 1];  // [0,0,0,0]

        // bir forloop olusturup
        // eski array'daki tum elementleri yeni Array'e kopyalayalim

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }

        // en son element olarak yeniArr 'e eklenecek sayiyi atayalim.

        yeniArr[yeniArr.length - 1] = eklenecekEleman;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr));


        // Array' yeni eleman olarak 5,7,3 ekleyelim
        arr=arrayElementEkle(arr,5);
        arr=arrayElementEkle(arr,7);
        arr=arrayElementEkle(arr,3);

        System.out.println(Arrays.toString(arr));






    }

    public static int [] arrayElementEkle(int[] arr , int eklenecekSayi){

        // once uzunlugu eski array'dan 1 fazla olan yeni bir array olusturalim
        int[] yeniArr = new int[arr.length+1];


        // 2. adim : eski array'daki tum elementleri yeni array'e atayalim

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
            
        }

        // en son element olarak eklenecek sayiyi atayalim.

        yeniArr[yeniArr.length-1]= eklenecekSayi;

        return yeniArr;
        

    }






}
