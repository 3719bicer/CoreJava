package day14_methodCreation;

public class C08_Tekrar30_09 {
    public static void main(String[] args) {
    /*
        Input olrak verilen satış fiyatı, müsteri kartı var mı?
        ve üyeligi kaç yıllık? bilgilerini degerlendirip.
        - uye degilse : %5
        - uyeligi var ama 5 yildan az ise : %10
        - üyeligi var ama 5 yildan cok ise : %15
        indfirim uygulanır.
        asil fiyat , indirim miktari ve indirimli fiyati yazdıran
        bir method olusturun.
     */

        boolean üyeMi=true;
        int uyelikYili=3;
        double satisFiyati=250;

        indirimliFiyatHesaplama(üyeMi,uyelikYili,satisFiyati);

    }

    private static void indirimliFiyatHesaplama(boolean üyeMi, int uyelikYili, double satisFiyati) {
        if(üyeMi){
            if (uyelikYili<5){
                System.out.println("ürün Fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati*0.1);
                System.out.println("Indirimli fiyat : " + (satisFiyati-(satisFiyati*0.1)));
            }else {
                System.out.println("ürün Fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati*0.15);
                System.out.println("Indirimli fiyat : " + (satisFiyati-(satisFiyati*0.15)));
            }

        }else {
            System.out.println("ürün Fiyati : " + satisFiyati);
            System.out.println("Indirim Miktari : " + satisFiyati*0.05);
            System.out.println("Indirimli fiyat : " + (satisFiyati-(satisFiyati*0.05)));
        }
    }
}