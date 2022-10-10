package day14_methodCreation;

import java.util.Scanner;

public class C03_MethodOlusturma {
    public static void main(String[] args) {

        /*
      verilen iki integer'i toplayip
      sonucu bize donduren bir method olusturun
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayi :");
        int sayi1=scan.nextInt();
        System.out.println("2.sayi :");
        int sayi2=scan.nextInt();

        System.out.println("iki sayi toplami: " +(sayi1+sayi2));
    }
    public static int ikiSayiTopla(int sayi1, int sayi2){

        return sayi1+sayi2;

    }
}
