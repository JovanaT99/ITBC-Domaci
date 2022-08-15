package n3cetvrtak;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(6);
        lista.add(12);
        lista.add(9);
        lista.add(13);
        lista.add(14);

        for (int i = 0; i < lista.size(); i++) {
            int paran = lista.get(i) % 2;

            if (paran == 0) {
                System.out.println(lista.get(i));
                lista.remove(i);

            }
        }
    }

}




