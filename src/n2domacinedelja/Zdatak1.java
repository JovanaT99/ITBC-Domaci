package n2domacinedelja;

import java.util.Scanner;

public class Zdatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite string");
        String unos = s.nextLine();
        System.out.println(reverse(unos));


    }

    public static String reverse(String unos) {
        String rezultat = "";

        for (int i = unos.length() - 1; i >= 0; i--) {

            rezultat += unos.charAt(i);
        }


        return rezultat;


    }
}

