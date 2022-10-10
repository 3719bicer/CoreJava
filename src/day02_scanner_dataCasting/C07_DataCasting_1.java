package day02_scanner_dataCasting;

public class C07_DataCasting_1 {
    public static void main(String[] args) {

        String isim="Esra";
        isim="Ayşe";

        //isim='s'; String bir variable a boolean, int veya char bir deger atanamaz.

        boolean iyiMi=true;

        //iyiMi='r' ; boolean data türündeki bir variable a da String, char veya int atanamaz.

        int sayiInt=12;
        short sayiShort=20;
        byte sayiByte=21;
        double sayiDouble=14;

        //ayni veya benzer datalar içeren variable'larda ise kontrollü geçiş mümkündür.

        sayiDouble = sayiInt; //büyük>küçük
        sayiInt =  sayiShort; //büyük>küçük

        sayiByte = (byte) sayiInt; //küçük<büyük
        sayiShort = (short) sayiDouble; //küçük<büyük

        System.out.println(sayiByte);
        System.out.println(sayiShort);


    }
}
