package A001_MyProject;

public class Deneme2 {
    static int sayi = 20;
    int yas = 40;

    public Deneme2(){
        sayi++;
        yas++;
    }

    public static int Method1(){
        return sayi;
    }

    public int Method2(){
        return yas;
    }

    public static void main(String[] args) {

        Deneme2 obj1 = new  Deneme2();
        Deneme2 obj2 = new  Deneme2();
        Deneme2 obj3 = new  Deneme2();
        System.out.println(obj3.yas + "" + obj3.sayi);
    }
}
