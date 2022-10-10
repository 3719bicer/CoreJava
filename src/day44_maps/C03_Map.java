package day44_maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Map {
    public static void main(String[] args) {

        // Map'deki key listesini ve value listesini ayri ayri yazdirin.

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        // Class'imizda kullanabilmek icin bu keySet'i kaydetmek istersek
        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();

        System.out.println(ogrenciMap.values());
        Collection<String> ogrenciValueColl=ogrenciMap.values();

        // 103 numarali ogrencinin bilgilerini yazdiralim.
        System.out.println(ogrenciMap.get(103));  //Ali-Cem-11-B-TM

        // 103 numarali ogrencinin bransini yazdirin.
        String ogrenciValue=ogrenciMap.get(103);
        String[] ogrenciValurArr=ogrenciValue.split("-");
        System.out.println(Arrays.toString(ogrenciValurArr)); //[Ali, Cem, 11, B, TM]
        System.out.println("103 numaralı ogrencinin bransi : " + ogrenciValurArr[4]);

        // 103 numarali ogrencinin sinifini yazdirin
        System.out.println("103 numaralı ogrencinin sinifi : " + ogrenciValurArr[2]);
    }
}
