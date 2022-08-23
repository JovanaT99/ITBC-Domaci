package n4utorak;

import w3resource.SecondtoTime;

import java.util.*;

public class Zadatak2 {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        int[] arr = {1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8};


        for (var el : arr) {

            set.add(el);

        }
        int[] nizz = new int[set.size()];
        int b = 0;

        for (var el : set) {

            nizz[b] = el;
            b++;

        }
        System.out.println(Arrays.toString(nizz));

    }

}

