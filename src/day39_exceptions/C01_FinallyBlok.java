package day39_exceptions;

public class C01_FinallyBlok {

    public static void main(String[] args) {

        int a= 10;
        int b= 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Bölen sayı-payda sıfır olamaz.");
        } finally {
            System.out.println("Finally blok çalıştı");
        }
    }
}