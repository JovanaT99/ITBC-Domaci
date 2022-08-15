package w3resource;
//54

import java.util.Scanner;

public class SameDig {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Prvi");
        int prvi = s.nextInt();
        System.out.println("Drugi");
        int drugi = s.nextInt();
        System.out.println("Treci");
        int treci = s.nextInt();
        System.out.println(sameLastDigits(prvi,drugi,treci));

    }

    public static boolean sameLastDigits(int prvi, int drugi, int treci) {

        int poslednjiPrvi = prvi % 10;
        int poslednjiDrugi = drugi % 10;
        int poslednjiTreci = treci % 10;
        if (poslednjiDrugi == poslednjiPrvi || poslednjiDrugi == poslednjiTreci || poslednjiPrvi == poslednjiTreci) {

            return true;

        }

        return false;
    }
}
