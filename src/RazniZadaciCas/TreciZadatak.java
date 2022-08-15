package RazniZadaciCas;

import java.util.Scanner;

public class TreciZadatak {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi a");
        int a = s.nextInt();
        System.out.println("Unesi b");
        int b = s.nextInt();
        System.out.println(sum(a, b));

    }
    public static int sum(int a, int b) {
        int suma = 0;
        for (int i = a; i <= b; i++) {

            suma = suma + i;
        }
        return suma;

    }
}
