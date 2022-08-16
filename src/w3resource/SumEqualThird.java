package w3resource;
//52
import java.util.Scanner;

public class SumEqualThird {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int prvi=s.nextInt();
        int drugi=s.nextInt();
        int treci=s.nextInt();
        boolean rezultat=true;
        System.out.println(equalthird(prvi,drugi,treci,rezultat));

    }

    public static boolean equalthird(int prvi, int drugi,int treci, boolean rezultat){

        int zbir=prvi+drugi;
        if(treci==zbir){


            return rezultat;
        }

        return false;

    }
}
