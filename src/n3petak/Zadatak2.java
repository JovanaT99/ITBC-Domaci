package n3petak;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] niz = new int[3][3];
        int diag=0;
        int diag2=0;

        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                System.out.println("Unesi ");
                niz[i][j] = s.nextInt();
                //System.out.println(niz[i][j]);

                if(i==j){
                    diag+=niz[i][j];

                }
                if(i+j== niz.length-1){
                    diag2+=niz[i][j];

                }


            }
        }
        System.out.println("Zbir dijag:" + diag);
        System.out.println("Zbir dijag:" + diag2);



    }
}
