package day14_methodCreation;

import java.util.ArrayList;
import java.util.List;

public class C07_MethodTekrari {

    /*
     * Method yazarken:
     * 1. Bu method neye igtiyaci var. (parametreye tanimlama)
     * 2. Bu islemini tamaladiktan sonra sonuc olarak ne vermeli (Ogrenci listesi yazdirma da void, ama toplamada int cunku sonucu var)
     * 3. Islemi gerceklesiriken hata cikma olasiligi var mi? 0' a bolme olasiligi gibi
     * 4. Cikacak hata Handle edilmek zorunda mi degil mi? (Hata Exception sinifindan turemis bir hata mi yok Runteime Exception sinifindan turemis bir hata mi?)
     * 5. Bu hatayi methodun icerisinde handle etmelimiyim yoksa kullanicilara haber mi vermeliyim?
     * 6. Yukardaki verecegimiz karara gore hatayi try catch ile handle ederim ya da methodun sonuna throws diyerek methodu kullanacaklara haber veririm.
     * 7. Methoda verilen isim yaptigi ise uygun mu degil mi?
     */


    public static void printStudents(List<String> studentList) throws Exception {
        if (studentList == null || studentList.size() == 0) {
            throw new Exception("Liste bos oldugu icin yazdiramiyorum!");
        }
        for (String student : studentList) {
            System.out.println(student);
        }
        return;
    }


    public static void printStudents_2(List<String> studentList) {
        try {
            if (studentList == null || studentList.size() == 0) {
                throw new Exception("Liste bos oldugu icin yazdiramiyorum!");
            }
            for (String student : studentList)
                System.out.println("student = " + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*
         * Methodu cagiriken>
         * 1. Ne elde etmek istiyorum. (toplamada sonuc)
         * 2. Bu methoda herhangi arguman gondermeli miyim?
         * 3. Bu methodu cagirdigimda herhangi hata ile karsilasir miyim?
         * 4. Karislastigim hata handle edilmek zorunda mi? (Hata axception mi yoksa runtimeException sinifindan mi turetilmis)
         * 5. Zorundaysa method bunu handle etmis mi?
         * */

        List<String> studentList = null;
        try {
            printStudents(studentList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<String> studentList_2 = new ArrayList<>();
        try {
            printStudents(studentList_2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        printStudents_2(studentList);



    }
}