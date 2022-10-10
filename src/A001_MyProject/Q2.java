package A001MyProject;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*
          Kullanicinin String olarak verdigi iki fiyati
          toplayabilen bir kod yaziniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. rakamı giriniz :");
        String rakam1=scan.next();
        System.out.println("Lütfen 2. rakamı giriniz :");
        String rakam2=scan.next();


        rakam1=rakam1.replaceAll("\\D","");
        rakam2=rakam2.replaceAll("\\D","");

        String toplmaRakam=rakam1+rakam2;
        System.out.println("toplamfiyat :" + toplmaRakam );

        double fiyat1=Double.parseDouble(rakam1);
        double fiyat2=Double.parseDouble(rakam2);

        double toplamFiyat=(fiyat1+fiyat2)/100;
        System.out.println("Toplam fiyat :" + toplamFiyat);



    }
}
