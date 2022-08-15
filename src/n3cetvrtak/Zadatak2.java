package n3cetvrtak;

import java.util.ArrayList;

public class Zadatak2 {


    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Joki");
        lista.add("blablabla");
        lista.add("Nesto");
        lista.add("blal");
        lista.add("ghhjk");
        lista.add("jok");
        lista.add("j");
        ArrayList<String>test=new ArrayList<String>();


        for (int i = 0; i < lista.size(); i++) {
            if (lista.size()<= 4) {
                lista.remove(i);
                System.out.println(test.add(lista.get(i)));

            }
            else
            {
                System.out.println("test");
            }

        }

    }
}
