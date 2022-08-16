package w3resource;

import java.util.Scanner;

//38
public class CountMix {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite mesavinu:");
        String str = s.nextLine();
        System.out.println(mixCount(str));
    }

    public static String mixCount(String str) {


        int slova = 0;
        int space = 0;
        int broj = 0;
        int drugo = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                slova++;

            } else if (Character.isSpaceChar(str.charAt(i))) {
                space++;
            } else if (Character.isDigit(str.charAt(i))) {
                broj++;
            } else {
                drugo++;
            }

        }


        return " Slova:" + slova + "Space:" + space + "Broj: " + broj + " Drugo:" + drugo;
    }
}
