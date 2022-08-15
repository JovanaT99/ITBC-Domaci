package n2domacisreda;

import java.util.Scanner;

public class Zadata3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        String trBroj = s.next();
        boolean resenje = isArms(trBroj);
        System.out.println(resenje);

    }


    public static boolean isArms(String broj) {

        double arms = 0;
        for (int i = 0; i < broj.length(); i++) {
            int cifra = Integer.parseInt(Character.toString(broj.charAt(i))); //
            System.out.println(cifra);
            arms += (Math.pow(cifra, broj.length()));

        }
        //System.out.println( Double.parseDouble(broj) == arms);
        return Double.parseDouble(broj) == arms;
    }
}
