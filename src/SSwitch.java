import java.util.Scanner;

public class SSwitch {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite brojeve:");
        int broj = s.nextInt();

        //int a = 1;

        switch (broj) {

            case 1:
                System.out.println("Odgovor je 1");
                break;
            case 2:
                System.out.println("Odgovor je 2");
                break;
            case 3:
                System.out.println("Odgovor je 3");
                break;

            default:
                System.out.println("Nista od navedenog");
        }
    }
}
