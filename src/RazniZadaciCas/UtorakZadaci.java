package RazniZadaciCas;

import java.util.Scanner;

public class UtorakZadaci {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        System.out.println((contain2(st, '%')));
        System.out.println(indexof2(st,'%'));

    }

    public static boolean contain2(String str, char c) {

        boolean conteins = false; //Flag

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                conteins = true;
                break;
                //return true;
            }
        }
        return conteins;
        //return false;
    }
    public static int indexof2(String str, char c) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}

