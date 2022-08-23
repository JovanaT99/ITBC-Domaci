package n4utorak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadatak3 {

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
        //System.out.println(Arrays.toString(nizz));
        int[] Dupl = new int[arr.length];
        int duplikat = 0;

        for (int i = 0; i < arr.length; i++) {

                if (nizz[b] == arr[i]) {
                    Dupl[duplikat]++;
//
              }
//            }
        }
        System.out.println(Dupl);
        //int [] Dupl=new int[arr.length];
        // int duplikat=0;

//        for(int i=0; i< arr.length; i++){
//            if(nizz[b]==Dupl.length){
//                duplikat++;
//            }
//        }


    }
}




