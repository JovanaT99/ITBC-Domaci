package w3resource;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj=s.nextInt();
        System.out.println(evenOdd(broj));
    }




    public static int evenOdd(int broj){
         if(broj %2==0){

             return 1;
         }
         else{
             return 0;
         }






    }
}
