package Materijali;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite clanove niza:");
        int n = s.nextInt();
        int[] niz = new int[n];
        System.out.println("Unesite clanove:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = s.nextInt();

        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);

        }

    }
}
