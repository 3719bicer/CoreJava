package A001_MyProject;

public class PasByValue {

    public static void method(int arg1, int arg2){
        arg1 = 1;
        arg2 = 2;
    }

    public static void main(String[] args) {
        int arg1=5;
        int arg2=10;
        method(arg1,arg2);
        System.out.println(arg1);
        System.out.println(arg2);
    }


}
