package day19_arrays;

import java.util.Arrays;

public class C14_ArraySiralamMetodu {

    public static void main(String[] args) {

        //Verilen bir string array' i
        //Natural Order ve ters sırlama yapip bize döndüren 2 metod oluşturun.

        String[] arr={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};

        arr = nuturalSirala(arr);
        System.out.println(Arrays.toString(arr));

        arr = tersNaturalSirala(arr);
    }

    public static String[] tersNaturalSirala(String[] arr) {

        Arrays.sort(arr);
        String[] tersSirali=new String[arr.length];
        for (int i=0; i< arr.length; i++){

            tersSirali[i]=arr[arr.length-i-1];
        }
        return tersSirali;

    }

    public static String[] nuturalSirala(String[] arr) {

        Arrays.sort(arr);
        return arr;

    }
}
