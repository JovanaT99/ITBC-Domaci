package Praktikum;

import java.util.Scanner;

public class Vezba6zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi stranicu:");
        int a = s.nextInt();
        System.out.println(vratiKvadrat(a));
    }

    public static String vratiZvzedice(int a) {

        return a <= 1 ? "*\n" : "*" + vratiZvzedice(a-1);


    }

    public static String vratiKvadrat(int a) {
        return "" + vratiZvzedice(a).repeat(Math.max(0, a));
        }



}
