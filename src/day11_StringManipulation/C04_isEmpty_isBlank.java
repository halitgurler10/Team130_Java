package day11_StringManipulation;

public class C04_isEmpty_isBlank {
    public static void main(String[] args) {

        // empty bos mu diye soruyor

        String str1 = "";
        String str2 = "      ";
        String str3 = "a b";

        System.out.println(str1.isEmpty());  // true
        System.out.println(str2.isEmpty());  // false
        System.out.println(str3.isEmpty());  // false


        // isBlank bosluklardan mi olusmus diye soruyor

        System.out.println(str1.isBlank());  // false
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // false


    }
}
