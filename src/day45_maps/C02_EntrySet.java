package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {


        /*
        // Tum ogrencilerin bilgilerini bir liste seklinde kullanicilara yazdirin
        // No isim Soyisim Sinif Sube Bolum
        // 101-


        {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
         Java Map'lerde key ve value'yu birlikte manipule(isleme) edebilmemiz icin
         map'lere ozel Entry Class'i olusturmustur.
         101=Ali-Can-10-H-MF   1. entry
         101=Ali-Can-10-H-MF   2. entry


        1-Map<Integer,String> ogrencimap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrencimap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        System.out.println("No isim  Soyisim Sinif Sube Bolum");

        // Map'deki tum entry'leri bir set'e store ettik
        2-Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrencimap.entrySet();
        System.out.println(ogrenciEntrySeti);
        //[101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz]

        3-for (Map.Entry<Integer,String> each: ogrenciEntrySeti
        ) {
            4-Integer tempKey=each.getKey();
              String tempValue= each.getValue(); // Ali-Can-10-H-MF
            5-String[] tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]
              System.out.println(tempKey+ " " +
                                tempValueArr[0]+ " "+
                                tempValueArr[1]+ " "+
                                tempValueArr[2]+ " "+
                                tempValueArr[3]+ " "+
                                tempValueArr[4]);
        }
         */

        // Tum ogrencilerin bilgilerini bir liste seklinde kullanicilara yazdirin
        // No isim Soyisim Sinif Sube Bolum
        // 101-

        /*

        {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        Java Map'lerde key ve value'yu birlikte manipule(isleme) edebilmemiz icin
        map'lere ozel Entry Class'i olusturmustur.

        101=Ali-Can-10-H-MF   1. entry
        101=Ali-Can-10-H-MF   2. entry

         */

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        //Map'teki tüm entry leri bir set'e store ettik.
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySet);
        //[101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM,
        // 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz]



        for (Map.Entry<Integer,String> each: ogrenciEntrySet
             ) {
            //System.out.println(each);

            //101=Ali-Can-10-H-MF
            //102=Veli-Cem-11-M-Soz
            //103=Ali-Cem-11-B-TM
            //104=Ayca-Can-11-B-MF
            //105=Ayse-Cem-10-M-Soz

            Integer tempKey=each.getKey();
            String tempValue=each.getValue();
            String[] tempArr=tempValue.split("-");

            System.out.println(tempKey + " " +
                    tempArr[0] + " " +
                    tempArr[1] + " " +
                    tempArr[2] + " " +
                    tempArr[3] + " " +
                    tempArr[4]);

            //System.out.println(Arrays.toString(tempArr));
        }


    }
}
