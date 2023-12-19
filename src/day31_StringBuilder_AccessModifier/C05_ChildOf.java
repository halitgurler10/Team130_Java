package day31_StringBuilder_AccessModifier;

public class C05_ChildOf {

    public static void main(String[] args) {

         /*
            ayni package icinde
            farkli bir class'dayiz
            ama child class'dayiz
         */
        C04_AccessModifier obj = new C04_AccessModifier();
        // System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        obj.sayiDefault=30;
        System.out.println(obj.blProtected);
        obj.blProtected= true;
        obj.methodPublic();
    }
}
