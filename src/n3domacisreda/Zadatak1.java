package n3domacisreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite string");
        String unos = s.nextLine();
        int brojac = 0;

        ArrayList<String> lista = new ArrayList<String>();

        while (!unos.equalsIgnoreCase("STOP")) {

            lista.add(unos);
            unos = s.nextLine();
        }

        for (int i = 0; i < lista.size(); i++) {
            String rec = lista.get(i);

            if (rec.charAt(0) == rec.charAt(lista.get(i).length() - 1)) {
                brojac++;
            }
        }
        System.out.println(lista);
        System.out.println(brojac);
    }
}
