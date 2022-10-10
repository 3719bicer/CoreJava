package day10_stringManipulations;

public class C03_replace {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.replace('J', 'j'));  // java ogren, isi kap
        System.out.println(str); // Java ogren, isi kap
        str=str.replace("isi","offer'i");
        // String'deki degisikligin kalici olmasi icin atama yapmaliyiz
        System.out.println(str); // Java ogren, offer'i kap
        System.out.println(str.replace("a","e")); // Jeve ogren, offer'i kep
        // replace method'u sarta uyan tum parcalari degistirir
        System.out.println(str.replace("ogren" , "k")); // Java k, offer'i kap
        System.out.println(str.replace("a","aaaa")); // Jaaaavaaaa ogren, offer'i kaaaap
        // tum a'lari silmek istesem
        System.out.println(str.replace("a","")); // Jv ogren, offer'i kp
        // olmayan bir metni deggistirmek istersek
        System.out.println(str.replace("Kemal","Ali")); // Java ogren, offer'i kap



        String str2="Java ogren, isi kap";
        System.out.println(str.replace('J', 'j'));
        System.out.println(str2);

        str2=str2.replace("isi","offer'i");
        //String teki değişikliğin kalıcı olması için atama yapmalıyız
        System.out.println(str2); // Java ogren, offer'i kap

        String str3="Herkesin github'ı olmalı";
        System.out.println(str3.replaceFirst("e", "a"));
        // harkesin github'ı olmalı

        System.out.println(str3.replaceFirst("\nw","1"));

        /*
        Regex (Regular Expressions)
        \\s : space \\S : space olmayan hersey \\s+ : yanyana birden fazla space
        \\d : digits \\D : digit olmayan hersey
        \\w : harf veya rakam \\W : harf veya rakam olmayan hersey

         */
    }
}
