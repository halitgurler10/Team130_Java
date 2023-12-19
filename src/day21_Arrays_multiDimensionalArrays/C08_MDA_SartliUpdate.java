package day21_Arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_SartliUpdate {

    public static void main(String[] args) {

        // verilen iki katli multi daimantional array'da
        // elementleri icinde bulundugu inner array'daki index'i kadar arttirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length ; i++) {  // inner arrayleri kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {  // inner array'deki elementleri kontrol eder

                arr[i][j] +=j;

            }

        }
        System.out.println(Arrays.deepToString(arr));
        //[[4, 0, -3], [6, -8, 4], [1, 6, -6, -1, 7, 11]]
    }
}
