package day20_Arrays;

import java.util.Arrays;

public class C03_ElementleriSagaKaydirma {
    public static void main(String[] args) {

        // soru: verilen bir array'daki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir metod olsturun ,
        // Array'i yeni haliyle kaydedin.
        // Orn:  input: [4,5,6,7]   Array'in son hali : [7,4,5,6]


        int [] arr = {4,5,6,7,0,1,4};
        int temp = arr[arr.length-1];  // dinamik olmasi icin son elemani
                                       // bos kovaya koyduk


        for (int i = arr.length-1; i >= 1; i--) {

            arr[i] = arr[i-1];

        }

        // bos kovaya aldigimiz elementi, en basa koyalim

        arr[0] =temp;

        System.out.println(Arrays.toString(arr));



        int [] sayilar = {2,5,8,9,};      // bu yeni bir array
        sayilar=elementleriSagaKaydir(sayilar);
        System.out.println("Sayilarin yeni hali : "+ Arrays.toString(sayilar));


    }

    public static int[] elementleriSagaKaydir(int [] arr){

        int temp = arr[arr.length-1];

        for (int i = arr.length-1; i >= 1; i--) {

            arr[i] = arr[i-1];

        }
        arr[0] =temp;

        return arr;

    }


}
