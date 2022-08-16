package codewars;

import java.util.Scanner;

public class Trolls {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite string:");
        String unos = s.nextLine();
        System.out.println(eatVowels(unos));

    }

    public static String eatVowels(String unos) {
        String rezultat = "";

        for (int i = 0; i < unos.length(); i++) {
            char c = unos.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                rezultat += c;
            }

        }

        return rezultat;
    }
}
