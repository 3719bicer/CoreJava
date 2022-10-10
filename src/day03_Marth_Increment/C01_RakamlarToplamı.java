package day03_Marth_Increment;


import java.util.Scanner;

public class C01_RakamlarToplamı {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayi giriniz :");
        int girilenSayi=scan.nextInt();

        /*
        Bu soryu ilerde loop ile yapacağız ama şimdilik ayni işlemi basamak sayısı kadar
        kendimiz tekrar edeceğiz.
         */

        /*
        Java' da bir kod yazmaya başlamadan önce algoritmayı tasarlayıp ihtiyacımız
        olan variabları oluşturmalıyız.
         */

        int birlerBasamagı=0;
        int rakamlarToplamı=0;

        //sayi=1469 , birlerBasamagı=0 , rakamlarToplamı=0;

        birlerBasamagı=girilenSayi%10; //9
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; //0+9=9
        girilenSayi=girilenSayi/10; //146

        //sayi=146 , birlerBasamagı=9 , rakamlarToplamı=9;

        birlerBasamagı=girilenSayi%10; //6
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; //9+6=15
        girilenSayi=girilenSayi/10; //14

        //sayi=14 , birlerBasamagı=6 , rakamlarToplamı=15;

        birlerBasamagı=girilenSayi%10; //4
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; //15+4=19
        girilenSayi=girilenSayi/10; //1

        //sayi=1 , birlerBasamagı=4 , rakamlarToplamı=19;

        birlerBasamagı=girilenSayi%10; //1
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı; //19+1=20
        girilenSayi=girilenSayi/10; //0,1===>0

        System.out.println("Girilen Sayıların rakamları toplamı : " +rakamlarToplamı);

    }
}
