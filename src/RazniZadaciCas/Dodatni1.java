package RazniZadaciCas;

import java.util.Scanner;

public class Dodatni1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N:");
        int N = s.nextInt();
        System.out.println("Unesite M:");
        int M = s.nextInt();

        int rezultat = 0;
        for (int i = N; i <= M; i++) {


            rezultat += i;

        }
        System.out.println(rezultat);


    }
}
