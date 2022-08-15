package javaarrayprograms;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(rotateArr(niz, n));

    }

    public static int[] rotateArr(int[] niz, int n) {
        for (int i = 0; i < n; i++) {

            int j;
            int prvi;
            prvi = niz[0];

            for (j = 0; j < niz.length - 1; i++) {

                niz[j] = niz[j + 1];
            }
            niz[j] = prvi;
        }


        System.out.println(Arrays.toString(niz));
        return niz;

    }
}
