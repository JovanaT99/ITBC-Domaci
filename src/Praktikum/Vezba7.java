package Praktikum;

import java.util.*;

public class Vezba7 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Sporet");
        list.add("Cekic");
        list.add("Izlaz");
        list.add("STOP");

        //System.out.println(list);
        int i = 0;
        while (i < list.size() - 1) {

            System.out.println(list.get(i++) + ",");
        }

        System.out.println(list.get(i) + ".\n");

        System.out.println("Unesi nove pojmove:");
        Scanner s = new Scanner(System.in);
        String novi = s.nextLine();

        while (!novi.toLowerCase(Locale.ROOT).equals("stop")) {

            list.add(novi);
            novi = s.nextLine();
        }

        i = 0;
        while (i < list.size() - 1) {

            System.out.println(list.get(i++) + ",");
        }
        System.out.println(list.get(i) + ".\n");


        System.out.println("Sta zelite da uklonite");
        novi = s.nextLine();
        list.remove(novi);
        System.out.println("Nakon remove:");

        i = 0;
        while (i < list.size() - 1) {

            System.out.println(list.get(i++) + ",");
        }
        System.out.println(list.get(i) + ".\n");

        String najduzi = list.get(0);


        for (i = 1; i < list.size(); i++) {

            if (najduzi.length() < list.get(i).length()) {
                najduzi = list.get(i);

                System.out.println("Najduzi" + najduzi);

            }
            String najkraci = list.get(0);


            for (i = 1; i < list.size(); i++) {

                if (najkraci.length() > list.get(i).length()) {
                    najkraci = list.get(i);

                    System.out.println("Najkraci" + najkraci);

                    System.out.println("Sortiranje po abecedi:");

                    Collections.sort(list);
                    i = 0;
                    while (i < list.size() - 1) {

                        System.out.println(list.get(i++) + ",");
                    }
                    System.out.println(list.get(i) + ".\n");

                }

            }
        }
    }
}
    