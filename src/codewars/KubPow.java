package codewars;

import java.util.Scanner;

public class KubPow {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int prvi = s.nextInt();
        System.out.println("Unesite drugi broj:");
        int drugi = s.nextInt();
        System.out.println(cubeSum(prvi, drugi));

    }

    public static int cubeSum(int broj1, int broj2) {

        if (broj1 == broj2) {
            return 0;

        }
            int res = 0;

            for (int i = broj1 + 1; i < broj2; i++) {


                res += (int) Math.pow(i, 3);


            }

            return res;
        }

    }




