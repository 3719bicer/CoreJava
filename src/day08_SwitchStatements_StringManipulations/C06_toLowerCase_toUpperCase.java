package day08_SwitchStatements_StringManipulations;

import java.util.Locale;

public class C06_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        // String'i istedigimiz sekilde buyuk harf veya kucuk harfe cevirebiliriz.

        String str= "Java candir";
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java candir

        // eger kalici olarak degisiklik yapmak istersek, atama yapmaliyiz.

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // Java candir

        // eger buyuk kucuk harf cevirirken, bir dile gore yapmak isterseniz.

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toLowerCase(Locale.GERMAN)); // java candır
        str=str.toLowerCase(); // java candir
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // JAVA CANDIR
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); //JAVA CANDİR

    }
}
