package day04_Operators;

import java.util.Scanner;

public class C04_IfStatements2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        /*
        O Ocak
        S Subat
        M Mart,Mayıs
        N Nisan
        H Haziran
        T Temmuz
        A Agustos,Aralık
        E Eylül,Ekim
        K Kasım
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz :");
        char harf=scan.next().charAt(0);

        if (harf=='O' || harf=='o') System.out.println("aylardan OCAK");
        if (harf=='S' || harf=='s') System.out.println("aylardan SUBAT");
        if (harf=='M' || harf=='m') System.out.println("aylardan MART veya MAYIS");
        if (harf=='N' || harf=='n') System.out.println("aylardan NİSAN");
        if (harf=='H' || harf=='h') System.out.println("aylardan HAZİRAN");
        if (harf=='T' || harf=='t') System.out.println("aylardan TEMMUZ");
        if (harf=='A' || harf=='a') System.out.println("aylardan AGUSTOS");
        if (harf=='E' || harf=='e') System.out.println("aylardan EYLUL veya EKIM");
        if (harf=='K' || harf=='k') System.out.println("aylardan KASIM");

    }
}
