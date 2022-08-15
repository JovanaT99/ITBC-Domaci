package RazniZadaciCas;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();

        if (broj <= 5) {

            System.out.println("Radni dan je a unet broj je" + " " + broj);

        } else {


            System.out.println("Vikend je");
        }


    }
}
