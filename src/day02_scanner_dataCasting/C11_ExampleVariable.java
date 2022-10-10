package day02_scanner_dataCasting;

import java.util.Scanner;

public class C11_ExampleVariable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.

        /*

        System.out.println("Lütfen Yasinizi Griniz : ");
        int sayi=scan.nextInt();

        System.out.println("Lütfen Isminizi Griniz : ");
        String kelime=scan.next();

        System.out.println("Girilen Isim ve Yas Dogru mu? : ");
        boolean dogruMu=scan.nextBoolean();

         */


        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        /*

        System.out.println("LÜtfen isminizi giriniz:");
        char isimIlkharf=scan.nextLine().charAt(0);
        System.out.println("LÜtfen soyisminizi giriniz:");
        String soyIsim=scan.nextLine();
        System.out.println("LÜtfen yasinizi giriniz:");
        int yas=scan.nextInt();

        System.out.println("Girilen bilgiler : " + isimIlkharf + " " + soyIsim + ", " + yas);

         */


        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.(pi=3 alınız.)

        System.out.println("Cemberin yarıcapini giriniz : ");

        double yaricap;
        yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : " + 2*3*yaricap);
        System.out.println("Cemberin alanı : " + 3*yaricap*yaricap);



    }
}
