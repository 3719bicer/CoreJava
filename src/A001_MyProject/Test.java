package A001MyProject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen ay ismini giriniz :");
        String girilenAy=scan.next();
        String ay=girilenAy.toLowerCase();


        switch (ay) {
            case "aralık" :
            case "ocak" :
            case "subat" :
                System.out.println("Girdiginiz ay :" + girilenAy + " Kıs mevsimidir.");
            break;

            case "mart" :
            case "nisan" :
            case "mayıs" :
                System.out.println("Girdiginiz ay :" + girilenAy + " Ilkbahar mevsimidir.");
                break;
            case "haziran" :
            case "temmuz" :
            case "agustos" :
                System.out.println("Girdiginiz ay :" + girilenAy + " Yaz mevsimidir.");
                break;
            case "eylül" :
            case "ekim" :
            case "kasım" :
                System.out.println("Girdiginiz ay :" + girilenAy + "Sonbahar mevsimidir.");
                break;
            default:
                System.out.println("Girilen ay ismi hatalıdır.");
          }
        *\


        /*
        System.out.println("Hello World");
        int myInt=10;

        int not=80;
        //string isim="Jhon Doe";
        //boolean ogrenciMi=true;
        //double notORT=89.3;

        int not1;
        not1=90;
        double notOrt=(not+not1)/2;
        System.out.println("Ogrencının Not Ortalaması:"+notOrt);

         */


        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve girilen harfin
        //karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("ISTQB kısaltmasından hangi harfin anlamını istersiniz :");
        int harf = scan.nextInt();

        switch (harf) {
            case 1:
                System.out.println(harf + ". Harfin anlamı :" + "I : International");
                break;
            case 2:
                System.out.println(harf + ". Harfin anlamı :" + "S : Software");
                break;
            case 3:
                System.out.println(harf + ". Harfin anlamı :" + "T : Testing");
                break;
            case 4:
                System.out.println(harf + ". Harfin anlamı :" + "Q : Qualifications");
                break;
            case 5:
                System.out.println(harf + ". Harfin anlamı :" + "B: Board");
                break;
            default:
                System.out.println("Tekrar bir rakam giriniz");

            }

         */

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("ISTQB kısaltmasından hangi harfin anlamını istersiniz :");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'I' :
                System.out.println(harf + " Harfininin anlamı :" + "I : International");
                break;
            case  'S' :
                System.out.println(harf + " Harfininin anlamı :" + "S : Software");
                break;
            case 'T' :
                System.out.println(harf + " Harfininin anlamı :" + "T : Testing");
                break;
            case 'Q' :
                System.out.println(harf + " Harfininin anlamı :" + "Q : Qualifications");
                break;
            case 'B' :
                System.out.println(harf + " Harfininin anlamı :" + "B: Board");
                break;
            default:
                System.out.println("Yanlış harf girdiniz.Lütfen farklı bir harf veya  büyük harf deneyiniz ");

                String gub=scan.next();

         */


                /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;

         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)



        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz :");
        int bardak=scan.nextInt();
        System.out.println("Her bardak icin kac kup seker kullanıyprsunuz :");
        int seker=scan.nextInt();

        double yillik=365*bardak*seker*2.77/1000;
        double kırkYillik=40*yillik;

        if(seker==0){
            System.out.println("Aferin, boyle devam et.");
        } else if(bardak>0 && seker>0){
            System.out.println("Yıllık seker kullanımı : " + yillik + "kg dir.");
            System.out.println("40 Yıllık seker kullanımı : " + kırkYillik + "kg dir.");
        }else {
            System.out.println("Hatalı giriş");
            }
        }
         */

        //          Kullaniciya
        //          * 1 = Gunde kac bardak cay ictigini,
        //          * 2 = Her bardak icin kac kup seker kullandigini sorup;
        //
        //          kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
        //          * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
        //           (1 kup seker = 2.77 gr)
        //

        // Kullanicidan verileri al

        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");

        double cay = scan.nextDouble();

        System.out.println("1 bardak cay icin kac kup seker tuketiyorsunuz?");

        double seker = scan.nextDouble();

        // Seker tuketimini hesapla

        double yillikTuketim = cay * seker * 2.77 * 365 / 1000 ;
        double kirkYillikTuketim = yillikTuketim * 40;

        int yillikTuketimInt =(int) yillikTuketim;
        int kirkYillikTuketimInt =(int) kirkYillikTuketim;

        if (seker==0){
            System.out.println("Aferin, boyle devam et :)");
        }else if(seker>0 && cay>0){
            System.out.println("Yillik seker tuketiminiz : " + yillikTuketimInt);
            System.out.println("40 Yillik seker tuketimiz : " + kirkYillikTuketimInt);
        }else{
            System.out.println("Hatali giris yaptiniz");
        }
        scan.close();
        }
    }
