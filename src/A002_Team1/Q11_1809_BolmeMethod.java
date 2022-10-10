package A002_Team1;

import java.util.Scanner;

public class Q11_1809_BolmeMethod {

    //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

    static int bolum;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bolunen sayiyi giriniz : ");
        int bolunen = scan.nextInt();

        System.out.print("Lutfen boleceginiz sayi giriniz : ");
        int bolen = scan.nextInt();

        System.out.println("Sonuc : " + bolmeIslemi(bolunen, bolen));
        ;

    }

    public static int bolmeIslemi(int a, int b) {

        while (a >= b) {
            a -= b;
            bolum++;
        }
        return bolum;
    }
}

        /*---Fatih---

        package practise;
        import java.util.Scanner;
        public class Q13_BolmeOperatoruKullanmadanBolme {
            static int bolum; // class icinde olusturduk ki her meethod ile kullanabilelim...
            // static yaptik ki static olan asgidaki method'ta kullanabilelim...
            public static void main(String[] args) {

                //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve
                //bolme operatoru kullanmadan bolme islemini gerceklestirip
                 bolumu hesaplayan method create ediniz.

                Scanner scan=new Scanner(System.in);
                System.out.print("Lutfen bolunen sayiyi giriniz: ");
                int bolunen= scan.nextInt();
                System.out.print("Lutfen bolen sayiyi giriniz: ");
                int bolen= scan.nextInt();
                bolmeIslemi(bolunen,bolen);
                System.out.println("Bolum : " + bolum);
            }
            public static int bolmeIslemi(int bolunen, int bolen) {
                while (bolunen >= bolen) {
                    bolunen -= bolen;
                    bolum++;
                }
                return bolum;
            }
        }
         */


    /*---Jacob Lejon---

    package Week06_Practice;

    import java.util.Scanner;

    public class D01BolmeMethoduOlusturma {

    public static void main(String[] args) {

        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        bolmeIslemi();


    }

    public static void bolmeIslemi() {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int bolunen= scan.nextInt();
        System.out.println("Lütfen bir sayi giriniz");
        int bolen= scan.nextInt();

        int bolum=0;


        while (bolunen>=bolen){

            bolunen -=bolen;
            bolum++;
        }
        System.out.println(bolum);


    }


    }
     */