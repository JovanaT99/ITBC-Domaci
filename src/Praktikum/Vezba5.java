package Praktikum;

import java.util.Scanner;

public class Vezba5 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite adresu");
        String adresa = s.nextLine();

        System.out.println(korisnickoIme(adresa));
        System.out.println(domen(adresa));
    }


    public static String korisnickoIme(String adresa) {


        int resenje = adresa.indexOf("@");

        return  "Korisnicko ime:" + adresa.substring(0, resenje);

    }

    public static String domen(String adresa) {

        int resenje = adresa.indexOf("@");

        return "Domen:" + adresa.substring(resenje+1);
    }


}
