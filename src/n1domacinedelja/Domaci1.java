package n1domacinedelja;

import java.util.Scanner;

//1. Написати програм који броји кораке корисника:
//        ● Корисник се шета помоћу тастера (w-горе, a- лево, s-доле, d-десно);
//        ● Програм памти колико је корисник пута ишао горе, лево, доле и десно;
//        ● Програм се зауставља ако корисник унесе било који карактер сем
//        (w,s,a,d);
//        ● На крају програм исписује број корисникових корака ка свим странама.
public class Domaci1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unos:");
        String unos = s.next();
        int gore = 0;
        int dole = 0;
        int levo = 0;
        int desno = 0;


        while (unos.equalsIgnoreCase("w") || unos.equalsIgnoreCase("s") || unos.equalsIgnoreCase("a") || unos.equalsIgnoreCase("d")) {


            switch (unos) {
                case "w":
                    gore++;
                    //System.out.println("Gore:" + gore);
                    break;
                case "s":
                    dole++;
                    //System.out.println("Dole:" + dole);
                    break;
                case "a":
                    levo++;
                    //System.out.println("Levo:" + levo);
                    break;
                case "d":
                    desno++;
                    //System.out.println("Desno:" + desno);
                    break;


            }

            unos = s.next();

        }
        System.out.println("Izasli ste iz programa");
        System.out.println("Korisnik je isao " + gore + " puta gore, " + dole + " dole, " + levo + " levo i " + desno + " desno ");
    }


}
