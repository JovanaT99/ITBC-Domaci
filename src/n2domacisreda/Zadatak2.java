package n2domacisreda;

import java.util.Scanner;

public class Zadatak2 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite trocifren broj:");
        int trBroj = s.nextInt();
        boolean isArms = isArms(trBroj);
        System.out.println(isArms);

    }

    public static boolean isArms(int broj) {

        int stotina = (broj % 1000) / 100;
        int desetica = (broj % 100) / 10;
        int jedinica = (broj % 10);


        // System.out.println("Cifra stotine je: " + stotina);
        //System.out.println("Cifra desetice je: " + desetica);
        //System.out.println("Cifra jedinice je: " + jedinica);

        double arms = (Math.pow(stotina, 3) + Math.pow(desetica, 3) + Math.pow(jedinica, 3));
        // System.out.println("Rezultat pow-a je: " + arms);

        if (broj == arms) {

            // System.out.println("Broj jeste Армстронгов");
            return true;

        } else {
            return false;
            // System.out.println("Broj nije arms");
        }


    }
}
