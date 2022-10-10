package A002_Team1;

public class Q14_ReserveNumber {
    public static void main(String[] args) {

        int input=12345;
        System.out.println("Girilen sayi :" + input);
        System.out.println("Girilen sayının tersi : " + reserveNumber(input));

    }
    public static int reserveNumber(int number){

        int output=0;

        while (number>0){
            output=output*10 + number%10;
            number=number/10;

        }
        return output;
    }
}
