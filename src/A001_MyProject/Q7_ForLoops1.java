package A001MyProject;

import java.util.Scanner;

public class Q7_ForLoops1 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila
        //bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz :");
        int sayi=scan.nextInt();
        int bolunenSayi=0;


        for (int i=1; i<=sayi; i++) {
            if (i % 7 == 0) {
                bolunenSayi=i;
                System.out.println(sayi + "sina kadar 7 ileböülünen sayilar :" + bolunenSayi + " ");
            }
        }
    }
}
