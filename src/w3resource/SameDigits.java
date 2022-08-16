package w3resource;
//54
import java.util.Scanner;

public class SameDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unos:");
        String prvi = s.nextLine();
        /*System.out.println("Unos:");
        int drugi = s.nextInt();
        System.out.println("Unos:");
        int treci = s.nextInt();*/
        boolean rezultat = true;
        System.out.println(sameDig(prvi, rezultat));
    }


    public static boolean sameDig(String prvi, boolean rezultat) {

        //int sum = 0;
        for (int i = 0; i < prvi.length(); i++) {
            
            System.out.println(prvi.charAt(i));


        }


        return false;

    }
}
