package day02_scanner_dataCasting;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenarının uzunluğunu giriniz : "
        + "\nDikdörtgenin uzun kenarının uzunluğunu giriniz :");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();

        System.out.println("Dikdörtgenin Alanı : "+ kenar1*kenar2);

    }
}
