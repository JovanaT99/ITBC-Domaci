package n3domacisreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite string");
        String unos = s.nextLine();
       


        ArrayList<Object> lista = new ArrayList<Object>();

        while (!unos.toString().equalsIgnoreCase("STOP")) {

            lista.add(unos);
            unos = s.nextLine();

        }
        System.out.println(getRandomString(lista));
    }

    public static Object getRandomString(ArrayList<Object> lista) {

        int random = (int) (Math.random() * (lista.size()));

        return lista.get(random);
        
        

    }
}
