package day11_stringManipulations_forLoop;

public class C09_WrapperClass {
    public static void main(String[] args) {

        /*
        String non-primitive old. için birçok faydalı hazır method u old. gördük.
        primitive data türlerinini hazır methodları olmaz.

        java eksikliği gidermek için primitive data trlerinin herbirine ozel Wrapper Class hazırlamısştır.
        Bu class larda o data türü için kulllanabileceğimiz bazi hazır methodlar oluşturulmuştur.
         */

        String str="java muhtesem";
        int sayi=10;
        Integer sayiw=20;
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.max(34,465)); //465

        boolean kontrol=true;
        boolean kont=false;
        String knt="falce";
        boolean sonuc=Boolean.valueOf(knt);
        char chr='*';
        Character ch='p';
        System.out.println(Character.MAX_VALUE); //￿
        System.out.println(Character.getType('a')); //2
        System.out.println(Character.isAlphabetic('9')); //false
    }
}
