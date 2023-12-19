package day21_Arrays_multiDimensionalArrays;

public class C05_MDA_tumElementleriGozdenGecir {
    public static void main(String[] args) {

        // Soru: verilen bir array'de cift sayilarin toplamini yazdirin.

        int[] arrT = {3, 4, 6, 9, 0, 2, 5, 6, 8, 1};

        int toplam = 0;

        for (int i = 0; i < arrT.length; i++) {

            if (arrT[i] % 2 == 0) {
                toplam += arrT[i];
            }

        }
        System.out.println(toplam);


        // bu sayilari iki katli array yaparsak
        // soru : iki katli bu array'de CIFT sayilarin toplamini yazdirin

        int[][] arrIki = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};
        toplam = 0;

        for (int i = 0; i < arrIki.length; i++) {
            for (int j = 0; j < arrIki[i].length; j++) {
                if (arrIki[i][j] % 2 == 0) {
                    toplam += arrIki[i][j];

                }

            }
        }
        System.out.println(toplam);
    }
}
