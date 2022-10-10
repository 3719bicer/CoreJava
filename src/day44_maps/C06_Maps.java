package day44_maps;

import java.util.List;
import java.util.Map;

public class C06_Maps {
    public static void main(String[] args) {

        // verilen sinif'daki ogrencilerin isim ve soyisimlerini liste olarak donduren bir method olusturun

        Map<Integer, String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        List<String> siniftakiOgrenciListesi =
                ReusableMethods.siniftakiOgrenciListesiOlustur(ogrenciMap,10);

        System.out.println(siniftakiOgrenciListesi);

    }
}