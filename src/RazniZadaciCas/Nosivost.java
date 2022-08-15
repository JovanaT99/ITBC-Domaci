package RazniZadaciCas;

import java.util.Scanner;

/*Пример:

        Унесите носивост: 9587
        Унесите број аутомобила: 3
        Унесите масу аутомобила 1: 1200
        Унесите масу аутомобила 2: 3800
        Унесите масу аутомобила 3: 1200

        Мост може да издржи све аутомобиле
*/
public class Nosivost {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite nosivnost:");
        int nosivost = s.nextInt();

        System.out.println("Unesite broj automobila:");
        int autoBr = s.nextInt();
        int sum = 0;

        for (int i = 0; i < autoBr; i++) {

            System.out.println("Unesite automobil" + " " + i);
            int masa = s.nextInt();
            sum = sum + masa;

        }
        System.out.println(sum);

        if (sum >= nosivost) {

            System.out.println("Most ne moze da izdrzi");

        } else {

            System.out.println("Мост може да издржи све аутомобиле");
        }

    }
}

