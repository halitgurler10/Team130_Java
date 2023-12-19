package day03_Scanner_dataCasting;

public class C05_Datacasting {

    public static void main(String[] args) {
        // kucuk data turundeki degeri buyuk data turundeki variable
        // atamak isterseniz java bunu otomatik olarak yapar buna auto widening denir. otomatik genisletme

        byte a = 15;

        short b = a;  // a  byte oldugu icin kabul eder

        int c = b;  // b nin data turu short oldugu icin kabul eder

        long d = c; // c  int oldugu icin kabul eder

        double e = d;


        // eger buyuk data turundeki degeri kucuk data turundeki variableaya atamak istersek
        // java bunu otomatik olarak yapmaz ,  sorumlulugu almamizi ister .
        // sorumluluk almak icin buyuk data turundeki degerin onune parantez icinde cevirmek istedigimiz kucuk
        // data turunu yarariz. explicit narrowing  (zorlayarak degistirme) daraltma

        double f = 34.5;

        int g = (int)f; // normalde java bunu kabul etmiyor ancak paeantez icinde int yazarsak kabul eder

        short h = (short) g ; // ayni durum  g yi short a ceviriyor

        byte k = (byte) h;

    }
}
