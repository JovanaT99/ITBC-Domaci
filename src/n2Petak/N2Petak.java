package n2Petak;
//sort
//bubbleSort

import java.util.Arrays;

public class N2Petak {


    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 5, 65, 32, 2, 8};
        System.out.println(Arrays.toString(bubbleSort(niz)));
    }


    public static int[] bubbleSort(int[] niz) {

        for (int i = 0; i < niz.length; i++) {

            for (int j = 0; j < niz.length - i - 1; j++) {

                if (niz[j] > niz[j + 1]) {

                    int temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;
                }


            }

        }
        return niz;

    }
}