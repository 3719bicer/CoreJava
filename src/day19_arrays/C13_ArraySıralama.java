package day19_arrays;

import java.util.Arrays;

public class C13_ArraySıralama {

    public static void main(String[] args) {

        //Verilen bir string array' i
        //Natural Order ve ters sırlama yapınız.

        String[] arr={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};

        //Natural Order göre sıralama için Arrays Class'ından sort() kullanılır.
        //DİKKAT EDİLECE KONU : kucuk harflerin ASCII degeri daha büyük old için
        //sıralamada once buyk harfle baslayanlar , sonra kuçuk harfle başlayanlar gelir.

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));   //[Bora, Dalyan, Esra, Jacob, Mehmet, Muhammet, fatih]

        //Büyükten küçüğe sıralama yapmak istersek
        //hazır method yok, yeni bir array oluşturup
        //o array'e ters sırlama ile yerleştirmemiz lazım.


        String[] tersSirali = new String[arr.length];

        for (int i=0; i< arr.length; i++){
            tersSirali[i]=arr[arr.length-i-1];
        }
        System.out.println("Ters sirali array :" + Arrays.toString(tersSirali));


    }
}
