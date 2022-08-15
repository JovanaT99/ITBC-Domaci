package RazniZadaciCas;

import java.util.Scanner;

public class Random {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        int x = (int) (Math.random() * 100);

        if (broj == x) {

            System.out.println("Broj je jednak");

        } else {
            System.out.println("Broj nije jednak");
        }


    }
}
