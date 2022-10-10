package day04_Operators;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati”
        //yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz :");
        int girilenSayi=scan.nextInt();

        if (girilenSayi %5==0){
            System.out.println("Sayi 5’in tam kati");
        }

        System.out.println("Girilensayi 5'in katı dedildir.");
    }
}
