package n3utorak;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> kola = new ArrayList<String>();

        kola.add("BMW");
        kola.add("asd");
        kola.add("123");


        System.out.println(kola);
        System.out.println(kola.get(0));
        kola.set(0, "Opel");
        kola.remove(1);
        for (String s : kola) {
            Scanner sc= new Scanner(System.in);
            String x = sc.nextLine();
            kola.add(x);

            System.out.println(s);
        }
    }
}
