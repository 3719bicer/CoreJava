package day05_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements3 {
    public static void main(String[] args) {
        // saat 17:42
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar = scan.next().charAt(0);

        if (girilenChar >= 'a' && girilenChar <= 'z') {
            System.out.println((char) (girilenChar - 32));
        } else {
            System.out.println(girilenChar);
        }
    }
}
