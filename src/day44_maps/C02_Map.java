package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C02_Map {

    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        // kullanicidan ogrenci ile ilgili bilgileri alip
        // map'e ekleyin

        ogrenciMap=ReusableMethods.mapeOgrenciEkle(ogrenciMap);
        System.out.println(ogrenciMap);
        /*
         map'e element eklemek icin put() kullanilir
         value girilirken eski elementlerle ayni formatta olmalidir
         */


        /*
        public static Map<Integer,String> mapOgrenciEkle(Map<Integer,String>,ogrenciMap){

            Scanner scan = new Scanner(System.in);
            String valueOgr = "";

            System.out.println("Lütfen ismi giriniz :");
            String isim = scan.nextLine();
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

            System.out.println("Lütfen soyismi giriniz :");
            String soyisim = scan.next();
            soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

            System.out.println("Lütfen sınıfınızı giriniz :");
            String sınıf = scan.next();

            System.out.println("Lütfen subenizi giriniz :");
            String sube = scan.next();
            sube = sube.substring(0, 1).toUpperCase();

            System.out.println("Lütfen alan-brans giriniz TM-MF-SOZ:");
            String brans = scan.next();
            brans = brans.substring(0, 2).toUpperCase();


            valueOgr = isim + "-" + soyisim + "-" + sınıf + "-" + sube + "-" + brans;
            System.out.println(valueOgr);

            Integer keyOgr = scan.nextInt();
            ogrenciMap.put(keyOgr, valueOgr);

            return ogrenciMap;

        }
         */
    }
}
