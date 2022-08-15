package RazniZadaciCas;

import java.util.Scanner;

public class Domaci3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite trocifren broj:");
        int trBroj = s.nextInt();

        int stotina = (trBroj % 1000) / 100;
        int desetica = (trBroj % 100) / 10;
        int jedinica = (trBroj % 10);


        System.out.println("Cifra stotine je: " + stotina);
        System.out.println("Cifra desetice je: " + desetica);
        System.out.println("Cifra jedinice je: " + jedinica);

        double arms = (Math.pow(stotina, 3) + Math.pow(desetica, 3) + Math.pow(jedinica, 3));
        System.out.println("Rezultat pow-a je: " + arms);

        if (trBroj == arms) {

            System.out.println("Broj jeste Армстронгов");

        } else {

            System.out.println("Broj nije arms");
        }
    }
}

