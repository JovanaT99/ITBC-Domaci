import java.util.Scanner;

public class Domaci2 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite godinu koju zelite da proverite:");
        int godina = s.nextInt();


        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {

            System.out.println("Godina je prestupna");

        } else {
            System.out.println("Godina nije prestupna");
        }


    }
}