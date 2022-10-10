package day10_stringManipulations;

import java.util.Scanner;

public class C06_sekerExercise {
    public static void main(String[] args) {

        /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;

         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)

        */

        // Kullanicidan verileri al

        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");

        double cay = scan.nextDouble();

        System.out.println("1 bardak cay icin kac kup seker tuketiyorsunuz?");

        double seker = scan.nextDouble();

        // Seker tuketimini hesapla

        double yillikTuketim = cay * seker * 2.77 * 365 / 1000 ;
        double kirkYillikTuketim = yillikTuketim * 40;

        int yillikTuketimInt =(int) yillikTuketim;
        int kirkYillikTuketimInt =(int) kirkYillikTuketim;

        if (seker==0){
            System.out.println("Aferin, boyle devam et :)");
        }else if(seker>0 && cay>0){
            System.out.println("Yillik seker tuketiminiz : " + yillikTuketimInt);
            System.out.println("40 Yillik seker tuketimiz : " + kirkYillikTuketimInt);
        }else{
            System.out.println("Hatali giris yaptiniz");
        }
        scan.close();

    }
}
