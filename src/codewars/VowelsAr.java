package codewars;

import java.util.Scanner;

public class VowelsAr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite niz");
        String str = s.nextLine();
        System.out.println(VowelsArrays(str));

    }

    public static int VowelsArrays(String str) {
        int rezultat = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                rezultat++;
            }

        }

        return rezultat;
    }

}
