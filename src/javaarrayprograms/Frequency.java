package javaarrayprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Frequency {

    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 2, 7, 8, 8, 8, 9, 1, 3};
        Arrays.sort(niz);
        System.out.println(Arrays.toString(niz));
        int[] nizCopy = new int[niz.length];
        System.out.println(ponavljanje(niz, nizCopy));

    }

    public static String ponavljanje(int[] niz, int[] nizCopy) {
        int duzinaNiza=niz.length;
        for (int i = 0; i < niz.length; i++) {
            int count = 1; //jedan sig postoji
            for (int j = i + 1; j < niz.length; j++) {

                if (niz[i] == niz[j]) {

                    count++;
                }

            }
            duzinaNiza-=count;


        }

        System.out.println(Arrays.toString(nizCopy));
        return "";
    }

    public static boolean contains(int[] niz, int broj) {

        for (int j : niz) {


            if (j == broj) {

                return true;
            }
        }


        return false;

    }
}

