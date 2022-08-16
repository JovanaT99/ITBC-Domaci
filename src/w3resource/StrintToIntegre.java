package w3resource;
//51
import codewars.SameCh;

import java.util.Scanner;

public class StrintToIntegre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        String broj = s.nextLine();
        System.out.println(strtoint(broj));

    }

    public static int strtoint(String broj) {


        int novo=Integer.parseInt(broj);




        return novo;
    }
}
