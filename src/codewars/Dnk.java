package codewars;

import java.util.Scanner;

public class Dnk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rec");
        String unos = s.nextLine();
        System.out.println(dnkCh(unos));

    }


    public static String dnkCh(String unos) {
        char[] niz = unos.toCharArray();

        for (int i = 0; i < niz.length; i++) {
            switch (niz[i]) {
                case 'T':
                    niz[i] = 'A';
                    break;
                case 'A':
                    niz[i] = 'T';
                    break;
                case 'C':
                    niz[i] = 'G';
                    break;
                case 'G':
                    niz[i] = 'C';
                    break;
                default:
                    break;


            }
        }
        return String.valueOf(niz);

    }
}
