import java.util.Scanner;

public class StringSwitch {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednosti A,C, G ILI T");
        String unos = s.next();


        while (unos.equals("A") || unos.equals("C") || unos.equals("G") || unos.equals("T")) {
            System.out.println("Unesite vrednosti A,C, G ILI T");
            unos = s.next();

            switch (unos) {


                case "A":
                    System.out.println("Adenin");

                    break;
                case "C":
                    System.out.println("Citozin");
                    break;
                case "G":
                    System.out.println("Guanin");
                    break;
                case "T":
                    System.out.println("Timin");
                    break;

                default:
                    System.out.println("Uneli ste pogresno");


            }


        }

    }
}
