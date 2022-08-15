import java.util.Scanner;

public class PonedeljakVezba {


    public static int Suma2(int a, int b) {

        if (a < b) {

            return a;
        } else {

            return b;
        }

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int a = s.nextInt();
        System.out.println("Unesite drugi broj");
        int b = s.nextInt();

        Suma2(a,b);
        System.out.println(Suma2(a,b));

    }
}
