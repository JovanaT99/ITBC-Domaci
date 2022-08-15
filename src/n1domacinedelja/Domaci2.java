package n1domacinedelja;
//Корисник може унети n бројева са тастатуре, програм се зауставља када
//        користин напише команду “stop”:
//        ● Програм проверава сваки унос корисника (сваки број који корисник
//        унесе);
//        ● Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
//        deljiv sa 2”;
//        ● Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.


import java.util.Scanner;

public class Domaci2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite brojeve:");
        String unos = s.next();


        while (!unos.equalsIgnoreCase("stop")) {

            int n = Integer.parseInt(unos);


            if (n % 2 == 0) {
                System.out.println("Broj je deljiv sa 2");

            } else {

                System.out.println("Broj nije deljiv sa 2");
            }

            unos = s.next();
        }

    }


}
