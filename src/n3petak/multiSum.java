package n3petak;

import java.util.Scanner;

public class multiSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int[][] niz = new int[3][3];
        int[] niz2 = new int[niz.length];

        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                System.out.println("Unesi ");
                niz[i][j] = s.nextInt();
                System.out.println(niz[i][j]);

            }
        }
        int sum = 0;
        for (int[] ints : niz) {
            for (int anInt : ints) {
                sum = sum + anInt;

            }
        }
        System.out.println("Suma je:" + sum);
    }
}



