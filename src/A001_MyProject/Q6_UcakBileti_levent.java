package A001MyProject;

import java.util.Scanner;

public class Q6_UcakBileti_levent {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen gideceginiz şehri giriniz (B, C veya D şehri");
        char mesafe=scanner.next().toUpperCase().charAt(0);
        if (mesafe=='B') {
            mesafe=500;
        } else if (mesafe=='C') {
            mesafe=700;
        } else if (mesafe=='D') {
            mesafe=900;
        } else {
            System.out.println("hatalı veri girdiniz, lütfen kontrol edin");
        }
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scanner.nextInt();
        double indirimorani2;
        if (yas<=12 && yas>0) {
            indirimorani2=0.5;
        } else if (yas>12 && yas<=24) {
            indirimorani2=0.1;
        } else if (yas>=65) {
            indirimorani2=0.3;
        } else {
            indirimorani2=0;
        }
        System.out.println("gidis dönüş bileti alacaksanız lütfen 'G', tek yön bilet alacaksanız 'T' yazınız");
        char biletyonu=scanner.next().toUpperCase().charAt(0);
        double indirimorani1 = 0;
        if (biletyonu=='G'){
            indirimorani1=0.2;
        } else if (biletyonu=='T'){
            indirimorani1=0;
        } else {
            System.out.println("hatalı veri girdiniz, lütfen kontrol edin");
        }
        double toplamucret;
        if (biletyonu=='G') {
            toplamucret= (2*mesafe*0.1*(1-indirimorani1)*(1-indirimorani2));
        } else {
            toplamucret= mesafe*0.1*(1-indirimorani1)*(1-indirimorani2);
        }
        System.out.println("Ödeyeceginiz toplam ücret : " + toplamucret + " $");
        scanner.close();
    }
}
