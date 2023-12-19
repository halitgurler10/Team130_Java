package day40_CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedException {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/day40_CheckedExceptions/yazi.txt";

        // Javada bilgisayarimizda var olan bir dosyaya ulasmak icin
        // FileInputStream class'i kullanilir

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        /*
         //Unhandled exception: java.io.FileNotFoundException
        // Ya evde yoksa?

        java bir dosyaya ulasmasini istedigimizde
        o dosyaya ulasabileceginden emin olmak ister.
        ve bizi bu konuda bir eylem yapmaya zorlamak icin kodun altini kirmizi cizer

        kodun altini kirmizi cizmesini
        bugune kadar hep kod' da hata var duzeltmemiz var diye yorumlamistik

        Ancak Checked Exceptionlarda
        java riski gorur ve onlem almamiz icin altini kirmizi cizer


        Javada dosyadan bilgi alma veya dosyaya bilgi yazdirma (Input / Output IO)
        ile ilgili exception'lar checked exceptionlardir .
        yani daha compile aninda java bu riskleri farkeder
        ve bizden cozum ister

         */

         /*
            Checked Exception'lar icin
            Java bize 2 alternatif sunar
            1- su ana kadar yaptigimiz gibi
               try-catch ile sarmalayip
               sorun olussa bile calismaya devam etmesini saglayabiliriz

            2- EGER exception'i kontrol altina alip
               calismaya devam etmesini istemiyorsaniz
               SADECE kirmizi cizgiyi yoketmek
               kodlarimizi calisir hale getirmek
               ve exception olusursa, kodlarimizin calismayi durdurmasini istersek
               method deklarasyonuna riskin farkinda oldugumuzu beyan eden
               throws keyword yazmamiz yeterlidir

               throws FileNotFoundException :
               method deklarasyonuna ekledigimiz bu bolum
               riskin farkinda oldugumuzu soyler
               AMMA exception'i kontrol altina almaz

         */
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);





    }
}
