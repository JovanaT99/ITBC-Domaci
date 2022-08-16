package Vezba;

import java.util.Scanner;

public class fibonacijevniz {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;
        while (broj > 0) {
            for (int i = 0; i <= broj; i++) {

                n3 = n1 + n2;


                if (n3 == broj) {


                    System.out.println("Fibernaci");
                    break;
                } else if (n3 > broj) {
                    System.out.println("Broj nije Fibernaci");
                    break;

                } else {

                    n1 = n2;
                    n2 = n3;


                }
            }

            broj = s.nextInt();
        }


    }
}

