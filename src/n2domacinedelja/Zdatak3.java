package n2domacinedelja;


import java.util.Scanner;

public class Zdatak3 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite string");
        int[] niz = {1, 2, 3, -6, -3, -2, 5, 8, -6, -2, -6};
        System.out.println("Lokacija1:");
        int lokacija1 = s.nextInt();
        System.out.println("Lokacija2:");
        int lokacija2 = s.nextInt();
        System.out.println("Od indexa " + lokacija1 + " do indexa " + lokacija2 + " nalaze se " + location(lokacija1, lokacija2, niz) + " negativnog broja.");

    }


    public static int location(int lokacija1, int lokacija2, int[] niz) {


        int brojNegativnih = 0;
        for (int i = lokacija1; i <= lokacija2; i++) {


            if (niz[i] < 0) {

                brojNegativnih++;
            }
        }


        return brojNegativnih;
    }


}
