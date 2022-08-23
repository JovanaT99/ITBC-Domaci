package Praktikum;

import java.util.Scanner;

public class Vezba6Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Visina:");
        int a = s.nextInt();
        //System.out.println(vratiTrougao(a));
        System.out.println(obrnutiTr(a));

    }

    public static String vratiZvedice(int a) {

        return a <= 1 ? "*\n" : "*" + vratiZvedice(a - 1);
    }


//    public static String vratiTrougao(int a) {
//
//
//        String z = "";
//        for (int i = 0; i < a; i++)
//            z += vratiZvedice(i + 1);
//        return z;
//
//    }

    public static String obrnutiTr(int a){
    StringBuilder z = new StringBuilder();
        for (int i = 0; i < a; i++)
    z.append(vratiZvedice(a - i));

        return z.toString();

}


}
