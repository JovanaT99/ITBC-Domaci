package Praktikum;

import codewars.SameCh;

import java.util.Scanner;

public class Vezba4Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int unos = s.nextInt();
        int fact = 1;

        for (int i = 1; i <= unos; i++) {

            fact *= i;

        }
        System.out.println(fact);
    }
}
