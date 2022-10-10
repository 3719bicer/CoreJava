package day05_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements5 {
    public static void main(String[] args) {
         /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        /*

        System.out.println("Çevirmek istediğiniz mesafeyi km olrak yazınız :");
        int mesafeKm=scan.nextInt();

        System.out.println("çevirmek isttediğiniz birimi seciniz :" + "\nM : Metre \nS :Santimetre ");

        char birim=scan.next().charAt(0);

        if (birim=='M' || birim=='m'){
            System.out.println("Mesafenin metre olarak karşılığı :" + mesafeKm*1000);
        } else if (birim=='S' || birim=='s') {
            System.out.println("Mesafenin santimetre olarak karşılığı :" + mesafeKm*100000);
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
        */


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen”
        //yazdirin, degilse “Eskenar degil” yazdirin.

        /*
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else System.out.println("Eskenar degil");
        */


        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin, yoksa emekli
        //olmasi icin calismasi gereken yil sayisini yazdirin.

        System.out.println("Lütfen yasını giriniz :");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else System.out.println("Calismnız gereken yıl sayısı :" + (65-yas));
    }
}
