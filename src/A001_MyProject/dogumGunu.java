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
        System.out.println("Birinci ki??inin do??um tarihini ; " + "\n\tYil :" + "\n\tAy :" + "\n\tG??n :" +
                "\n\t??eklinde giriniz.");

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1=scan.nextInt();

        if (!(yil1 >= 1900 && yil1<2023)) {
            System.out.println("L??tfen yil1 1900'den b??y??k giriniz.");
        }else if (!(ay1 <= 12 && ay1 > 0)) {
            System.out.println("L??tfen ay1 bilgisini 0'dan b??y??k," +
                    " 12' den k??????k olacak ??ekilde giriniz.");
        } else if (!(gun1>0 && gun1<=31)) {
            System.out.println("G??n1 bilgisini yanl???? giridiniz.0'dan b??y??k " +
                    "ve 31'den k??????k olcak ??ekilde giriniz.");
        }

        System.out.println("??kinci ki??inin do??um tarihini ; " + "\n\tYil :" + "\n\tAy :" + "\n\tG??n :" +
                "\n\t??eklinde giriniz.");

        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2=scan.nextInt();

        if (!(yil2 >= 1900 && yil2<2023)) {
            System.out.println("L??tfen yil2 1900'den b??y??k giriniz.");
        }else if (!(ay2 <= 12 && ay2 > 0)) {
            System.out.println("L??tfen ay2 bilgisini 0'dan b??y??k," +
                    " 12' den k??????k olacak ??ekilde giriniz.");
        } else if (!(gun2>0 && gun2<=31)) {
            System.out.println("G??n2 bilgisini yanl???? giridiniz.0'dan b??y??k " +
                    "ve 31'den k??????k olcak ??ekilde giriniz.");

        }

        if(yil1>yil2){
            System.out.println("ikinci ki??inin ya???? birinci ki??inin ya??indan daha b??y??kt??r.");
        } else if (yil1<yil2){
            System.out.println("Birinci ki??inin ya???? ikinci ki??inin ya??indan daha b??y??kt??r.");
        }else{
            if (ay1>ay2){
                System.out.println("ikinci ki??inin ya???? birinci ki??inin ya??indan daha b??y??kt??r.");
            } else if (ay1<ay2) {
                System.out.println("Birinci ki??inin ya???? ikinci ki??inin ya??indan daha b??y??kt??r.");
            } else {
                if (gun1>gun2){
                    System.out.println("ikinci ki??inin ya???? birinci ki??inin ya??indan daha b??y??kt??r.");
                } else if (gun1<gun2) {
                    System.out.println("Birinci ki??inin ya???? ikinci ki??inin ya??indan daha b??y??kt??r.");
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
        System.out.println("Lutfen Kar????la??t??racag??n??z ki??inin Cinsiyetini Giriniz."+"\n Erkek i??in E, Bayan i??in B kullan??n??z");
        char cinsiyet=scanedilen.nextLine().toUpperCase().charAt(0);

        if (! (cinsiyet=='B' || cinsiyet=='E') ) {
            System.out.println("Lutfen E veya B giriniz");}

        else if ( cinsiyet=='B') {
            System.out.println("Java olarak ??ok zekiyimdir; ama ayn?? zamanda kibar??md??r, " +
                "Ben Bayanlar??n ya????n?? sormam");
        } else {
            System.out.println("??lk Ki??inin ad??n?? soyad??n?? giriniz");
        }


        String ilkKisi=scanedilen.next();

        System.out.println(ilkKisi+"'in" + "Dogum Gunununu" +"\nGun" + "\nAy" +"\nY??l"+ "\n??eklinde Yaz??n??z.");

        System.out.println("G??n:");
        int gun1=scanedilen.nextInt();
        System.out.println("Ay:");
        int ay1=scanedilen.nextInt();
        System.out.println("Y??l:");
        int yil1=scanedilen.nextInt();

        System.out.println("ikinci Ki??inin Ad??n?? Soyad??n?? Giriniz");
        String ikinciKisi=scanedilen.next();
        System.out.println(ikinciKisi+"'in" + "Dogum Gunununu" +"\nGun" + "\nAy" +"\nY??l"+ "\n??eklinde Yaz??n??z.");


        System.out.println("G??n");
        int gun2=scanedilen.nextInt();
        System.out.println("Ay");
        int ay2=scanedilen.nextInt();
        System.out.println("Y??l");
        int yil2=scanedilen.nextInt();


        if (gun1>31 || gun2>31 || gun1<=0 || gun2<=0)  {
            System.out.println( "Ge??ersiz Deger g??n: 1 ile 31 degerleri aras??nda olmali ");}
        else if (ay1>12 || ay2>12 || ay1<=0 || ay2<=0) {
            System.out.println( "Ge??ersiz Deger: ay 1 ile 12 degerleri aras??nda olmali ");}
        else if (yil1==yil2 && ay2==ay1 && gun2==gun1) {
            System.out.println("Her ikisi Ayni Ya??ta");}

        else if (yil1==yil2 ){

            if (ay2==ay1) {
                if (gun2>gun1) {
                System.out.println(ilkKisi +" daha buyuk");}
            else{
                System.out.println(ikinciKisi + " daha b??y??k");}}
            else if (ay2>ay1) {
                System.out.println(ilkKisi +" daha buyuk");
            }
            else {System.out.println(ikinciKisi + " daha b??y??k");}}

        else if (yil2>yil1) {System.out.println(ilkKisi +" daha buyuk");}
        else {System.out.println(ikinciKisi + " daha b??y??k");}

        scanedilen.close();

    }
}