package n3cetvrtak;

import java.util.ArrayList;

public class Zadatak3 {


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(6);
        lista.add(-12);
        lista.add(9);
        lista.add(13);
        lista.add(14);

        ArrayList<Integer>listaPozitivnih=new ArrayList<Integer>();
        ArrayList<Integer>listaNegativnih=new ArrayList<Integer>();

        for (Integer integer : lista) {

            if (integer > 0) {

                System.out.println(listaPozitivnih.add(integer));

            } else {
                System.out.println(listaNegativnih.add(integer));
            }

        }

    }
}
