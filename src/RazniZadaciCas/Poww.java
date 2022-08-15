package RazniZadaciCas;

import java.util.Scanner;

public class Poww {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
    }


   public static int Stepen(int x, int n) {

        int res=1;


        for(int i=0; i<n; i++){


            res*=x;

        }

        return res;
   }



}
