/*Корисник уноси два реална броја
        1. Исписати да ли је производ ова два броја позитиван
        2. Исписати да ли је збир ова два броја већи од 150
        3. Исписати који је већи од ова два броја*/

import java.util.Scanner;

public class Domaci1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi realan broj:");
        double prviBr = s.nextDouble();
        System.out.println("Unesite drugi realan broj");
        double drugiBr = s.nextDouble();

        double proizvod = prviBr * drugiBr;
        double zbir = prviBr + drugiBr;

        System.out.println("Broj je pozitivan: " + (proizvod > 0));

        System.out.println("Broj je veci od 150: " + (zbir > 150));

        if (prviBr > drugiBr) {

            System.out.println("Veci je prvi: " + prviBr);
        } else {
            System.out.println("Veci je drugi: " + drugiBr);
        }

    }


}
