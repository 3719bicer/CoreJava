package day03_Marth_Increment;

public class C04_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        System.out.println("a'nın değeri : " + ++a); //11

        int b= a++; // önce atama yap b=11 , sonra değer artır a=12.
        System.out.println("b'nın değeri : " + b); // b:11, a=12

        int c= b++ + a; // önce atma c=11+12=23, a=12 , b=12

        System.out.println("c'nın değeri : " + c);
        System.out.println("Son toplam : " + (a+b+c));
    }
}
