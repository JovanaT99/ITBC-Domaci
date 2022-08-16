package w3resource;

import java.util.Scanner;

//55
public class SecondtoTime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sekunde:");
        int unos = s.nextInt();
        System.out.println(secondTo(unos));
    }

    public static int secondTo(int unos) {


        int sat = unos / 3600;
        System.out.println(sat);

        int minuti = (unos - (sat * 3600)) / 60;
        System.out.println(minuti);

        int sekunde = (unos - (unos - (sat * 3600)) ) / 60;
        System.out.println(sekunde);


        return sat;
    }


}
