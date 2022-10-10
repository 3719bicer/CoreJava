package A001MyProject;

import java.util.Scanner;

public class Q4_3gen {
    public static void main(String[] args) {

        /*
            Kullanicidan 3 tane pozitif  tam sayi alniz.
            bu uc sayinin ucgen olusturma durumunu kontrol ediniz
            eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

            üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan kücük olmali
            a+b>c>a-b
            a+c>b>a-c
            b+c>a>b-c
            a=b=c ise es kenar ucgen
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarları için 3 tam sayi giriniz.");

        int kenar1=scan.nextInt();
        System.out.println("1.kenar :"+ kenar1);
        int kenar2=scan.nextInt();
        System.out.println("2.kenar :"+ kenar2);
        int kenar3=scan.nextInt();
        System.out.println("3.kenar :"+ kenar3);

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Üçgen : ESKENAR UCGEN");
        } else if (kenar1<0 || kenar2<0 || kenar3<0) {
            System.out.println("Girilen değer o'dan küçük olamaz");
        } else if (kenar1+kenar2>kenar3 || kenar3>kenar1-kenar2) {
                if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                    System.out.println("üçgen ikizkenar üçgen");
                }else {
                    System.out.println("üçgen oluşturdunuz");
                }
        } else if (kenar1+kenar3>kenar2 || kenar2>kenar1-kenar3) {
            if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("üçgen ikizkenar üçgen");
            }else {
                System.out.println("üçgen oluşturdunuz");
            }
        } else if (kenar2+kenar3>kenar1 || kenar1>kenar2-kenar3) {
            if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("üçgen ikizkenar üçgen");
            }else {
                System.out.println("üçgen oluşturdunuz");
            }
        } else {
            System.out.println("Kenar uzunlukları kriterlere uymamaktadır");
        }
        scan.close();
    }
}
