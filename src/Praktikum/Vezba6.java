package Praktikum;

import java.util.Scanner;

public class Vezba6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj zvezdice");
        int zvezdice = Integer.parseInt(s.nextLine());
        System.out.println(Zvezdice(zvezdice));

    }


    public static String Zvezdice(int zvezdice) {


        return zvezdice <= 1 ? "*\n" : " * " + Zvezdice(zvezdice-1);

    }
}
