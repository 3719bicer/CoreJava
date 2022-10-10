package A001MyProject;

import java.util.Scanner;

public class Q6_UcakBileti_AnısS {
    public static void main(String[] args) {

         /*
        A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        km birim fiyati : 0.10$
        12 yasindan kucukse toplam fiyat %50 indirim
        12 ve 24 yas arasindaysa 10% indirim
        65 yasindan buyukse 30% indirim
        gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
        bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini hesaplayan program yazınız
        */


            //Sabit degiskenler
            int distanceAtoB = 500;
            int distanceAtoC = 700;
            int distanceAtoD = 900;
            double pricePerKM = 0.1;

            //Musterinden gelen degiskenler
            String destinationCity;
            String isRoundTrip;
            int age;

            //Hesaplama degiskenleri
            double totalCost = 0;
            int totalDiscount = 0;
            Scanner scanner = new Scanner(System.in);

            //Getting correct inputs
            System.out.println("Lütfen gideceginiz sehri giriniz!");
            destinationCity = scanner.nextLine().trim().substring(0, 1).toUpperCase();
            if (!("B".equals(destinationCity) || "C".equals(destinationCity) || "D".equals(destinationCity))) {
                System.out.println("Sadece A, B, ve C sehirlerine seferlermiz mavcuttur.");
                System.exit(0);
            }

            System.out.println("Lütfen yasinizi giriniz!");
            age = scanner.nextInt();
            scanner.nextLine(); // To jump to the nextLine for the next input.
            if (age < 0) {
                System.out.println("Yasiniz 0'dan kucuk olamaz!");
                System.exit(0);
            }

            System.out.println("Biletiniz gidis donus mu olacak?");
            isRoundTrip = scanner.nextLine().trim().substring(0, 1).toUpperCase();

            scanner.close();

            if (!(("E".equals(isRoundTrip)) || "H".equals(isRoundTrip))) {
                System.out.println("Evet ya da Hayir seceneklerinden birini secmelisiniz!!");
                System.exit(0);
            }

            //Calculation
            switch (destinationCity) {
                case "B":
                    totalCost = distanceAtoB * pricePerKM;
                    break;
                case "C":
                    totalCost = distanceAtoB * pricePerKM;
                    break;
                case "D":
                    totalCost = distanceAtoB * pricePerKM;
                    break;
            }

            if (age < 12) totalDiscount += 50;
            else if (age >= 12 && age < 24) totalDiscount += 10;
            else if (age >= 65) totalDiscount += 30;

            if ("E".equals(isRoundTrip)) {
                totalCost *= 2;
                totalDiscount += 20;
            }

            System.out.println("Total Cost = $" + totalCost);
            totalDiscount = (int) (totalCost * totalDiscount / 100);
            System.out.println("Total Discount = $" + totalDiscount);
            ;
            totalCost -= totalDiscount;
            System.out.println("Discounted Cost = $" + totalCost);

    }
}
