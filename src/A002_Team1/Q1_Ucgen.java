package A002_Team1;

import java.util.Scanner;

public class Q1_Ucgen {

        /*
        Kullanicidan 3 tane pozitif  tam sayi alniz.
        bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

        üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
        herhangi iki kenar farkı diger kenardan kücük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen
        */

        public static void main(String[] args) {

            //Sabit degiskenler
            String wrongInputMessage = "Girdiginiz deger sifirdan kucuk olamaz. Lütfen degerlerinizi bastan giriniz!";

            //Hasaplama degiskenleri
            Scanner scanner = new Scanner(System.in);
            int sumOfAandB = 0, subtractionOfAandB = 0;
            int sumOfAandC = 0, subtractionOfAandC = 0;
            int sumOfBandC = 0, subtractionOfBandC = 0;

            //Kullanicidan gelen degiskenler
            int edgeA, edgeB, edgeC;

            //Kullanicidan girdilerin dogru bir sekilde alinmasi
            System.out.print("Lütfen A kenarinin uzunlugunu giriniz!");
            edgeA = scanner.nextInt();
            if (edgeA < 0) {
                System.out.println(wrongInputMessage);
                System.exit(0);
            }
            scanner.nextLine(); // sadece hata mesajından kurtulmak maksadiyla bir sonraki satıra atlamak için

            System.out.print("Lütfen B kenarinin uzunlugunu giriniz!");
            edgeB = scanner.nextInt();
            if (edgeB < 0) {
                System.out.println(wrongInputMessage);
                System.exit(0);
            }
            scanner.nextLine(); // sadece hata mesajından kurtulmak maksadiyla bir sonraki satıra atlamak için

            System.out.print("Lütfen C kenarinin uzunlugunu giriniz!");
            edgeC = scanner.nextInt();

            scanner.close();

            if (edgeC < 0) {
                System.out.println(wrongInputMessage);
                System.exit(0);
            }

            //Hesaplama
            sumOfAandB = edgeA + edgeB;
            sumOfAandC = edgeA + edgeC;
            sumOfBandC = edgeB + edgeC;
            subtractionOfAandB = Math.abs(edgeA - edgeB); //Burada mutlak deger alabilmek icin matematik class'i kullanildi.
            subtractionOfAandC = Math.abs(edgeA - edgeC);
            subtractionOfBandC = Math.abs(edgeB - edgeC);

            if (sumOfAandB > edgeC && edgeC > subtractionOfAandB &&
                    sumOfAandC > edgeB && edgeB > subtractionOfAandC &&
                    sumOfBandC > edgeA && edgeA > subtractionOfBandC) {
                System.out.println("Girdiginiz kenar degerleri ile bir ucgen olusturabilir.");
                if (subtractionOfAandB == 0 && subtractionOfBandC == 0) {
                    System.out.println("Girdiginiz bu degerler ile olusan ucgen bir eskenar ucgendir.");
                }
            } else {
                System.out.println("Girdiginiz kenar degerlerinden bir ucgen olusturulamaz.");
            }
        }
}