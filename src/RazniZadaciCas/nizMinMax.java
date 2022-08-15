package RazniZadaciCas;

public class nizMinMax {

    public static void main(String[] args) {

        int[] niz = {1, 2, 3, 45, 5};

        System.out.println(minMax(niz));
    }


    public static int minMax(int[] niz) {

        int min = niz[0];
        int max = niz[0];


        for (int temp : niz) {
            System.out.println(temp);
            if (temp > max) {

                max = temp;

            } else if (temp < min) {

                min = temp;
            }


        }

        return max;
    }
}
