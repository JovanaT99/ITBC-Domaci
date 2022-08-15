package n3domacisreda;

import java.util.ArrayList;

public class Zadatak2 {


    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Jovana");
        lista1.add("Pera");
        lista1.add("Mika");

        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add("Zika");
        lista2.add("Jovana");
        lista2.add("Bla");

        System.out.println(twoArrays(lista1, lista2));
    }

    public static boolean twoArrays(ArrayList<String> lista1, ArrayList<String> lista2) {
        for (String s : lista1) {
            if (lista2.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
