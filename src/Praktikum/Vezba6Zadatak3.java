package Praktikum;

import java.util.Scanner;

public class Vezba6Zadatak3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Visina:");
        int a = s.nextInt();
        System.out.println("Sirina");

        int b = s.nextInt();
        System.out.println(vratiPravogaonik(a, b));
    }

    public static String vratiZvedice(int a) {

        return a <= 1 ? "*\n" : "*" + vratiZvedice(a - 1);
    }

    public static String vratiPravogaonik(int a, int b) {

        String z = "";
        for (int i = 0; i < a; i++)

            z += vratiZvedice(b);
        return z;
    }


}
