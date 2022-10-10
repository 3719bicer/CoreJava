package A001MyProject;

import java.util.Scanner;

public class Q6_UcakBileti {
    public static void main(String[] args) {

        /*
        A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        km birim fiyati : 0.10$
        12 yasindan kucukse toplam fiyat %50 indirim
        12 ve 24 age arasindyaysa 10% indirim
        65 yasindan buyukse 30% indirim
        gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
        bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini hesaplayan program yazınız
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz :");
        int age = scan.nextInt();
        System.out.println("Bilet i tek yön almak için 0'ı, çift yön almak için 1'i seciniz.");
        int flightType = scan.nextInt();
        System.out.println("Lütfen gideceğiniz şehri seçiniz :" +
                "\n\tB sehri için :" + "B" +
                "\n\tC sehri için :" + "C" +
                "\n\tD sehri için :" + "D" + " \n\tyi seçiniz.");
        String city = scan.next().toLowerCase();
        int toplamFiyat;

        if (!(flightType==0 && flightType==1)){
            System.out.println("flightType kriterini tekrar giriniz");

        if (flightType == 1) {
            if (city.equalsIgnoreCase("B")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.50 * 20 / 100));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.10 * 20 / 100));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 20 / 100));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.30 * 20 / 100));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }
            } else if (city.equalsIgnoreCase("C")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.50 * 20 / 100));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.10 * 20 / 100));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 20 / 100));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.30 * 20 / 100));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }
            } else if (city.equalsIgnoreCase("D")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.50 * 20 / 100));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.10 * 20 / 100));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 20 / 100));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.30 * 20 / 100));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }

            }
        } else if (flightType == 0) {
            if (city.equalsIgnoreCase("B")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.50));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.10));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 500 * 0.30));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }
            } else if (city.equalsIgnoreCase("C")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.50));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.10));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 700 * 0.30));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }
            } else if (city.equalsIgnoreCase("D")) {
                if (age <= 12) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.50));
                } else if (age > 12 && age <= 24) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.10));
                } else if (age > 24 && age <= 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900));
                } else if (age > 65) {
                    System.out.println("Toplam fiyat :" + (0.10 * 900 * 0.30));
                } else {
                    System.out.println("Yasınız tekrar giriniz.");
                }
            }
        }
        }
    }
}