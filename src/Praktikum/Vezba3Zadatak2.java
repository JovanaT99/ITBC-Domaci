package Praktikum;

import codewars.SameCh;

import java.util.Scanner;

public class Vezba3Zadatak2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite donju granicu:");
        int donja = s.nextInt();
        System.out.println("Unesite gornju granicu");
        int gornja = s.nextInt();
        System.out.println("Unesite korak:");
        int korak = s.nextInt();


        for (int i = donja; i < gornja; i++) {
           // System.out.println(i);

            if (donja <= gornja) {

                donja+= korak;

                System.out.println(donja);

            }


        }
    }
}
