import java.util.Scanner;

public class ZadaciGrupa2 {

    public static void main(String[] args) {

        //a=5 b=4   a=2 b=6
        // *****     **

        //printMultiple
        //

        Scanner s = new Scanner(System.in);

       int a = s.nextInt();
       int b = s.nextInt();


        String row = repeat("#", a);   //#####
        printMultiple(row,b);


    }

    public static String repeat(String str, int n) {
        String res = " ";
        for (int i = 0; i < n; i++) {
            res += str;


        }

        return res;

    }

    public static void printMultiple(String str,int n){

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }

    }


}
