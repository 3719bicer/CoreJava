package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_CharYazdırma {
    public static void main(String[] args) {

        //Sorular ( Data Casting )
        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char girilenHarf = scan.next().charAt(0);

        System.out.println("Girilen Harf : " + girilenHarf);

        /*
        char birsonrakiHarf=(char) (girilenHarf+1);
        char ikisonrakiHarf=(char) (girilenHarf+2);
        char ücsonrakiHarf=(char) (girilenHarf+3);

        System.out.println("Girilen harften 1 sonraki Harf : " + birsonrakiHarf);
        System.out.println("Girilen harften 2 sonraki Harf : " + ikisonrakiHarf);
        System.out.println("Girilen harften 3 sonraki Harf : " + ücsonrakiHarf);
        */

        System.out.println("Girilen harften 1 sonraki Harf : " + (char)(girilenHarf+1));
        System.out.println("Girilen harften 2 sonraki Harf : " + (char)(girilenHarf+2));
        System.out.println("Girilen harften 3 sonraki Harf : " + (char)(girilenHarf+3));
    }
}
