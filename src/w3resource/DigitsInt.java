package w3resource;
//33
import java.util.Scanner;

public class DigitsInt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();
        System.out.println(sumDigit(broj));
    }

    public static int sumDigit(int broj) {
        int sum = 0;

        while (broj != 0) {
            sum += broj % 10;
            broj /= 10;


        }
        return sum;
    }
}

