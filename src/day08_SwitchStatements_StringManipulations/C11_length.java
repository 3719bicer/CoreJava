package day08_SwitchStatements_StringManipulations;

public class C11_length {
    public static void main(String[] args) {

        // String kac karakterden olustugunu(uzunluk) bize dondurur

        String str= " Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); // 35

        // bu string'in son karakterini yazdirin
        System.out.println(str.charAt(str.length()-1)); // u

        // sondan 3.karakteri yazdirin
        System.out.println(str.charAt(str.length()-3)); // g




        /*
        String ben="Java Güzeldir ama ";
        String sen=" doyamadım ";
        String sen3=" Doyamadım ";


        System.out.println(ben.toLowerCase());
        System.out.println(ben.toUpperCase());
        System.out.println(sen.equals(sen3));
        System.out.println(sen.equalsIgnoreCase(sen3));
        System.out.println(ben.charAt(5));
        System.out.println(ben.length());
        System.out.println(ben.substring(13));
        System.out.println(ben.substring(5,ben.length()-5));

        System.out.println(sen3 + "kelimesinini sondan yazılımı :");
        String tersten = sen3.substring(10,sen3.length())+sen3.substring(9,10)+
                sen3.substring(8,9) + sen3.substring(7,8) +
                sen3.substring(6,8) + sen3.substring(5,6) +
                sen3.substring(4,5) + sen3.substring(3,4) +
                sen3.substring(2,3) + sen3.substring(1,2) +
                sen3.substring(0,1) ;
        System.out.println(tersten);
         */

    }
}
