package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String alip tersten yazdirin
        //Palindrom kelime???

        /*
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        // Java candir
        for (int i = cumle.length()-1; i >=0; i--) {
            System.out.print(cumle.charAt(i));
        }
        // terse cevirdigimiz hali orjinal haliyle ayni mi ?
         */

        // Kullanicidan bir String alip tersten yazdirin
        //Palindrom kelime???

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz :");
        String cumle=scan.nextLine();

        for (int i=cumle.length()-1;i>=0; i--){
            System.out.print(cumle.charAt(i));
        }
    }
}
