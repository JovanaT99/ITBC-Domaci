package n4utorak;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadatak1 {


    public static void main(String[] args) {


        Set<String> skup=new HashSet<>();

        skup.add("Pera");
        Scanner unos=new Scanner(System.in);
        String n=unos.nextLine();
        skup.add(n);


        System.out.println(skup);







    }
}
