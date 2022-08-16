package n1domacinedelja;

import java.util.Scanner;

//Програм креира скривени број од 0 до 100, користик има на располагању
//        максимално 10 корака да пронађе скривени број, програм, након сваког унетог
//        покушаја исписује да ли је скривени број “мањи” или “већи” од унетог броја,
//        ако је број исти исписује “Браво! Пронашли сте број!” и програм се завршава.
//        ● Програм креира насумичан (random) број од 0 до 100,помоћ - (int)
//        (Math.random() * 100); користимо класу Math са методом random() која
//        нам даје број између 0 и 1 (нпр. 0,20 ; 0,72 ...) множимо са 100 да би
//        направили број од 0 до 100;
//        ● Ако је број који је корисник унео једнак броју креираном од стране
//        рачунара исписати “Браво! Пронашли сте број!” и програм се прекида;
//        ● Након 10 покушаја програм се зауставља.
public class Domaci3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Pogodite broj:");
        int unos = s.nextInt();
        int x = (int) (Math.random() * 100);
        int brojac = 0;
       // System.out.println(x);
        while (brojac < 9) {
            if (unos == x) {


                System.out.println("Pogodili ste");
            } else if (unos > x) {

                System.out.println("Skriveni broj je manji od unosa");
                System.out.println("Trag: Sada znamo da je skriveni broj izmedju 0 i " + unos);
            } else {

                System.out.println("Skriveni broj je veci od unosa");
                System.out.println("Trag: Sada znamo da je  skriveni broj izmedju " + unos + " i 100");

            }

            brojac++;
            unos = s.nextInt();


        }

    }
}
