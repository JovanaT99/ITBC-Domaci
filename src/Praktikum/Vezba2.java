package Praktikum;

import java.util.Scanner;

public class Vezba2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite visinu u cm:");
        int visina = s.nextInt();
        System.out.println("Unesite telesnu masu u kg:");
        int telesnaMasa = s.nextInt();
        double visinaMetar = visina / 100.0;

        double indexTelesneMase = telesnaMasa / (visinaMetar * visinaMetar);

        if (indexTelesneMase < 18.5) {

            System.out.println("Neuhrahnjenost." + "BMI je:" + indexTelesneMase);
        } else if (indexTelesneMase < 25) {

            System.out.println("normalna uhranjenost");
        } else if (indexTelesneMase < 30) {

            System.out.println("Pregojaznost");
        } else {

            System.out.println("Gojaznost");

        }

    }
}

