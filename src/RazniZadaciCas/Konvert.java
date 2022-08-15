package RazniZadaciCas;

import java.util.Scanner;

public class Konvert {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Изаберите степен из ког претварате:");
        String degreeChoice = s.nextLine();

        System.out.println("Unesite broj");
        float broj = Float.parseFloat(s.nextLine());
        float resenje;
        if (degreeChoice.equalsIgnoreCase("C")) {
            resenje = ((broj * 9) / 5) + 32;
            System.out.println(resenje);

        } else if (degreeChoice.equalsIgnoreCase("F")) {
            resenje = ((broj - 32) * 5) / 9;
            System.out.println(resenje);
        } else {
            System.out.println("Неправилан унос");
        }


    }

}

