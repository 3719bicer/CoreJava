package day12_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir sayi alip
        // sayinin rakamlar toplamini yazdirin

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi= scan.nextInt(); // 1265
        int ilkGirilenSayi=sayi;

        // islemin kac kere tekrar edilecegini bulmak icin
        // basamak sayisina ihtiyacim var

        String sayiStr=sayi+"" ;
        int basSayisi= sayiStr.length();
        int birlerBas=0;
        int rakamlarToplami=0;

        for (int i = 1; i <=basSayisi ; i++) {
            birlerBas=sayi % 10;            // birler basamagini verir
            rakamlarToplami+=birlerBas;     // birler basamagini rakamlar toplamina ekler
            sayi=sayi/10;                   // isimizin bittigi birler basamagini yok eder
        }
        System.out.println("Rakamlar toplami : " + rakamlarToplami);
        */


        // Kullanicidan pozitif bir sayi alip
        // sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi= scan.nextInt();

        String str= sayi+"";
        int rakamStr=str.length();
        int birlerbas=0;
        int toplam=0;

        for(int i=1; i<=rakamStr; i++){
            birlerbas=sayi%10;
            toplam+=birlerbas;
            sayi=sayi/10;
        }
        System.out.println("Toplam :" + toplam);
    }
}
