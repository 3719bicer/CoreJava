package A001MyProject;

import java.util.Scanner;

public class Q8_ForLoops2 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak
        //aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucuk olsa da
        //program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangıç sayisi giriniz :");
        int basl=scan.nextInt();
        System.out.println("Bitiş sayisi giriniz :");
        int bitis=scan.nextInt();
        int toplam=0;

        if(basl>bitis) {
            for (int i = basl; i >= bitis; i--) {
                toplam += i;
            }
            System.out.println("Toplam :" + toplam);
        }else {
            for (int i=basl; i<=bitis; i++){
                toplam+=i;
            }
            System.out.println("Toplam :" + toplam);
        }
    }
}
