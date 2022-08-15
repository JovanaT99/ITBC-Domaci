package w3resource;
//7
import java.util.Scanner;

public class Tablica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj:");
        int broj = s.nextInt();
        System.out.println(sabiranje(broj));


    }

    public static String sabiranje(int broj) {
        for (int i = 1; i <= 10; i++) {

            System.out.println(broj + "*" + i + "=" + (broj * i));


        }

        return "";
    }


}
