package A002_Team1;

import java.util.*;

public class Q13_AMapStudies2 {
    public static void main(String[] args) {

        List<String> ogrenciIsimleri = new ArrayList<>();
        ogrenciIsimleri.add("Ahmet");
        ogrenciIsimleri.add("Ahmet");

        for(String isim: ogrenciIsimleri) {
            System.out.println("isim = " + isim);
        }

        Map<Integer, String> ogrenciNoveIsimleri = new HashMap<>();
        ogrenciNoveIsimleri.put(101, "Ahmet");
        ogrenciNoveIsimleri.put(102, "Mehmet");
        System.out.println("ogrenciNoveIsimleri = " + ogrenciNoveIsimleri);

        Set<Integer> numaralar = ogrenciNoveIsimleri.keySet();
        for(Integer numara: numaralar) {
            System.out.println("numara = " + numara);
        }

        Collection<String> isimler = ogrenciNoveIsimleri.values();
        for(String isim :isimler) {
            System.out.println("isim = " + isim);
        }

        Set<Map.Entry<Integer, String>> noVeIsimEntries = ogrenciNoveIsimleri.entrySet();
        for(Map.Entry<Integer, String> entry: noVeIsimEntries) {
            Integer noKey = entry.getKey();
            String isimValue = entry.getValue();

            System.out.println(noKey + " " + isimValue);
        }
    }
}
