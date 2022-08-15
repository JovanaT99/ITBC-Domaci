import java.util.Scanner;

public class Deljivost {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Unesite broj");
        int broj = s.nextInt();

        if (broj % 5 == 0 && broj % 11 == 0) {

            System.out.println("Broj je deljiv sa 5 i 11");


        } else if (broj % 5 == 0) {

            System.out.println("Broj je deljiv sa 5");
        } else if (broj % 11 == 0) {

            System.out.println("Broj je deljiv sa 11");

        }
    }

}
