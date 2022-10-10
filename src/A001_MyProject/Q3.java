package A001MyProject;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

         /*
         Kullanicidan isim ve soyismini ayri ayri alin
         ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
         soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        String isim=scan.nextLine(); // iki isim girebilir o yüzden nextLine ile alıyoruz.
        System.out.println("Lütfen soyisminizi giriniz :");
        String soyIsim=scan.nextLine();

        if(isim.length()>soyIsim.length()){
            System.out.println(isim.substring(0,1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.substring(0,1).toUpperCase() +
                    soyIsim.substring(1).toLowerCase());
        } else if (soyIsim.length()>isim.length() ) {
            System.out.println(isim.substring(0,1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.toUpperCase());
            
        }else if (isim.length()==soyIsim.length()){
            System.out.println("iki isim aynı uzunlıkta");
        }else {
            System.out.println("kritere uyugn isim girmediniz.");
        }

    }
}
