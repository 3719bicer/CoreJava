package day04_Operators;

public class C02_IfCumleleri {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a*b>100){
            System.out.println("Carpımlari 100 den büyük");
        }

        if (a<b) System.out.println("a, b' den küçük");
        //if şartından sonra sadece 1 satır kod yazacaksak {} kullanmasakta olur.

        if (b>0) {
            System.out.println("b 0'dan büyük");

            /*
            Basit if cümleleri kodun geri kalanı ile ilgilenmez.
            dolayısıyla tüm basit if cümlelerinin body'leri çalışacağı gibi

             */
        }

        boolean c=true;
        if (c){
            System.out.println("c li if calıstı");
        }

        c=a*5 > b*3;

        if (c){
            System.out.println("2.c'li if calıstı");
        }
    }
}
