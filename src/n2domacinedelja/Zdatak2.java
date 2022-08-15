package n2domacinedelja;

import java.util.Arrays;

public class Zdatak2 {

    public static void main(String[] args) {
        int[] niz = {2, 3, 4, 2, 6, 6, 1};
        System.out.println(secondNum(niz));
    }

    public static int secondNum(int[] niz) {
        int max = niz[0];
        int pretposlednjiMax = niz[0];
        Arrays.sort(niz);

        for (int i = 0; i < niz.length; i++) {


            if (niz[i] > max) {

                pretposlednjiMax = max;
                max = niz[i];

            }
        }

        return pretposlednjiMax;
    }
}
