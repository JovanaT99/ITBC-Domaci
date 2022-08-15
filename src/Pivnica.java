import java.util.Scanner;

public class Pivnica {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Добродошли у пивницу ITBC, колико имате година?");
        double broj = s.nextDouble();

        if (broj >= 18) {

            System.out.println("За Вас имамо одлично пшенично пиво");

        } else if (broj <= 0) {

            System.out.println("Unesite pozitivan broj");

        } else {

            System.out.println("Za vas je sok");
        }

    }
}
