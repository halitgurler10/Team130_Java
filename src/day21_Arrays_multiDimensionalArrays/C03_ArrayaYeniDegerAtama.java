package day21_Arrays_multiDimensionalArrays;

import day20_Arrays.C04_ArrayaElementEkleme;

import java.util.Arrays;

public class C03_ArrayaYeniDegerAtama {
    public static void main(String[] args) {

        // Soru : Var olan bir Array'e yeni bir deger atanabilir mi?

        int[] arr1 = {3,5,6};

        //arr1 = {4,2,6};  bu sekilde deger atamayi kabul etmiyor
        // once istedigimiz Array'i ayri bir Array olarak olusturu
        // sonra da bizim Array'imize atama yapariz

        int[] geciciArr = {4,2,6};

        arr1 = geciciArr;
        System.out.println(Arrays.toString(arr1));  // 2,4,6   olur


        // eger yeni atadigimiz Array default degerlerden olusan bir Array olacaksa
        // new keyword kullanarak direk atama yapabiliriz


        arr1 =new int[5];
        System.out.println(Arrays.toString(arr1));   // [0, 0, 0, 0, 0]



        // olusturulmus bir Array'e uzunlugunu degistirecek sekilde
        // bir element eklemek veya element silmek mumkun mudur ?

        int [] sayilar = {4,2,1};

        // 4. eleman olarak 3 ekleyin

        // sayilar [3] = 3; // ArrayIndexOutOfBoundsException


        sayilar=C04_ArrayaElementEkleme.arrayElementEkle(sayilar, 3);

        System.out.println(Arrays.toString(sayilar));  //[4, 2, 1, 3]



        // sayilar Array'ine 5. element olarak 9 ekleyin
        sayilar=C04_ArrayaElementEkleme.arrayElementEkle(sayilar, 9);
        System.out.println(Arrays.toString(sayilar));  //[4, 2, 1, 3, 9]



        // Array'in ilk elementi olan 4'u Array'dan silin
        // Array'i 4 elementli hale getirin

        // var olan bir Array'e uzunlugu degistirecek sekilde yeni element ekleyemeyiz
        // veya element silemeyiz
        // Bunun yerine istenen elementlere sahip yeni bir Array olusturup
        // sonra yeni Array'i eski Array'e deger olarak atayabiliriz


        // once uzunlugu eski Array'den 1 eksik olan yeni bir Array olsturalim
        int[] yeniSayilar = new int[sayilar.length-1];
        // eski Array 'deki silinecek element disindaki elementleri
        // yeni Array'e kopyalayalim.


        for (int i = 0; i < yeniSayilar.length ; i++) {

            yeniSayilar[i] = sayilar[i+1];

        }

        sayilar = yeniSayilar;

        System.out.println(Arrays.toString(sayilar));  // [2, 1, 3, 9]




    }

}
