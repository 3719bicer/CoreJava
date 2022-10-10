package day10_stringManipulations;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ismini, soyismini ve KK numarsını alıp
        asagıdaki formatta kaydedip, yazdıralım.an

        M****** T*****
        1234 **** **** ****
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz :");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen KK numaranızı giriniz :");
        String kkNo=scan.nextLine();

        String yenIisim=isim.substring(0,1).toUpperCase() +
                        isim.substring(1).replaceAll("\\w","*") +
                        " " +
                        soyisim.substring(0,1).toUpperCase() +
                        soyisim.substring(1).replaceAll("\\w","*");
        String yeniKknu=kkNo.substring(0,4) + " **** **** ****";

        System.out.println(yenIisim + "\n" + yeniKknu);
    }
}
