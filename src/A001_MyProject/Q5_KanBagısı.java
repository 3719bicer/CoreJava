package A001MyProject;

import java.util.Scanner;

public class Q5_KanBagısı {
    public static void main(String[] args) {


        /*
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz :");
        int yas=scan.nextInt();
        System.out.println("Lütfen kilonuzu giriniz :");
        double kilo=scan.nextDouble();

        if (yas<18 && kilo<50){
            System.out.println("Yasınız ve kilonuz kriterlere uygun değildir.Kan bagısı yapamazsınız.");
        } else if (yas>=18 && kilo<50) {
            System.out.println("Kilonuz 50'den az old. için Kan bagısı yapamazsınız.");
        } else if (yas>=18 && kilo>=50) {
            System.out.println("Kan bagısı yapmaya hazırsınız.");
        } else if(yas<18) {
            System.out.println("Yasınız 18 den küçük.Kan bagısı yapamazsınız.");
        } else {
            System.out.println("Girilen degerler kriterlere uygun değil");
        }
    }
}
