package A002_Team1;

import java.util.Scanner;

public class Q2_KanBagisi {


        /*
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 weight dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Lutfen yasinizi giriniz : ");
            int age = scan.nextInt();
            System.out.print("lütfen kilonuzu giriniz : ");
            int weight = scan.nextInt();


            if ( age>0 && age < 18) {
                System.out.println("Resit olmayanlar kan bagisi yapamaz.");
            } else if (age >= 18) {
                if (weight > 0 && weight < 50) {
                    System.out.println("Kilonuz 50'den az oldugu icin kan bagisi yapamazsiniz");
                } else if (weight >= 50) {
                    System.out.println("Kan bagisi yapabilirsiniz");
                } else {
                    System.out.println("Yanlis bir deger girdiniz");
                }
            } else {
                System.out.println("Yanlis bir deger girdiniz");
            }

        }
}
