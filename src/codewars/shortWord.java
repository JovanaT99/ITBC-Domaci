package codewars;

import java.util.Scanner;

public class shortWord {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvu rec");
        String rec1 = s.nextLine();
        System.out.println("Unesite drugu rec");
        String rec2 = s.nextLine();
        System.out.println("Unesite trecu rec");
        String rec3 = s.nextLine();
        System.out.println(wordlShort(rec1, rec2, rec3));

    }


    public static int wordlShort(String rec1, String rec2, String rec3) {

        int min = rec1.length();
        int max = rec1.length();
        String[] niz = {rec1, rec2, rec3};
        for (int i = 0; i < 3; i++) {


            if (niz[i].length() > max) {

                max = niz[i].length();

            } else if (niz[i].length() < max) {

                min = niz[i].length();
            }


        }


        return min;
    }

}
