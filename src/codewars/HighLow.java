package codewars;

import java.util.Scanner;

public class HighLow {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite brojeve:");
        String brojevi = s.next();

        System.out.println(HigLo(brojevi));

    }

    public static String HigLo(String brojevi) {
        int max = Integer.parseInt(Character.toString(brojevi.charAt(0)));
        int min = Integer.parseInt(Character.toString(brojevi.charAt(0)));
        for (int i = 0; i < brojevi.length(); i++) {

            if (Character.isDigit(brojevi.charAt(i))) {
                int ch = Integer.parseInt(Character.toString(brojevi.charAt(i)));

                //System.out.println(ch);
                if (ch > max) {
                    max = ch;
                }
                if (ch < min)
                    min = ch;


            }

        }
        return max + " " + min;


    }
}
