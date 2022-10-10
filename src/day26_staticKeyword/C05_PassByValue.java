package day26_staticKeyword;

public class C05_PassByValue {

    public static void main(String[] args) {

        String a="aaa";
        System.out.println(a);
        a+=2;
        System.out.println("a: "+ a);

        int sayi=10;
        sayi= method1(sayi); // 100
        System.out.println(sayi); // 100
    }
    public static int  method1(int sayi){
        sayi=sayi*sayi;
        return sayi;



    }
}
