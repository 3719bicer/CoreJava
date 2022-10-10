package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin?


        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz : ");
        int tamsayi= scan.nextInt();

        System.out.println("Lütfen bir ondalıklı sayı giriniz : ");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("Girilen sayıların carpımı : " + (tamsayi*ondalikliSayi));
        System.out.println("Girilen sayıların toplamı : " + (tamsayi+ondalikliSayi));

    }
}
