package RazniZadaciCas;

import java.util.Scanner;

public class Sum3 {


    public static int Suma3(int a, int b, int c) {

        if (a <= b && a <= c) {


            System.out.println(a);

        } else if (b <= a && b <= c) {

            System.out.println(b);

        } else {

            System.out.println(c);

        }
        return Suma3(a,b,c);
    }
        public static void main (String[]args){

            Scanner s = new Scanner(System.in);
            System.out.println("Unesite prvi broj");
            int a = s.nextInt();
            System.out.println("Unesite drugi broj");
            int b = s.nextInt();
            System.out.println("Unesite treci broj");
            int c = s.nextInt();
            int najmanji;


            //Suma3(a, b, c);
            System.out.println(Suma3(a, b, c));

        }
    }


