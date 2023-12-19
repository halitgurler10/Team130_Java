package day21_Arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_TumElementleriArttirma {

    public static void main(String[] args) {

        //  Soru:  verilen iki katli bir int [] deki
        // tum sayilari 3 arttirin

        int[][] arr = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                arr[i][j] +=3;

            }
        }

        System.out.println(Arrays.deepToString(arr));
        // [6, 7, 9], [12, 3], [5, 8, 9, 11, 4]]

        }
    }

