import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = s.nextInt();
        int sum = 0;
        System.out.println("Korisnik unosi: " + broj);
        for (int i = 0; i <= broj; i++){

            sum = sum + i;
        }

        System.out.println("Suma je:" + sum);
    }

}


