package w3resource;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite  string");
        String unos = s.nextLine();
        System.out.println(reverseStr(unos));

    }


    public static String reverseStr(String unos) {
        String novi = "";
        for (int i = unos.length()-1; i >= 0 ; i--) {

            novi += unos.charAt(i);

        }

        return novi;

    }
}
