import java.util.Scanner;

public class Parni {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();

        int sumaParni = 0;
        int sumaNeparni = 0;


        for (int i = 0; i < broj; i++) {

            if (i % 2 == 0) {


                sumaParni = sumaParni + i;

            } else {

                sumaNeparni = sumaNeparni + i;
            }

        }

        System.out.println("parni" + sumaParni);
        System.out.println("neparni" + sumaNeparni);
    }

}





