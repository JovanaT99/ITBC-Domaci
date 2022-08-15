import java.util.Scanner;

public class PrihodRashod {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prihod:");
        int prihod = s.nextInt();
        System.out.println("Unesite rashod:");
        int rashod = s.nextInt();


        double resenje = prihod - rashod;
        System.out.println("Profit" + resenje);

        if (prihod > rashod) {

            System.out.println("Profit je:" + resenje);
        } else {

            System.out.println("Gubitak je:" + Math.abs(resenje));
        }

    }

}
