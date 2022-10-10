package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Isminizi Giriniz : ");
        String isim=scan.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz : ");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen Yasinizi Giriniz : ");
        int yas=scan.nextInt();

        System.out.println("Ismınız : " + isim + "\nSoyisminiz : " + soyisim + "\nYasiniz :" + yas);

        /*
        System.out.println("Ismınız : " + isim
         + "\nSoyisminiz : "
         + soyisim
         + "\nYasiniz :"
         + yas);

         Kodların aynı satırda olmasına gerek yok.
         Java bir satırda çalışmak zorunda değildir.
         Parantezin ( başından başlar ) sonuna kadar okur.
         Java bir kodun bittiğini (;) de anlar.(;) e kadar okuma yapar.

         Java için (+) lar arasındaki boşlukların hiçbir önemi yoktur.
         Önemli olan (" ") içindeki boşluklardır.
          */

        System.out.println("Kaydınız Basariyla Tamamlanmıştır.");

        /*
        String ile scan.next() ve scan.nextLine() kullanılabilir.
        next() sadece ilk space' e kadar olan kısmı alırken
        nextLine() tüm satırı alır.

        Arka arka birden fazla kullanıcıdan String değeri kullanıcıdan alınacaksa
        hata olmaması için nextLine() kullanılması daha iyi olur.
         */

    }
}
