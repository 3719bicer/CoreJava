package day39_exceptions;

public class C02_Final {

    static final int OKUL=111;

    public static void main(String[] args) {

        /*
            Final keyword variable, method ve class için kullanılabilir.

            Variable final olarak tanımlanırsa, o variable'a sonradan deger atanamaz.

            Method ; final olarak tanımlanırsa, override edilemez.

            Class ; final olarak tanımlanırsa, parant ilan edilemez.

            Finally bloğu ; try bloğu ile kullanılabilir, exception oluşsa da oluşmasa da çalışır.

            finalize () ; Metodu, Garbage Collectorun çalışması için
                        ön hazırlık yaparak kullanılmayan objeleri toparlar.
         */

        final int sayi=10;
        System.out.println("sayi : " + sayi);
        System.out.println("Max Value : " + Integer.MAX_VALUE);
    }

        public static final void methos1(){

        }
}
