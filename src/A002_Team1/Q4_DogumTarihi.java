package A002_Team1;

import java.util.Scanner;

public class Q4_DogumTarihi {


        // Kullanicidan 2 farkli dogum gunu tarihi alip, kimin yasca daha buyuk oldugunu
        // konsola yazdiran bir program yazin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Karsilastirmak istediginiz dogum gunlerinden ilkini " +
                "\nYil, \nAy, \nGun \n\tseklinde giriniz");

        int  ilkYil = scan.nextInt();
        int  ilkAy = scan.nextInt();
        int  ilkGun = scan.nextInt();

        System.out.println("Karsilastirmak istediginiz dogum gunlerinden ikincisini " +
                "\nYil, \nAy, \nGun \n\tseklinde giriniz : ");

        int  ikinciYil = scan.nextInt();
        int  ikinciAy = scan.nextInt();
        int  ikinciGun = scan.nextInt();


        // ------------------ If - Nested If Cozumu -----------------------
        if(ilkYil<ikinciYil){
            System.out.println("Ilk kullanici daha yaslidir");
        }else if (ikinciYil<ilkYil){
            System.out.println("Ikinci kullanici daha yaslidir");
        }else { // bu satira geldigimizde artik yillarin birbirine esit olma durumunu inceliyoruz

            if (ilkAy < ikinciAy) {
                System.out.println("Ilk kullanici daha yaslidir");
            } else if (ikinciAy < ilkAy) {
                System.out.println("Ikinci kullanici daha yaslidir");
            } else {

                if (ilkGun < ikinciGun) {
                    System.out.println("Ilk kullanici daha yaslidir");
                } else if (ikinciGun < ilkGun) {
                    System.out.println("Ikinci kullanici daha yaslidir");
                } else {
                    System.out.println("Siz ikizsiniz!!!");
                }
            }

        }

        // --------Yil-Ay-Gun birlestirip sayisal deger elde ederek--------------

        int ilkDogumGunu = ilkYil*10000 + ilkAy*100 + ilkGun;
        int ikinciDogumGunu = ikinciYil*10000 + ikinciAy*100 + ikinciGun;

        // 2007/09/12 ==>> 20070912
        // 2006/11/09 ==>> 20061109

        if (ilkDogumGunu < ikinciDogumGunu) {
            System.out.println("Ilk kullanici daha yaslidir");
        } else if (ikinciDogumGunu < ilkDogumGunu) {
            System.out.println("Ikinci kullanici daha yaslidir");
        } else {
            System.out.println("Siz ikizsiniz!!!");
        }

        scan.close();
    }
}
