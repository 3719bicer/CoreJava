package day10_stringManipulations;

import java.util.Scanner;

public class C07_notOrtalamasıExercise {
    public static void main(String[] args) {


    /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra
    dersten gecilip gecilmedigini consola yazdiran bir program yazalim.
     */

        // ortalama = vizenin %10'i + finalin %80'i + devam puaninin %10'u

        Scanner scan = new Scanner(System.in);

        double vizeNot, finalNot, devamNot, ortalama;

        System.out.println("Sirasiyla; \n\t\tFinal, \n\t\tVize, \n\t\tDevam \n\t\t\t\tnotlarinizi giriniz:");

        // System.out.println("Final notunu giriniz");
        finalNot = scan.nextDouble();

        // System.out.println("Vize notunu giriniz");
        vizeNot = scan.nextDouble();

        // System.out.println("Devam notunu giriniz");
        devamNot = scan.nextDouble();

        /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */

        ortalama = ((finalNot/100)*80) + ((vizeNot/100)*10) + ((devamNot/100)*10);

        System.out.println("Not Ortalamaniz : " + ortalama);

        if (ortalama>=70){
            System.out.println("Tebrikler, dersi gectiniz... :)");
        }else if (ortalama>=60){
            System.out.println("Kosullu gectiniz, \nortalamaniz 1.80'in altinda kaldigi takdirde " +
                    "dersten kalmis olacaksiniz... :(");
        }else if (ortalama>=0){
            System.out.println("Uzgunuz, dersi tekrar almaniz gerekmektedir... :\"(");
        }else{
            System.out.println("Ortalamaniz hesaplanamiyor, yanlis giris yaptiniz... :/");
        }

        scan.close();
    }
}
