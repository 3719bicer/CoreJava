package day02_scanner_dataCasting;

import java.util.Scanner;

public class C12_ExampleDataCasting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128 ile 127
        //arasindaki bir sayiya donusturup yazdirin.

        /*
        System.out.println("Bir sayi giriniz : ");

        double sayi;
        sayi=scan.nextDouble();
        byte yeniSayi=(byte) sayi;

        System.out.println("Yeni sayi : " + yeniSayi);
         */


        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun
        //tamsayi kismini yazdirin.

        /*
        System.out.println("iki adet double sayi giriniz: ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double bölüm=sayi1/sayi2;

        int sonucSayi=(int) bölüm;

        System.out.println("Bölüm sonucu " + sonucSayi);
        */


        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        /*
        System.out.println("Bir adet double, 1 adet tamsayi giriniz: ");
        double sayi1=scan.nextDouble();
        int sayi2=scan.nextInt();
        double bölüm=sayi1/sayi2;

        int sonucSayi=(int) bölüm;

        System.out.println("Bölüm sonucu " + sonucSayi);
        */

        int a=10;
        int b=++a;

        System.out.println(a);
        System.out.println(b);

    }
}
