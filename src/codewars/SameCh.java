package codewars;

import java.util.Locale;
import java.util.Scanner;

public class SameCh {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        String unos = s.next().toLowerCase(Locale.ROOT);


        System.out.println(isSame(unos));
    }

    public static boolean isSame(String unos) {
        int brojac = 0;
        int brojac2 = 0;
        for (int i = 0; i < unos.length(); i++) {

            char c = unos.charAt(i);
            System.out.println(c);
            if (c == 'x') {
                brojac++;

            }
            if (c == 'o') {

                brojac2++;

            }

        }
        return brojac == brojac2;

    }
}
