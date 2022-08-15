package RazniZadaciCas;

import java.util.Scanner;

public class Domaci4 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();
        System.out.println("Korisnik unosi: " + broj);
        System.out.println("Ispis:");
        for (int i = 1; i <= broj; i++) {

           System.out.println(i);

           int sum=i++;
        }


    }
}

