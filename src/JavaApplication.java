import java.util.Locale;
import java.util.Scanner;

public class JavaApplication {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        double broj = s.nextDouble();
        double korenBroja = Math.sqrt(broj);
        if (korenBroja == 5.0) {
            System.out.println("Ispravno");
        } else {
            System.out.println("Neispravno");
        }

    }
}
