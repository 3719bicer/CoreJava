package day14_methodCreation;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

        /*
          Basit bir islem merkezi olusturma
          Kullaniciya 4 tercih sunup istedigini gerceklestirecek 4 method olusturun
          1- girilen sayi asal sayi mi ?
          2- girilen sayi palindrome mu ?
          3- girilen sayiyi tam olarak bolen tamsayilarin adedi 5'den cok mu ?
          4- sayinin rakamlar toplami
          4 method'da string olarak sonucu donecek
          main method'da sonuc bir variable'a kaydedecek
          ve sonra yazdiracak
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen yapmak istediginiz islemi seciniz" +
                "\n1- Asal sayi mi?" +
                "\n2- Sayi palindrome mu?" +
                "\n3-tam bolen sayisi kac tane " +
                "\n4-Sayinin rakamlar toplami kac?");

        int tercih = scan.nextInt();
        String sonuc="";

        switch (tercih) {
            case 1 :
                sonuc = sayiAsalMi(sayi1);
                break;
            case 2 :
                sonuc = sayipalindromeMu(sayi1);
                break;
            case 3 :
                sonuc = tamBolensayisiBul(sayi1);
                break;
            case 4 :
                sonuc = rakamlarToplaminiBul(sayi1);
                break;
        }
        System.out.println("istediginiz sayi icin sonuc : " + sonuc);
    }
    public static String sayiAsalMi(int sayi1) {
        boolean sayiAsalMi = true;
        String sonuc = "";
        for (int i = 2; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                sonuc = "Girdiğiniz sayi asal sayi değil";
                sayiAsalMi = false;
                break;
            }
        }
        if (sayiAsalMi) {
            sonuc = "Girdiginiz sayi asal";
        }
        return sonuc;
    }
    public static String sayipalindromeMu(int sayi1){
        String sayiStr=sayi1+"";
        String tersSayi="";
        String sonuc="";
        for (int i = sayiStr.length()-1; i >= 0; i--) {
            tersSayi+=sayiStr.substring(i,i+1);
        }
        if (sayiStr.equals(tersSayi)){
            sonuc="Sayi Palindrome";
        }else {
            sonuc="Sayi palindrome degil";
        }
        return sonuc;
    }
    public static String tamBolensayisiBul(int sayi1) {
        int tamBolenSayisi=0;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i ==0) {
                tamBolenSayisi++;
            }
        }
        {
        }
        return tamBolenSayisi+"";
    }
    public static String rakamlarToplaminiBul(int sayi1) {
        String sayiStr = sayi1 + "";
        int basSayisi = sayiStr.length();
        int birlerBas = 0;
        int rakamlarTop = 0;
        for (int i = 1; i <= basSayisi; i++) {
            birlerBas = sayi1 % 10;
            rakamlarTop += birlerBas;
            sayi1 = sayi1 / 10;
        }
        return rakamlarTop + "";
    }

    static class C01_kendiSubstringMethodumuz {

        public static void main(String[] args) {

            String str= "Java Candir";

            /*
             kullanicidan input olarak verilen
             baslangic ve bitis indexlerine gore
             baslangic index'i dahil, bitis index'i haric olacak sekilde
             aradaki harfleri yazdirin
             kullanici baslangic degeri olarak,
             bitis degerinden buyuk bir sayi girerse, hata mesaji verin
             kullanici str'da olan index'lerden daha buyuk bir index girerse
             hata mesaji yazdirin
             */

            int basIndex=2;
            int bitIndex=6;
            kendiSubstringMethodumuz(str,basIndex,bitIndex);
            kendiSubstringMethodumuz(str,3,5);
            kendiSubstringMethodumuz(str,0,1); // J
            kendiSubstringMethodumuz(str,-2,3); // hata mesaji

            System.out.println(str.substring(2,6));
            String yeniStr=str.substring(1,4); // ava

            // kendi substring methodumuzu bize String dondurecek sekle getirelim

            System.out.println(stringDondurenKendiSubstringMethodumuz(str,0,1)); // J
            String ilkHarf=stringDondurenKendiSubstringMethodumuz(str,0,1);
        }


        public static void kendiSubstringMethodumuz(String str, int basIndex, int bitIndex) {
            if (basIndex>bitIndex){
                System.out.println("Baslangic indexi, bitis index'inden buyuk olamaz");
            } else if (basIndex<0 || basIndex>str.length()-1 || bitIndex<0 || bitIndex>str.length()-1){
                System.out.println("Gecersiz index kullanimi");
            }else {
                for (int i = basIndex; i <bitIndex ; i++) {
                    System.out.print(str.charAt(i)+"");
                }
            }
            System.out.println("");
        }


        public static String stringDondurenKendiSubstringMethodumuz(String str, int basIndex, int bitIndex){
            String istenenSubstring="";
            if (basIndex>bitIndex){
                System.out.println("Baslangic indexi, bitis index'inden buyuk olamaz");
            } else if (basIndex<0 || basIndex>str.length()-1 || bitIndex<0 || bitIndex>str.length()-1){
                System.out.println("Gecersiz index kullanimi");
            }else {
                for (int i = basIndex; i <bitIndex ; i++) {
                    istenenSubstring+=str.charAt(i);
                }
            }
            return istenenSubstring;
        }
    }
}