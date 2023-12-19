package day21_Arrays_multiDimensionalArrays;

public class C02_StringSplitMetodu {

    public static void main(String[] args) {

        // verilen bir metinde
        // istenen karakterin kac kere kullanildigini yazdirin

        String metin = " Java'da hergun yeni seyler ogreniyoruz";

        String arananKarakter = "d";

        String [] karakterler = metin.split("");

        int sayac = 0;

        for (int i = 0; i < karakterler.length ; i++) {

            if (karakterler[i] .equals(arananKarakter)){
                sayac++;
            }
        }
        System.out.println("Aradiginiz karakter metinde " + sayac + " defa kullanilmistir");
    }

}
