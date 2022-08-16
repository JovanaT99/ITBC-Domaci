package javaarrayprograms;

import java.util.Arrays;

public class CopyElements {

    public static void main(String[] args) {

        int[] niz = {1, 2, 3, 4, 5};
        int[] nizCopy = new int[niz.length];

        System.out.println(Arrays.toString(nizz(niz, nizCopy)));

    }

    public static int[] nizz(int[] niz, int[] nizCopy) {

        System.arraycopy(niz, 0, nizCopy, 0, niz.length);

        return nizCopy;

    }

}
