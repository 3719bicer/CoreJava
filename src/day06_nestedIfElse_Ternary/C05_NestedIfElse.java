package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {

         /*
        Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun.
        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Toplam indirim miktari ve odenecek tutari yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen almak istediginiz urunun \nadedini \nVe fiyatini giriniz");
        int adet = scan.nextInt();
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri karti varsa E, yoksa H tusuna basiniz");
        char kart = scan.next().toUpperCase().charAt(0);
        // aldigi urun sayisina gore ana iskeleti kuralim

        double toplamsatistutari = adet * listeFiyati;
        double yapilanIndirimTl = 0;
        double odenecekPara = 0;

        if (adet <= 0) {
            System.out.println("Teşekkür ederiz İyi günler.");

        } else if (kart == 'H') {
            if (adet >= 10) {
                System.out.println("Toplam tutar :" + toplamsatistutari
                        + "\nİndirim Miktarı :" + toplamsatistutari * 15 / 100
                        + "\nÖdenecek Tutar : " + (toplamsatistutari - toplamsatistutari * 15 / 100));
            } else {
                System.out.println("Toplam tutar :" + toplamsatistutari
                        + "\nİndirim Miktarı :" + toplamsatistutari * 10 / 100
                        + "\nÖdenecek Tutar : " + (toplamsatistutari - toplamsatistutari * 10 / 100));
            }

        } else if (kart == 'E') {
            if (adet >= 10) {
                System.out.println("Toplam tutar :" + toplamsatistutari
                        + "\nİndirim Miktarı :" + toplamsatistutari * 20 / 100
                        + "\nÖdenecek Tutar : " + (toplamsatistutari - toplamsatistutari * 20 / 100));
            } else {
                System.out.println("Toplam tutar :" + toplamsatistutari
                        + "\nİndirim Miktarı :" + toplamsatistutari * 15 / 100
                        + "\nÖdenecek Tutar : " + (toplamsatistutari - toplamsatistutari * 15 / 100));
            }
        } else {
            System.out.println("Kart bilgisi yanlış");
        }

    }
}