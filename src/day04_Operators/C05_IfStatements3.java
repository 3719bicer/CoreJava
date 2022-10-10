package day04_Operators;

import java.util.Scanner;

public class C05_IfStatements3 {
    public static void main(String[] args) {

        /*

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen”
        //yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Ucgenin kenar uzunluklarını giriniz :");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3) System.out.println("Eskenar ucgen");

        //kenar1==kenar2==kenar3 ==>HATALI : Java üclü esitlik konrolüü yapamaz.

        */


        /*
        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”, 5 ile
        //bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        System.out.println("Bir sayi giriniz :");
        int sayi=scan.nextInt();

        if (sayi%3 ==0){
            System.out.println("3 ile bölünebilen sayi");
        }
        if (sayi%5==0) System.out.println("5 ile bölünebilen sayi");

         */

        /*

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50){
            System.out.println("Sinifi gectin");
        }
        if (not<50) {
            System.out.println("Maalesef kaldin");

        }

         */


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
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

    }
}
