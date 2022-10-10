package A002_Team1;

import java.util.Scanner;

public class Q10_AdSoyad {

    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelime olarak ayirip,
    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");

        String adSoyad = scan.nextLine();

        // Levent Ozkul

        String ad = adSoyad.substring(0,adSoyad.indexOf(" ")); // Levent
        String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("Ad : " + ad + "\nSoyad : " + soyad);

    }
}
