package day05_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements2 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini
        //yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);

        if (girilenChar>='A' && girilenChar<='Z'){
            System.out.println("Girirlen karekter büyük harftir.");
        }else {
            System.out.println("Girirlen karekter büyük harf degildir.");
        }
    }
}
