package codewars;

import java.util.Scanner;

public class forgSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int num = s.nextInt();
        System.out.println("Unesite drugi broj:");
        int num2 = s.nextInt();

        inccSum(num, num2);


    }

    public static void inccSum(int prvi, int drugi) {

        String string_number = Integer.toString(prvi);
        String string_number2 = Integer.toString(drugi);
        String rezultat = "";
        for (int i = 0; i < string_number.length(); i++) {
            int broj1 = Integer.parseInt(Character.toString(string_number.charAt(i)));
            int broj2 = Integer.parseInt(Character.toString(string_number2.charAt(i)));
            rezultat += broj1 + broj2;


        }
        System.out.println(rezultat);
    }


}


