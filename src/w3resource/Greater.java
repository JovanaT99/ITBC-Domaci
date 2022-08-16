package w3resource;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unos:");
        int prvi = s.nextInt();
        System.out.println("Unos:");
        int drugi = s.nextInt();
        System.out.println("Unos:");
        int treci = s.nextInt();
        boolean rezultat = true;
        System.out.println(equalthird(prvi, drugi, treci, rezultat));

    }

    public static boolean equalthird(int prvi, int drugi, int treci, boolean rezultat) {

        if (prvi < drugi && treci > drugi) {

            return rezultat;
        }

        return false;
    }
}
