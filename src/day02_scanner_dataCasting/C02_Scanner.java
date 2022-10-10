package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //kullanıcan bir sayı alıp sayının küpünü yazdıralım.
        //1.adım : scanner objesi oluşturmak.
        Scanner scan= new Scanner(System.in);
        //2.adim : kullanıcadan ne sitediğimizi kullanıcıya söyleyelim.
        System.out.println("Lütfen bir tam sayı giriniz :");
        //3.adım : istediğimiz datayı koyabileceğimiz bir variable oluşturup
        //         kullanıcının giridiği değeri uygun metod'la alalım
        //         ve oluşturdupumuz variable'a atayalım.

        int girilenSayi= scan.nextInt();
        System.out.println("Girdiğiniz sayının küpü : " + girilenSayi*girilenSayi*girilenSayi);
    }
}
