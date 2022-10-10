package A002_Team1;

import java.util.Random;
import java.util.Scanner;

public class Q15_TasKagıtMakas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoose = 0;
        int compChoose = 0;
        int userPoint = 0;
        int compPoint = 0;

        do{
            System.out.println("Lutfen secim yapiniz :\n1 - Tas\n2 - Kagit\n3 - Makas");
            userChoose = scan.nextInt();
            compChoose = random.nextInt(3);
            /*
            while (! scan.hasNextInt()){
                if ( !(userChoose>0 && userChoose<4 )) {

                    System.out.println("Hatali giris yaptiniz, Lütfen tekrar secim yapiniz");
                    scan.nextLine();
                }else {

                    System.out.println(userChoose);

                }

            }
            userChoose= scan.nextInt();
             */

            if (userChoose == 1 && compChoose== 2){
                System.out.println("Kagit tasi kaplar --> Computer +1");
                compPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }else if(userChoose == 1 && compChoose== 3){
                System.out.println("Tas makasi kirar --> User +1");
                userPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }else if(userChoose == 2 && compChoose== 1){
                System.out.println("Kagit tasi kaplar --> User +1");
                userPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }else if(userChoose == 2 && compChoose== 3){
                System.out.println("Makas kagidi keser --> Bilgisayar +1");
                compPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }else if(userChoose == 3 && compChoose== 1){
                System.out.println("Tas makasi kirar --> Bilgisayar +1");
                compPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }else if(userChoose == 3 && compChoose== 2){
                System.out.println("Makas kagidi keser --> User +1");
                userPoint++;
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }
            else{
                System.out.println("Berabere...");
                System.out.println("User = "+ userPoint + " vs. Computer = "+ compPoint);
            }

        }while (userPoint!=5 && compPoint!=5);
        {
            if(userPoint>compPoint){
                System.out.println("Kazandiniz!!!");
            }else System.out.println("Kaybettiniz :(");
        }
        scan.close();
    }

}
