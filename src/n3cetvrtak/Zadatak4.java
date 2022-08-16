package n3cetvrtak;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Stack;

public class Zadatak4 {
    public static void main(String[] args) {
        Stack<Character> stek = new Stack<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite");
        String unos = s.nextLine();

        String rev = "";
        for (int i = 0; i < unos.length(); i++) {

            stek.push(unos.charAt(i));

        }

        while (!stek.isEmpty()) {
            rev += stek.pop();


        }
        System.out.println(rev);
    }
}
