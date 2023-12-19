package day16_MetodOlusturmaVeMetodOverloading;

public class C03_StringMetodlari {

    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalim";


        str.toLowerCase();  // metni kucuk harfe cevirir
        // ama yazdirmadigimiz veya atama yapamadigimiz icin
        // bosa calismis olur


        C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Asli","Nehaber");


        // bize birsey döndüren method'lari ya uygun bir variable'a atamaliyiz
        // veya direk olarak yazdirmaliyiz
        // aksi takdirde method calisir, bize sonucu döndürür (getirir)
        // ama kullanmadigimiz icin havaya ucar


        // bu metod void oldugundan
        // sadece cagirabilirim

        C01_voidMetodOlusturma.kisiBilgileriYazdir("Ayse", "Hanci" , "1234567890123456");
        //isim : Ays* Han**
        //kart no: **** **** **** 3456


        C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal", "Yanci");
        // bu metod bana metod'da donusturulen halini dondurur.(getirir)
        // K**** Y****
        // ama yazdirmazsak konsolda birsey goremeyiz


        String donusmusIsim = C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal", "Yanci");

        System.out.println(donusmusIsim);  //K**** Y****  amac yazdirmaksa yazdirilabilir





    }

}
