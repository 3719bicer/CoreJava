package day02_scanner_dataCasting;

public class C09_DataCasting_3 {
    public static void main(String[] args) {

        int intSayi=567;

        byte byteSayi=(byte) intSayi;

        System.out.println("intsayi : " + intSayi + "'yi byte'a çevirirsek değeri : " + byteSayi); //55

        /*
            Data Casting Ozet;
            1- Eğer küçük data türündeki datayı,
                büyük data türündeki variable'a atama yaparsak ===> Outo casting(otomatik genişler)
            2- Eğer büyük data türündeki datayı,
                küçük data türündeki variable'a atama yaparsak,
                *Java işlemi otomatik yapmaz, SORUMLULUĞU BİZDEN ALMAK İSTER.
                *Data kaybı(ondalıklı kısmın gitmesi) veya dönüşüm olabilir.
         */
        // System.out.println("Girilen harften 1 sonraki Harf : " + (char)(girilenHarf+1));
        //        System.out.println("Girilen harften 2 sonraki Harf : " + (char)(girilenHarf+2));
        //        System.out.println("Girilen harften 3 sonraki Harf : " + (char)(girilenHarf+3));
    }
}
