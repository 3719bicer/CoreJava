package day03_Marth_Increment;

public class C05_Pre_Post_Increment2 {
    public static void main(String[] args) {

        int a=10;
        a++;
        System.out.println(a); //11

        ++a;
        System.out.println(a); //12

        //Yeni bir variable olusturun, a nin degerini yeni variable a atayın.
        //sonra a nın degerini 1 artırın.

        int b=a;
        a++;
        System.out.println("a'nın degeri :" +a+ ", b'nin degeri :" +b); //a=13, b=12

        //Yeni bir variable olusturun, a nin degerini yeni variable a atayın.
        //sonra a nın degerini 1 artırın.

        int c=a++;
        System.out.println("a'nın degeri :" +a+ ", c'nin degeri :" +c); //a=14, c=13

        String s4="";

         a=3;
         b=4;
        System.out.println(a+s4+b);

    }
}
