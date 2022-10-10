package A002_Team1;

import java.util.Scanner;

public class Q5_DortIslem {

    public static void main(String[] args) {

        /*
         Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         dort islemden biri ile isleme koyup sonucunu yazdiriniz
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki adet sayı giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        System.out.println("Lutfen gerçekleştirmek istediğiniz işlem için aşağıdaki karakterlerden birini giriniz" +
                "\nToplama için +\nCıkarma için -\nBolme için /\nÇarpma için *");
        String islem= scanner.next();
        if (islem.equals("+")){
            System.out.println("işleminizin sonucu : " +(sayi1+sayi2));
        } else if (islem.equals("-")) {
            System.out.println("işleminizin sonucu : " + (sayi1-sayi2));
        } else if (islem.equals("/")) {
            System.out.println("işleminizin sonucu : " + (sayi1/sayi2));
        }else if (islem.equals("*")) {
            System.out.println("işleminizin sonucu : " + (sayi1*sayi2));
        } else {
            System.out.println("yanlış veri girdiniz; lütfen kontrol ediniz");
        }

    }
}