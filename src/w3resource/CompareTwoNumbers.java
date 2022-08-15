package w3resource;
//32
import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi prvi broj:");
        int prvi = s.nextInt();
        System.out.println("Unesi drui broj:");
        int drugi = s.nextInt();
        System.out.println((compareTwo(prvi, drugi, s)));

    }

    public static String compareTwo(int prvi, int drugi, Scanner s) {
        String rezultat;
        if (prvi == drugi) {

            rezultat = "jednaki";


        } else if (prvi > drugi) {
            rezultat = "Prvi je veci";

        } else {


            rezultat = "Drugi je veci";

        }

        return rezultat;


    }


}
