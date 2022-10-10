package day09_StringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //yazdirin.

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz :");
        String mail=scan.nextLine();

        if (!mail.contains("@") ){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        } else if(!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazım hatası var");
        }else {
            System.out.println("Bilgileriniz başarı ile kaydedildi.");
        }
        */




        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir string  ifade giriniz :");
        String cumle=scan.next().toLowerCase();

        System.out.println("Lütfen aranmasını istediğiniz ifadeyi giriniz :");
        String kelime=scan.next().toLowerCase();

        int kere=cumle.indexOf(kelime);

        if(!cumle.contains(kelime)){
            System.out.println("cumle aranan kelimeyi içermiyor");
        }else if(kere==1){
            System.out.println("cümle aranan kelimeyi içeriyor");
        }else{
            System.out.println("girilen string ifade hatalı");
        }


    }
}
