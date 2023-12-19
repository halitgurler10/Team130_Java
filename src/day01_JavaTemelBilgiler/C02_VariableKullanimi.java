package day01_JavaTemelBilgiler;

public class C02_VariableKullanimi {
    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi);  // 20

        sayi  = 30;

        System.out.println(sayi); //30

        sayi= sayi + 10;

        System.out.println(sayi); //40

        sayi = 2 * sayi + 5;

        System.out.println(sayi); // 85

        boolean  bl  = true;
        char chr = 'G';
        String  str = "Java Candir";
        int  sy = 45;
        double dbl = 5.6;

        int not;

        not = 90;
        not = (not + 80)/2;

        System.out.println(not);  // 85


        //ortalama bu sekildede yazilabilir
        int not1=80, not2=55, ortNot=(not1+not2)/2;
        System.out.println("ortNot = " + ortNot);  // ortNot=67







    }


}


