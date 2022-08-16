package n2domacisreda;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int broj1 = s.nextInt();
        System.out.println("Unesite drugi broj:");
        int broj2 = s.nextInt();
        //int max;
        comparNum(broj1, broj2);


    }

    public static void comparNum(int prvi, int drugi) {

        if (prvi > drugi) {
            //max = prvi;
            System.out.println("Veci je prvi");

        } else if (prvi == drugi) {
            System.out.println("Jednaki su");
        } else {
            //max = drugi;
            System.out.println("Veci je drugi");
        }

    }

}
