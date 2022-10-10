package day19_arrays;

import java.util.Arrays;

public class C12_ArrayeElemanEkleme {

    public static void main(String[] args) {

        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
         eski array’e yeni degeri atayin.
         */

        int [] arr={3,6,8,11};
        int eklenecekler=10;

        arr=arrayeElemanEkleme(arr,eklenecekler);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeElemanEkleme(int[] arr, int eklenecekler) {

        //önce eski array'in uzunluğundan 1 fazla yeni array oluşturalım.
        int[] yeniarr=new int[arr.length+1];

        //for loop ile eski array'deki elementşleri yeni array'e
        //ayni indeks ile atama yapalım.
        for (int i=0; i<arr.length; i++){
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekler;

        return yeniarr;

    }
}
