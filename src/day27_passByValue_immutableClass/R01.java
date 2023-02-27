package day27_passByValue_immutableClass;

public class R01 {
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println(indirimYap10(fiyat));//90.0
        System.out.println(indirimYap20(fiyat));//80.0
        System.out.println(indirimYap30(fiyat));//70.0

        System.out.println(fiyat);//100.0
    }
    public static double indirimYap10(double fiyat){
        return fiyat*0.9;
    }
    public static double indirimYap20(double fiyat){
        return fiyat*0.8;
    }
    public static double indirimYap30(double fiyat){
        return fiyat*0.7;
    }
}
