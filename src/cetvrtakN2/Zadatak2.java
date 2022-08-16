package cetvrtakN2;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        int[] niz1 = {342, 345, 123, 234, 5566, 87};
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();
        boolean yes = true;
        System.out.println(Find(niz1, broj));

    }

    public static boolean Find(int[] niz1, int broj) {


        for (int j : niz1) {
            if (broj == j) {

                return true;

            }
        }

        return false;
    }

}
