package Praktikum;

import java.util.Scanner;

public class Vezba4Zadatak2 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rec:");
        String rec = s.nextLine();
        String reverse="";

        for (int i=rec.length()-1; i>=0;i--){
                reverse+=rec.charAt(i);

        }
        System.out.println(reverse);
    }
}
