package day02_scanner_dataCasting;

public class C08_DataCasting_2 {
    public static void main(String[] args) {

        double doublesayi=23.4;

        int intSayi = (int)doublesayi;
        System.out.println(intSayi); //23

        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin
        //Verilen 3 tamsayının ortalamsını yazdırın.

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;
        System.out.println((sayi1+sayi2+sayi3)/3); //41/3= = 13,666666 ===>13
        /*
            Eğer işlem yapılan tüm sayılar int ise java sonu integer olarak verir.
            Ama sayılardan biri double olursa, sonucu geniş olana otomatik cast eder.
         */

        double sayi4=15;
        System.out.println((sayi1+sayi4)/2); //27/2=13.5 ===>13.5

        //Verilen 3 tam sayının ortalamasını double yazdırın.
        System.out.println((double) ((sayi1+sayi2+sayi3)/3)); //13.0
        System.out.println(((double)sayi1+sayi2+sayi3)/3); //13.6666666666

    }
}
