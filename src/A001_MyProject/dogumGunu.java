package A001MyProject;

import java.util.Scanner;

public class dogumGunu {
    public static void main(String[] args) {

        // Kullanicidan 2 farkli dogum gunu tarihi alip, kimin yasca daha buyuk oldugunu
        // konsola yazdiran bir program yazin.


        //Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Karsilastirmak istediginiz dogum gunlerinden ilkini " +
                "\nYil, \nAy, \nGun \n\tseklinde giriniz");

        int ilkYil = scan.nextInt();
        int ilkAy = scan.nextInt();
        int ilkGun = scan.nextInt();

        System.out.println("Karsilastirmak istediginiz dogum gunlerinden ikincisini " +
                "\nYil, \nAy, \nGun \n\tseklinde giriniz : ");

        int ikinciYil = scan.nextInt();
        int ikinciAy = scan.nextInt();
        int ikinciGun = scan.nextInt();


        // ------------------ If - Nested If Cozumu -----------------------
        if (ilkYil < ikinciYil) {
            System.out.println("Ilk kullanici daha yaslidir");
        } else if (ikinciYil < ilkYil) {
            System.out.println("Ikinci kullanici daha yaslidir");
        } else { // bu satira geldigimizde artik yillarin birbirine esit olma durumunu inceliyoruz

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

         */

        // --------Yil-Ay-Gun birlestirip sayisal deger elde ederek--------------

            /*
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

             */

        // Kullanicidan 2 farkli dogum gunu tarihi alip, kimin yasca daha buyuk oldugunu
        // konsola yazdiran bir program yazin.

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kişinin doğum tarihini ; " + "\n\tYil :" + "\n\tAy :" + "\n\tGün :" +
                "\n\tŞeklinde giriniz.");

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1=scan.nextInt();

        if (!(yil1 >= 1900 && yil1<2023)) {
            System.out.println("LÜtfen yil1 1900'den büyük giriniz.");
        }else if (!(ay1 <= 12 && ay1 > 0)) {
            System.out.println("Lütfen ay1 bilgisini 0'dan büyük," +
                    " 12' den küçük olacak şekilde giriniz.");
        } else if (!(gun1>0 && gun1<=31)) {
            System.out.println("Gün1 bilgisini yanlış giridiniz.0'dan büyük " +
                    "ve 31'den küçük olcak şekilde giriniz.");
        }

        System.out.println("İkinci kişinin doğum tarihini ; " + "\n\tYil :" + "\n\tAy :" + "\n\tGün :" +
                "\n\tŞeklinde giriniz.");

        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2=scan.nextInt();

        if (!(yil2 >= 1900 && yil2<2023)) {
            System.out.println("LÜtfen yil2 1900'den büyük giriniz.");
        }else if (!(ay2 <= 12 && ay2 > 0)) {
            System.out.println("Lütfen ay2 bilgisini 0'dan büyük," +
                    " 12' den küçük olacak şekilde giriniz.");
        } else if (!(gun2>0 && gun2<=31)) {
            System.out.println("Gün2 bilgisini yanlış giridiniz.0'dan büyük " +
                    "ve 31'den küçük olcak şekilde giriniz.");

        }

        if(yil1>yil2){
            System.out.println("ikinci kişinin yaşı birinci kişinin yaşindan daha büyüktür.");
        } else if (yil1<yil2){
            System.out.println("Birinci kişinin yaşı ikinci kişinin yaşindan daha büyüktür.");
        }else{
            if (ay1>ay2){
                System.out.println("ikinci kişinin yaşı birinci kişinin yaşindan daha büyüktür.");
            } else if (ay1<ay2) {
                System.out.println("Birinci kişinin yaşı ikinci kişinin yaşindan daha büyüktür.");
            } else {
                if (gun1>gun2){
                    System.out.println("ikinci kişinin yaşı birinci kişinin yaşindan daha büyüktür.");
                } else if (gun1<gun2) {
                    System.out.println("Birinci kişinin yaşı ikinci kişinin yaşindan daha büyüktür.");
                } else {
                    System.out.println("Siz ikizsiniz");
                }
            }
        }

        scan.close();

         */


        // Kullanicidan 2 farkliu dogum gunu tarihi alip, kimin yasca daha buyuk oldugunu
        // konsola yazdiran bir program yazin.

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen Karşılaştıracagınız kişinin Cinsiyetini Giriniz."+"\n Erkek için E, Bayan için B kullanınız");
        char cinsiyet=scanedilen.nextLine().toUpperCase().charAt(0);

        if (! (cinsiyet=='B' || cinsiyet=='E') ) {
            System.out.println("Lutfen E veya B giriniz");}

        else if ( cinsiyet=='B') {
            System.out.println("Java olarak çok zekiyimdir; ama aynı zamanda kibarımdır, " +
                "Ben Bayanların yaşını sormam");
        } else {
            System.out.println("İlk Kişinin adını soyadını giriniz");
        }


        String ilkKisi=scanedilen.next();

        System.out.println(ilkKisi+"'in" + "Dogum Gunununu" +"\nGun" + "\nAy" +"\nYıl"+ "\nşeklinde Yazınız.");

        System.out.println("Gün:");
        int gun1=scanedilen.nextInt();
        System.out.println("Ay:");
        int ay1=scanedilen.nextInt();
        System.out.println("Yıl:");
        int yil1=scanedilen.nextInt();

        System.out.println("ikinci Kişinin Adını Soyadını Giriniz");
        String ikinciKisi=scanedilen.next();
        System.out.println(ikinciKisi+"'in" + "Dogum Gunununu" +"\nGun" + "\nAy" +"\nYıl"+ "\nşeklinde Yazınız.");


        System.out.println("Gün");
        int gun2=scanedilen.nextInt();
        System.out.println("Ay");
        int ay2=scanedilen.nextInt();
        System.out.println("Yıl");
        int yil2=scanedilen.nextInt();


        if (gun1>31 || gun2>31 || gun1<=0 || gun2<=0)  {
            System.out.println( "Geçersiz Deger gün: 1 ile 31 degerleri arasında olmali ");}
        else if (ay1>12 || ay2>12 || ay1<=0 || ay2<=0) {
            System.out.println( "Geçersiz Deger: ay 1 ile 12 degerleri arasında olmali ");}
        else if (yil1==yil2 && ay2==ay1 && gun2==gun1) {
            System.out.println("Her ikisi Ayni Yaşta");}

        else if (yil1==yil2 ){

            if (ay2==ay1) {
                if (gun2>gun1) {
                System.out.println(ilkKisi +" daha buyuk");}
            else{
                System.out.println(ikinciKisi + " daha büyük");}}
            else if (ay2>ay1) {
                System.out.println(ilkKisi +" daha buyuk");
            }
            else {System.out.println(ikinciKisi + " daha büyük");}}

        else if (yil2>yil1) {System.out.println(ilkKisi +" daha buyuk");}
        else {System.out.println(ikinciKisi + " daha büyük");}

        scanedilen.close();

    }
}