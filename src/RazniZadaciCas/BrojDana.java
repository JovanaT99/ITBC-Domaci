package RazniZadaciCas;

import java.util.Scanner;

public class BrojDana {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Unesite broj dana:");
        int broj = s.nextInt();

        int godina = broj / 365;
        broj = broj % 365;


        System.out.println("Broj godina je:" + " " + godina);

    }
}
