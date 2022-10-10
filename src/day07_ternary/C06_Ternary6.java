package day07_ternary;

import java.util.Scanner;

public class C06_Ternary6 {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        /*
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        // 5 ==>5   -6 ==> -1* -6 =6
        sayi= sayi>=0 ? sayi : -1*sayi ;
        System.out.println("Girilen sayinin mutlak degeri : " + sayi);

         */

        //Soru 4-kullanıcıdan notunu alın 50 veya daha büyükse "sınıfı geçtin",
        //50 den küçükse "maalesef kaldın" yazdırın.

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen notunuzu giriniz :");
        double not=scan.nextDouble();

        System.out.println(not>=50 ? "Sınıfı geçtin" : "maalesef kaldın");

         */

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen iki sayı giriniz :");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println(sayi1 > sayi2 ? "büyük olan sayı :" + sayi1 : "büyük olan sayı :" + sayi2);
        */

        /*
        int a=11;
        int x=10;
        int y=15;

        int z = a>0 ?y++ : --x;
        System.out.println(z);
        System.out.println(x +", " + ", " + y + ", " + z) ;
         */


        /*
        Kullanıcıdan bir tam sayı alınız.
        Sayi pozitifse, çift sayi veya çift sayi değil seçeneklerinden uygun olanı,
        Sayi pozitif değilse, 3 basamaklı veya 3 basamaklı değil seçeneklerinden uygun olanını
        yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen bir tamsayı giriniz :");
        int sayi=scan.nextInt();

        String sonuc= sayi>0 ?                                     //Şart
                (sayi%2==0 ? "Çift sayi " : "Çİft sayi değil") :       //şart doğru ise çalışacak
                (sayi<=-100 && sayi>=-999 ? "3 basamaklı" : "3 basamaklı değil") ;  //şart doğru değilse çalışmayacak

    }
}
