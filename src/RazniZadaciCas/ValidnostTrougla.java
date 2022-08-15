package RazniZadaciCas;

import java.util.Scanner;

public class ValidnostTrougla {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite stranice trougla");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {

            System.out.println("Sve ok");
        } else {

            System.out.println("Nije ok");
        }


    }
}

