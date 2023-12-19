package day35_InheritanceDataTypeKullanimi;

import java.util.ArrayList;
import java.util.List;

public class C07_Runner {
    /*
        EGER ozellikler method olarak olusturuldu ise
        objenin tasidigi ozellikleri belirlemek icin
        Data Turunun yaninda Constructor'da etkili olur

        Bir objenin istenen ozelligi tasiyip tasimadigini
        Data Turu belirler

        O ozelligin daha guncel degerinin olup olmadigi ise
        constructor'a baglidir

        Java, Objenin ozelligini  bulunduktan sonra
        constructor'in oldugu class'a kadar
        daha guncel bilgi olup olmadigini kontrol eder
        ve daha guncel bilgi bulursa onu kullanir

     */

    public static void main(String[] args) {

        C06_AvciKuslar avciKus1 = new C06_AvciKuslar();
        // constaructor ile variable ayni ise variable ile metod arasinda bir fark yoktur

        avciKus1.omur(); // yasar ve olur H
        avciKus1.solunum(); // akciger K
        avciKus1.cogalma(); // yumurta K
        avciKus1.kanat(); // kanatlidir K
        avciKus1.hareket(); // ucarlar AVK
        avciKus1.beslenme(); // et AVK
        avciKus1.gaga(); // sivri gagalidir AVK
        avciKus1.pence(); // pencelidir AVK


        C05_Kuslar avciKus2 = new C06_AvciKuslar();
        //constructor C03_AvciKuslar() data turu ise C02_Kuslar ,. aramaya data turunden baslar

        avciKus2.omur(); // yasar ve olur H
        avciKus2.solunum(); // akciger K
        avciKus2.cogalma(); // yumurta K
        avciKus2.kanat(); // kanatlidir K
        avciKus2.hareket(); // ucarlar AVK  //daha guncel oldugu icin bunu kullanir
        avciKus2.beslenme(); // et AVK
        avciKus2.gaga(); // sivri gagalidir AVK
        // avciKus2.pence(); // CTE


        C04_Hayvanlar avciKus3 = new C06_AvciKuslar();
        // Aramaya hayvanlar classindan basladigi icin kanat gaga pence ozellikleri bu cass da olamayip
        // diger class larda oldugu icin CTE veriyor onu guncellemek icin oraya gitmiyor

        avciKus3.omur(); // yasar ve olur H
        avciKus3.solunum(); // akciger K
        avciKus3.cogalma(); // yumurta K
        // avciKus3.kanat(); // CTE
        avciKus3.hareket(); // ucarlar AVK
        avciKus3.beslenme(); // et AVK
        // avciKus3.gaga(); // CTE
        // avciKus3.pence(); // CTE


        C05_Kuslar kus1 = new C05_Kuslar();
        // const kuslar oldugu icin avci kuslara hic gitmeyecek
        // cosn oldugu yere kadar gider

        kus1.omur(); // yasar ve olur H
        kus1.solunum(); // akciger K
        kus1.cogalma(); // yumurta K
        kus1.kanat(); // kanatlidir K
        kus1.hareket(); // hareket ederler H
        kus1.beslenme(); // beslenirler H
        kus1.gaga(); // gagalidir K
        // kus1.pence(); // CTE


        C04_Hayvanlar kus2 = new C05_Kuslar();
        //hayvanlar class inda kanat ozelligi olmadigi icin CTE verir.
        // yani aramaya basladigi calss da o ozelligin olmasi gerekiyor
        // o ozellik varsa contructorun oldugu yere kadar gider

        kus2.omur(); // yasar ve olur H
        kus2.solunum(); // akciger K
        kus2.cogalma(); // yumurta K
        // kus2.kanat(); // CTE
        kus2.hareket(); // hareket ederler H
        kus2.beslenme(); // beslenirler H
        // kus2.gaga(); // CTE
        // kus2.pence(); // CTE


        C04_Hayvanlar hayvan1 = new C04_Hayvanlar();
        // ilk bastaki data turu   diger C04 Hayvanlar ise objedir
        //data turu hayvanlar contc hayvanlar oldugu icin
        // aramayi sadece bu sinif icinde yapacak

        hayvan1.omur(); // yasar ve olur H
        hayvan1.solunum(); // nefes alir H
        hayvan1.cogalma(); // cogalir H
        // hayvan1.kanat(); // CTE
        hayvan1.hareket(); // hareket ederler H
        hayvan1.beslenme(); // beslenirler H
        // hayvan1.gaga(); // gagalidir K
        // hayvan1.pence(); // CTE
    }
}
