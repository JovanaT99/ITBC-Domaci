package n3utorak;

import java.util.ArrayList;
import java.util.Scanner;

import static javax.sound.midi.ShortMessage.STOP;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite");
        int unos = s.nextInt();
        int stop = 0;
        double tot = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (unos != 0) {
            list.add(unos);
            System.out.println(list);
            unos = s.nextInt();
        }

        for (Integer integer : list) {
            tot += integer;
        }

        System.out.println(tot / list.size());
    }
}

