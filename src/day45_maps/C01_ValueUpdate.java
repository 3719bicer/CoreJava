package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Arrays;
import java.util.Map;

public class C01_ValueUpdate {
    public static void main(String[] args) {

        // 103 numarali ogrencinin soyismini Yan yapin

        /*
        1-Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
            System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        2-String ogrenciEskiBilgiler= ogrenciMap.get(103);
            System.out.println(ogrenciEskiBilgiler); // Ali-Cem-11-B-TM

        3-String[] ogrenciValueArr=ogrenciEskiBilgiler.split("-");
            System.out.println(Arrays.toString(ogrenciValueArr)); // [Ali, Cem, 11, B, TM]

        4-ogrenciValueArr[1]= "Yan";
            System.out.println(Arrays.toString(ogrenciValueArr)); // [Ali, Yan, 11, B, TM]

        5-String ogrenciYeniValue= ogrenciValueArr[0]+"-"+
                ogrenciValueArr[1]+"-"+
                ogrenciValueArr[2]+"-"+
                ogrenciValueArr[3]+"-"+
                ogrenciValueArr[4];
            System.out.println(Arrays.toString(ogrenciYeniValue);

        6-ogrenciMap.put(103,ogrenciYeniValue);
            System.out.println(ogrenciMap);
        */


        // 103 numarali ogrencinin soyismini Yan yapin
        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        String eskiOgrenciBilgileri=ogrenciMap.get(103); //Ali-Cem-11-B-TM
        System.out.println(eskiOgrenciBilgileri);

        String[] ogrenciArr=eskiOgrenciBilgileri.split("-");
        System.out.println(Arrays.toString(ogrenciArr)); //[Ali, Cem, 11, B, TM]

        ogrenciArr[1]="Yan";
        System.out.println(Arrays.toString(ogrenciArr)); //[Ali, Yan, 11, B, TM]

        String yeniOgrenciBilgileri= ogrenciArr[0]+ "-" +
                                    ogrenciArr[1]+ "-" +
                                    ogrenciArr[2]+ "-" +
                                    ogrenciArr[3]+ "-" +
                                    ogrenciArr[4] ;
        System.out.println(yeniOgrenciBilgileri); //Ali-Yan-11-B-TM

        ogrenciMap.put(102,yeniOgrenciBilgileri);
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Ali-Yan-11-B-TM, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

    }
}
