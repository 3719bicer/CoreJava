package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {
        //Soru 7 (Interview)-Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen 1.tamsayıyı giriniz : ");
        int sayi1=scan.nextInt();
        System.out.println("LÜtfen 2.tamsayıyı giriniz : ");
        int sayi2=scan.nextInt();

        System.out.println("Girilen Değerler \nsayi1 : "+ sayi1
        + "\nsayi2 : " + sayi2);

        int sayi3;

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("Değişimden sonra sayi1 : " + sayi1
        + "\nDeğişimden sonra sayi2 : " + sayi2);


    }
}
