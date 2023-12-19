package day21_Arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {

    public static void main(String[] args) {

        int [][] arr ={{3,4,5}, {9,10}, {7}, {1,2,3,4,5,6}};


        System.out.println(arr[1][1]);  // 1. arrayin 1 elementi   // 10 yazar
        // arrayin icindeki elementlerden biri direk yazdirilabilir

        // inner arraylerden birini yazdirmak istersek Arrays.toString() kullaniriz
        System.out.println(Arrays.toString(arr[1]));  //[9, 10]

        // eger array'in tamamini yazdirmak istersek Arrays.deepToString() kullaniriz.
        System.out.println(Arrays.deepToString(arr));  //[[3, 4, 5], [9, 10], [7], [1, 2, 3, 4, 5, 6]]


        // 1. Array'daki 10 elementinin yerine deger olarak 5 atayin
        arr[1][1] = 5;


        // 3. array'daki 6 elementinin yerine deger olarak 8 atayin
        arr[3][5] = 8;


        // tum array' yazdirin
        System.out.println(Arrays.deepToString(arr));  //[[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]



        //  1. index'deki inner Array'in 1. indexdeki elementinin degerini
        //  DINAMIK olarak 3 arttirin

        arr[1][1] +=3;
        System.out.println(Arrays.deepToString(arr));  //[[3, 4, 5], [9, 8], [7], [1, 2, 3, 4, 5, 8]]     8 oldu




    }
}
