package day05_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements1 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        /*
        Eger if ile yazdigimiz bir kodda sadece 2 ihtimal varsa
        bu durumda if-else cumleleri kullaniriz
        tanimdan da anlayacagimiz uzere
        sadece iki ihtimal vardir
        ve sadece ikisinden biri calisir
        ikisinin birden calisma ihtimali --- YOKTUR
        hic birinin calismama ihtimali--- YOKTUR

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

         */


        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini tamsayi olarak giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Girilen kenar uzunluklari eskenar bir ucgen olusturur");
        }else {
            System.out.println("Girilen kenar uzunluklari eskenar bir ucgen olusturmaz");
        }
    }
}
