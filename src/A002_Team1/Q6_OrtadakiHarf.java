package A002_Team1;

import java.util.Scanner;

public class Q6_OrtadakiHarf {


        /*
				StringMethods:
				Bir degiskenin ortasindaki harfi konsolda yazdirmak icin bir Java programi yaziniz.
	    	    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   th
        */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen ortasindaki harfi yazdirmak icin bir metin giriniz");

            String metin = scan.nextLine();

            int uzunluk = metin.length();
            int tekOrta =  (uzunluk-1)/2;    // => Bu satirda ortaki karakterin index'ini
                                            // uzunluk uzerinden dinemiklestiriyoruz
            int ciftOrta = uzunluk/2;       // Levent


            if (uzunluk%2==0){
                System.out.println(metin.substring(ciftOrta-1,ciftOrta+1));
            }else System.out.println(metin.substring(tekOrta,tekOrta+1));

            scan.close();

    }
}
