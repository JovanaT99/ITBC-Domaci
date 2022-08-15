package n2domacisreda;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite godinu za proveru:");
        int godina = s.nextInt();
        boolean prestupna = isLeap(godina);
        System.out.println(prestupna);


    }

    public static boolean isLeap(int godina) {


        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {


            return true;

        } else {

            return false;
        }

    }
}
