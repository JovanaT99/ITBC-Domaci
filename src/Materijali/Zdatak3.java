package Materijali;

import java.util.Scanner;

public class Zdatak3 {

    // Dva najmanja clana niza
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unesi broj clanova niza: ");
        int n = input.nextInt();

        int niz[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("niz[" + i + "]= ");
            niz[i] = input.nextInt();
        }

        int nmin = niz[0], nmin2 = niz[0], imin = 0, imin2 = 0;

        for (int i = 0; i < n; i++) {
            if (niz[i] < nmin) {
                imin = i;
                nmin = niz[i];
            }
        }
        if (imin == 0) {

            imin2 = 1;
            nmin2 = niz[1];
        }
        for (int i = 0; i < n; i++) {
            if (niz[i] < nmin2 && i != imin) {
                nmin2 = niz[i];
                imin2 = i;
            }
        }

        System.out.println("Najmanji clan niza: " + nmin + ", a indeks: " + imin);
        System.out.println("Najmanji clan niza2: " + nmin2 + ", a indeks: " + imin2);
    }
    }

